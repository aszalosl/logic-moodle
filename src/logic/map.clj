(ns logic.map
  (:require [logic.random-formula :as rf]
            [logic.formula :as f]
            [logic.write-formula :as wf]
            [logic.quine-table :as qt]
            [logic.subformula :as sf])
  (:gen-class))

;; Karnaugh map

(defn diff-implicants
  "Distance of two implicant, where xi, yi in {0, 1, :x},
  and :x denote don't care element.
  If they don't match, the diff is a big number."
  [xs ys]
  (let [l (count xs)]
    (loop [i 0
           c 0]
      (if (< i l)
        (let [xi (xs i), yi (ys i)]
          (if (or (and (= xi 0) (= yi 1))
                  (and (= xi 1) (= yi 0)))
             (recur (inc i) (inc c)) ; they differ
             (if (= xi yi)
               (recur (inc i) c) ; no difference
               1000))) ;; some big number, not 1
        c))))

(defn combine-implicants
  "Merge two implicants: replace the differing point with :x."
  [xs ys]
  (vec
    (for [[i x] (map-indexed vector xs)]
      (if (= x (ys i)) x :x))))

(defn combine-all-implicants
  "Merge a set of implicants with themself."
  [ss]
  (set
    (let [xs (vec ss), l (count xs)]
      (for [i (range 0 l), j (range 0 l)
            :when (and (< i j) (= 1 (diff-implicants (xs i) (xs j))))]
        (combine-implicants (xs i) (xs j))))))

(comment (combine-all-implicants #{[0 1] [0 0] [1 0]}))

(defn hide?
  "The implicant cs hide the implicant xs?
  (cs is more general than xs, contains less variables,
  cs is logical consequence of xs)"
  [cs xs]
  (let [l (count cs)]
    (loop [i 0]
      (if (< i l)
        (if (or (= :x (cs i))
                (= (cs i) (xs i)))
          (recur (inc i))
          false)
        true))))

(defn visible
  "List of implicants xs for which xs|=cs doesn't hold.
  Args: cs - consquence implicant
        xss - list of implicants (hypotheses)"
  [cs xss]
  (filter (complement #(hide? cs %)) xss))

(defn covers
  "Set of consequences of prime implicant xs from set of prime implicants css."
  [xs css]
   (filter #(hide? % xs) css))

(defn to-binary
  "Convert a natural number into a binary vector.
  Args: n - the number
        size - length of the vector"
  ([n size]
   (to-binary n size []))
  ([n size vs]
   (if (= size 1)
     (vec (reverse (conj vs n)))
     (recur (quot n 2) (dec size) (conj vs (mod n 2))))))

(defn terms
  "Minterms or maxterms for a given code.
  Args: code - the code of the formula
        vars - number of parameters"
  [code vars char]
  (let [l (f/** 2 vars),
        mc (qt/truth-table-main-column code l)]
    (loop [i 0, es []]
      (if (< i l)
        (if (= char (get mc i))
          (recur (inc i) (conj es (to-binary i vars)))
          (recur (inc i) es))
        es))))

(defn minterms
  "minterms (product) of a given code"
  [code vars]
  (terms code vars \1))

(defn maxterms
  "maxterms (clauses, sum) of a given code"
  [code vars]
  (terms code vars \0))

(defn str-prod
  "String representation of the 'product'."
  [pi]
  (let [predicates ["p" "q" "r" "s"]
        string (clojure.string/join
                  " \\land "
                  (filter
                    identity ; to delete nils
                    (for [[i p] (map-indexed vector pi)]
                      (cond
                        (= 0 p) (str "\\lnot " (predicates i))
                        (= 1 p) (predicates i)))))]
    (if (= 1 (count (filter integer? pi)))
      string
      (str "(" string ")"))))

(defn str-sum
  "String representation of the 'sum'."
  [pi]
  (let [predicates ["p" "q" "r" "s"]
        string (clojure.string/join
                  " \\lor "
                  (filter
                    identity   ; to delete nils
                    (for [[i p] (map-indexed vector pi)]
                      (cond
                        (= 1 p) (str "\\lnot " (predicates i))
                        (= 0 p) (predicates i)))))]
    (if (= 1 (count (filter integer? pi)))
      string
      (str "(" string ")"))))

(defn disjunct
  "The two lists are disjunct.
  Args: es - list of implicants
        ps - list of implicants"
  [es ps]
  (not (some (fn [e] (some #(= e %) ps)) es)))

(defn disjunct-minterms
  "Args: m-c - minterm-set of consequences map
         ps - set of prime implicants."
  [m-c ps]
  (filter #(disjunct ps (second %)) m-c))

(defn km
  "SOP/DNF Karnaugh map.
  Args: mt - vector of minterms/maxterms"
  [mt]
  (let [i2 (combine-all-implicants mt),   ; imp. w 2 m.terms
        i4 (combine-all-implicants i2),   ; imp. w 4 m.terms
        i8 (combine-all-implicants i4),   ; imp. w 8 m.terms
        is (into [] (concat i2 i4 i8)),   ; all the non-triv. impl.
        cs (map #(covers % is) mt),       ; the set of impl. cover a m.term
        mt-cs (zipmap mt cs),
        e1 (keys (filter #(empty? (second %)) mt-cs)),  ; separated m.terms.
        e2 (map first (vals (filter #(= 1 (count (second %))) mt-cs))),  ; uniq imp.
        other (keys (disjunct-minterms mt-cs e2))]   ; remaining m.terms
    (loop [rmt other, si (reverse is), e3 []]
      (if (and (seq rmt) (seq si))
        (if (some true? (map #(hide? (first si) %) rmt))
          (recur
            (visible (first si) rmt)
            (rest si)
            (conj e3 (first si)))
          (recur rmt (rest si) e3))
        (into #{} (concat e1 e2 e3))))))

(defn km-dnf
  "SOP/DNF Karnaugh map.
  Args: code - the code of the formula
        vars - number of variables in the formula"
  [code vars]
  (clojure.string/join
    " \\lor "
    (map str-prod (km (minterms code vars)))))

(defn km-cnf
  "SOP/DNF Karnaugh map.
  Args: code - the code of the formula
        vars - number of variables in the formula"
  [code vars]
  (clojure.string/join
    " \\land "
    (map str-sum (km (maxterms code vars)))))

(comment (km-dnf 122 3))
(comment (km-cnf 122 3))

;; ## Canonical normal forms

(defn cdnf3
  "canonical disjunctive normal form"
  []
  (let [f (rf/random-formula 5 [:p :q :r]),
        code (qt/code3 f)
        mc (qt/truth-table-main-column code 8)
        mins (minterms code 3)
        maxs (maxterms code 3)]
    (str " {:question \"A felsoroltak közül mely elemi konjunkciók szerepelnek a \\\\( "
         (wf/write-out f)
         " \\\\) formulának teljes diszjunktív normálformájában?\"\n"
         "  :feedback \"a formula főoszlopának tartalma: " mc " \"\n"
         "  :good [\n"
         (apply str (map #(format "    \"\\\\( %s \\\\)\"\n" (str-prod %)) mins))
         "  ]\n  :wrong [\n"
         (apply str (map #(format "    \"\\\\( %s \\\\)\"\n" (str-prod %)) maxs))
         "  ]}\n")))

(defn ccnf3
  "canonical conjunctive normal form"
  []
  (let [f (rf/random-formula 5 [:p :q :r]),
        code (qt/code3 f)
        mc (qt/truth-table-main-column code 8)
        mins (minterms code 3)
        maxs (maxterms code 3)]
    (str " {:question \"A felsoroltak közül mely elemi diszjunkciók szerepelnek a \\\\( "
         (wf/write-out f)
         " \\\\) formulának teljes konjunktív normálformájában?\"\n"
         "  :feedback \"a formula főoszlopának tartalma: " mc " \"\n"
         "  :good [\n"
         (apply str (map #(format "    \"\\\\( %s \\\\)\"\n" (str-sum %)) maxs))
         "  ]\n  :wrong [\n"
         (apply str (map #(format "    \"\\\\( %s \\\\)\"\n" (str-sum %)) mins))
         "  ]}\n")))

(comment (sf/to-file 20 ccnf3 "cknf.clj"))
(comment (sf/to-file 20 cdnf3 "cdnf.clj"))


(defn dnf3
  "dnf question with 3 variables"
  [id]
  (let [f (rf/random-formula 5 [:p :q :r])
        p (count (qt/parameters f))
        code0 (qt/code3 f)]
    (if (and (= p 3) (< 0 code0 255))
      (let [
            others (shuffle [1 2 4 8 16 32 64 128])
            code1 (bit-xor code0 (others 0))
            code2 (bit-xor code0 (others 1))
            code3 (bit-xor code0 (others 2))
            dnf0 (str "\\( " (km-dnf code0 3) " \\)")
            dnf1 (str "\\( " (km-dnf code1 3) " \\)")
            dnf2 (str "\\( " (km-dnf code2 3) " \\)")
            dnf3 (str "\\( " (km-dnf code3 3) " \\)")
            fb0 (str "az igazságtáblázat főoszlopa: \\( " (qt/truth-table-main-column code0 8) " \\)" )
            fb1 (str "az igazságtáblázat főoszlopa: \\( " (qt/truth-table-main-column code1 8) " \\)" )
            fb2 (str "az igazságtáblázat főoszlopa: \\( " (qt/truth-table-main-column code2 8) " \\)" )
            fb3 (str "az igazságtáblázat főoszlopa: \\( " (qt/truth-table-main-column code3 8) " \\)" )
            i (str "DNF2-" (inc id))
            q (str "A \\(" (wf/write-short f) "\\) formulának az alábbiak közül melyik a DNF alakja?")
            a [[dnf0 100.00] [dnf1 -33.3333 fb1] [dnf2 -33.3333 fb2] [dnf3 -33.3333 fb3]] ]
         [q a i fb0])
       nil)))

(defn cnf3
  "cnf question with 3 variables"
  [id]
  (let [f (rf/random-formula 5 [:p :q :r])
        p (count (qt/parameters f))
        code0 (qt/code3 f)]
    (if (and (= p 3) (< 0 code0 255))
      (let [
            others (shuffle [1 2 4 8 16 32 64 128])
            code1 (bit-xor code0 (others 0))
            code2 (bit-xor code0 (others 1))
            code3 (bit-xor code0 (others 2))
            cnf0 (str "\\( " (km-cnf code0 3) " \\)")
            cnf1 (str "\\( " (km-cnf code1 3) " \\)")
            cnf2 (str "\\( " (km-cnf code2 3) " \\)")
            cnf3 (str "\\( " (km-cnf code3 3) " \\)")
            fb0 (str "az igazságtáblázat főoszlopa: \\( " (qt/truth-table-main-column code0 8) " \\)" )
            fb1 (str "az igazságtáblázat főoszlopa: \\( " (qt/truth-table-main-column code1 8) " \\)" )
            fb2 (str "az igazságtáblázat főoszlopa: \\( " (qt/truth-table-main-column code2 8) " \\)" )
            fb3 (str "az igazságtáblázat főoszlopa: \\( " (qt/truth-table-main-column code3 8) " \\)" )
            i (str "CNF2-" (inc id))
            q (str "A \\(" (wf/write-short f) "\\) formulának az alábbiak közül melyik a KNF alakja?")
            a [[cnf0 100.00] [cnf1 -33.3333 fb1] [cnf2 -33.3333 fb2] [cnf3 -33.3333 fb3]] ]
         [q a i fb0])
       nil)))

(defn write-map-row
  "write one line of the Karnaugh map"
  [head v1 v2 v3 v4]
  (str "<tr><th scope=\"row\">" head 
       "</th><td style=\"text-align: center;\">" v1 
       "</td><td style=\"text-align: center;\">" v2 
       "</td><td style=\"text-align: center;\">" v3 
       "</td><td style=\"text-align: center;\">" v4 "</td></tr>\n"))

(defn km4-dnf
  "Karngaugh map quiz with 4 variables"
  [id]
  (let [c (inc (rand-int 65534))
        col (qt/truth-table-main-column c 16)
        others (shuffle [1 2 4 8 16 32 64 128 256 512 1024 2048 4096 8192 16384])
        code1 (bit-xor c (others 0))
        code2 (bit-xor c (others 1))
        code3 (bit-xor c (others 2))
        dnf0 (str "\\( " (km-dnf c 4) " \\)")
        dnf1 (str "\\( " (km-dnf code1 4) " \\)")
        dnf2 (str "\\( " (km-dnf code2 4) " \\)")
        dnf3 (str "\\( " (km-dnf code3 4) " \\)")
        q (str "<p>Az alábbi Karnaugh táblázathoz melyik DNF tartozik?</p>"
               "<table><thead><th scope=\"col\"></th><th scope=\"col\">-r-s</th>"
               "<th scope=\"col\">-r+s</th><th scope=\"col\">+r+s</th>"
               "<th scope=\"col\">+r-s</th></tr>\n</thead><tbody>"
               (write-map-row "-p-q" (get col  0) (get col  1) (get col   3) (get col  2))
               (write-map-row "-p+q" (get col  4) (get col  5) (get col   7) (get col  6))
               (write-map-row "+p+q" (get col 12) (get col 13) (get col  15) (get col 14))
               (write-map-row "+p-q" (get col  8) (get col  9) (get col  11) (get col 10))
               "</tbody></table>")
        i (str "DNF4-" (inc id))
        a [[dnf0 100.00] [dnf1 -33.3333] [dnf2 -33.3333] [dnf3 -33.3333]]
        fb ""]
     [q a i fb]))

(defn km3-dnf
  "Karngaugh map quiz with 3 variables"
  [id]
  (let [c (inc (rand-int 254))
        col (qt/truth-table-main-column c 8)
        others (shuffle [1 2 4 8 16 32 64 128])
        code1 (bit-xor c (others 0))
        code2 (bit-xor c (others 1))
        code3 (bit-xor c (others 2))
        dnf0 (str "\\( " (km-dnf c 3) " \\)")
        dnf1 (str "\\( " (km-dnf code1 3) " \\)")
        dnf2 (str "\\( " (km-dnf code2 3) " \\)")
        dnf3 (str "\\( " (km-dnf code3 3) " \\)")
        q (str "<p>Az alábbi Karnaugh táblázathoz melyik DNF tartozik?</p>"
               "<table><thead><th scope=\"col\"></th><th scope=\"col\">-q-r</th>"
               "<th scope=\"col\">-q+r</th><th scope=\"col\">+q+r</th>"
               "<th scope=\"col\">+q-r</th></tr>\n</thead><tbody>"
               (write-map-row "-p" (get col  0) (get col  1) (get col   3) (get col  2))
               (write-map-row "+p" (get col  4) (get col  5) (get col   7) (get col  6))
			   "</tbody></table>")
        i (str "DNF3-" (inc id))
        a [[dnf0 100.00] [dnf1 -33.3333] [dnf2 -33.3333] [dnf3 -33.3333]]
        fb ""]
     [q a i fb]))

(defn km4-cnf
  "Karngaugh map quiz with 4 variables"
  [id]
  (let [c (inc (rand-int 65534))
        col (qt/truth-table-main-column c 16)
        others (shuffle [1 2 4 8 16 32 64 128 256 512 1024 2048 4096 8192 16384])
        code1 (bit-xor c (others 0))
        code2 (bit-xor c (others 1))
        code3 (bit-xor c (others 2))
        cnf0 (str "\\( " (km-cnf c 4) " \\)")
        cnf1 (str "\\( " (km-cnf code1 4) " \\)")
        cnf2 (str "\\( " (km-cnf code2 4) " \\)")
        cnf3 (str "\\( " (km-cnf code3 4) " \\)")
        q (str "<p>Az alábbi Karnaugh táblázathoz melyik DNF tartozik?</p>"
               "<table><thead><th scope=\"col\"></th><th scope=\"col\">-r-s</th>"
               "<th scope=\"col\">-r+s</th><th scope=\"col\">+r+s</th>"
               "<th scope=\"col\">+r-s</th></tr>\n</thead><tbody>"
               (write-map-row "-p-q" (get col  0) (get col  1) (get col   3) (get col  2))
               (write-map-row "-p+q" (get col  4) (get col  5) (get col   7) (get col  6))
               (write-map-row "+p+q" (get col 12) (get col 13) (get col  15) (get col 14))
               (write-map-row "+p-q" (get col  8) (get col  9) (get col  11) (get col 10))
               "</tbody></table>")
        i (str "DNF4-" (inc id))
        a [[cnf0 100.00] [cnf1 -33.3333] [cnf2 -33.3333] [cnf3 -33.3333]]
        fb ""]
     [q a i fb]))

(defn km3-cnf
  "Karngaugh map quiz with 3 variables"
  [id]
  (let [c (inc (rand-int 254))
        col (qt/truth-table-main-column c 8)
        others (shuffle [1 2 4 8 16 32 64 128])
        code1 (bit-xor c (others 0))
        code2 (bit-xor c (others 1))
        code3 (bit-xor c (others 2))
        cnf0 (str "\\( " (km-cnf c 3) " \\)")
        cnf1 (str "\\( " (km-cnf code1 3) " \\)")
        cnf2 (str "\\( " (km-cnf code2 3) " \\)")
        cnf3 (str "\\( " (km-cnf code3 3) " \\)")
        q (str "<p>Az alábbi Karnaugh táblázathoz melyik DNF tartozik?</p>"
               "<table><thead><th scope=\"col\"></th><th scope=\"col\">-q-r</th>"
               "<th scope=\"col\">-q+r</th><th scope=\"col\">+q+r</th>"
               "<th scope=\"col\">+q-r</th></tr>\n</thead><tbody>"
               (write-map-row "-p" (get col  0) (get col  1) (get col   3) (get col  2))
               (write-map-row "+p" (get col  4) (get col  5) (get col   7) (get col  6))
			   "</tbody></table>")
        i (str "DNF3-" (inc id))
        a [[cnf0 100.00] [cnf1 -33.3333] [cnf2 -33.3333] [cnf3 -33.3333]]
        fb ""]
     [q a i fb]))

