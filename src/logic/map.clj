(ns logic.map
  (:require [logic.random-formula :as rf]
            [logic.formula :as f]
            [logic.write-formula :as wf]
            [logic.quine-table :as qt]
            [logic.subformula :as sf])
  (:gen-class))

;; # Karnaugh map
;; ## Helper functions

(defn diff-implicants
  "Distance of two implicant `xs` and `ys`, 
  where _xi_, _yi_ in {0, 1, :x},
  and _:x_ denote don't care element.
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
  "Merge two implicants `xs` and `ys`:
  replace the only differing point with :x."
  [xs ys]
  (vec
    (for [[i x] (map-indexed vector xs)]
      (if (= x (ys i)) x :x))))

(defn combine-all-implicants
  "Merge a set of implicants `ss` with themself."
  [ss]
  (set
    (let [xs (vec ss), l (count xs)]
      (for [i (range 0 l), j (range 0 l)
            :when (and (< i j) (= 1 (diff-implicants (xs i) (xs j))))]
        (combine-implicants (xs i) (xs j))))))

(comment (combine-all-implicants #{[0 1] [0 0] [1 0]}))

(defn hide?
  "The implicant `cs` hide the implicant `xs`?

  (`cs` is more general than `xs`, contains less variables,
  `cs` is logical consequence of `xs`.)"
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
  "List of implicants `xs` from list `xss` for which _xs|=cs_ doesn't hold,
  where `cs` is a consquence implicant."
  [cs xss]
  (filter (complement #(hide? cs %)) xss))

(defn covers
  "Set of consequences of prime implicant `xs` from set of prime implicants `css`."
  [xs css]
   (filter #(hide? % xs) css))

(defn to-binary
  "Convert a natural number `n` into a binary vector of length `size`."
  ([n size]
   (to-binary n size []))
  ([n size vs]
   (if (= size 1)
     (vec (reverse (conj vs n)))
     (recur (quot n 2) (dec size) (conj vs (mod n 2))))))

(defn terms
  "Minterms or maxterms for a given code `c`,
  where we have `vars` number of parameterers,
  and look for `char` chars in the binary representation."
  [c vars char]
  (let [l (f/** 2 vars),
        mc (qt/truth-table-main-column c l)]
    (loop [i 0, es []]
      (if (< i l)
        (if (= char (get mc i))
          (recur (inc i) (conj es (to-binary i vars)))
          (recur (inc i) es))
        es))))

(defn minterms
  "Minterms (product) of a given code `c` with `vars` parameterers."
  [c vars]
  (terms c vars \1))

(defn maxterms
  "Maxterms (clauses, sum) of a given code `c` with `vars` parameters."
  [c vars]
  (terms c vars \0))

(defn str-term
  "String representation of a minterm/maxterm, where `pi` is its vector representation,
  `op` is the inner operator, `neg`/`pos` is the value denotes negative/positive literals."
  [pi op neg pos]
  (let [predicates ["p" "q" "r" "s"]
        string (clojure.string/join
                 op
                 (filter
                   identity ; to delete nils
                   (for [[i p] (map-indexed vector pi)]
                     (cond
                       (= neg p) (str "\\lnot " (predicates i))
                       (= pos p) (predicates i)))))]
    (if (= 1 (count (filter integer? pi)))
      string
      (str "(" string ")"))))

(defn str-prod
  "String representation of the 'product' (minterm)."
  [pi]
  (str-term pi " \\land " 0 1))

(defn str-sum
  "String representation of the 'sum' (maxterm)."
  [pi]
  (str-term pi " \\lor " 1 0))

(defn disjunct?
  "Are two lists `es` and `ps` of implicants disjunct?"
  [es ps]
  (not (some (fn [e] (some #(= e %) ps)) es)))

(defn disjunct-minterms
  "Select the elements of a map `m-c` independent from given prime implicants `ps`."
  [m-c ps]
  (filter #(disjunct? ps (second %)) m-c))

(defn km
  "SOP/DNF Karnaugh map, where `mt` is the vector of minterms/maxterms."
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
  "SOP/DNF Karnaugh map, where `code` is the code of the formula,
  `vars` is the number of variables in the formula"
  [code vars]
  (clojure.string/join
    " \\lor "
    (map str-prod (km (minterms code vars)))))

(defn km-cnf
  "POS/CNF Karnaugh map, where `code` is the code of the formula,
  `vars` is the number of variables in the formula"
  [code vars]
  (clojure.string/join
    " \\land "
    (map str-sum (km (maxterms code vars)))))

;; ## Canonical normal form questions

(defn canonical-normal-form
  "Generate the canonical normal form question for a random formula with `vars` variables.
  `term` and `normal-form` are words conjunctive/disjunktive;
  `pf`, `g` and `h` are functions to write the terms, and generate good and wrong answers."
  [vars term normal-form pf g h]
  (let [f (rf/random-formula 5 (vec (take vars [:p :q :r :s :t]))),
        code (qt/code3 f)
        mc (qt/truth-table-main-column code (f/** 2 vars))
        good (g code vars)
        bad (h code vars)]
    (str " {:question \"A felsoroltak közül mely elemi " term " szerepelnek a \\\\( "
         (wf/write-out f)
         " \\\\) formulának teljes " normal-form " normálformájában?\"\n"
         "  :feedback \"a formula főoszlopának tartalma: " mc " \"\n"
         "  :good [\n"
         (apply str (map #(format "    \"\\\\( %s \\\\)\"\n" (pf %)) good))
         "  ]\n  :wrong [\n"
         (apply str (map #(format "    \"\\\\( %s \\\\)\"\n" (pf %)) bad))
        "  ]}\n")))

(defn cdnf3
  "Canonical disjunctive normal form with 3 variables."
  []
  (canonical-normal-form 3 "konjunkciók" "diszjunktív" str-prod minterms maxterms))

(defn ccnf3
  "Canonical conjunctive normal form with 3 variables."
  []
  (canonical-normal-form 3 "diszjunkciók" "konjunktív" str-sum maxterms minterms))


(comment (sf/to-file 20 ccnf3 "cknf.clj"))
(comment (sf/to-file 20 cdnf3 "cdnf.clj"))

;; ## Minimal DNF/CNF form

(defn- str-normal-form
  "String representation of a normal form with code `c`,
  where `f` is the function generate the normal form,
  and `v` is the number of variables."
  [c f v]
  (str "\\( " (f c v) " \\)"))

(defn- str-truth-table
  "String representation of a main column of a formula with code `c` with length `n`."
  [c n]
  (str "az igazságtáblázat főoszlopa: \\( " (qt/truth-table-main-column c n) " \\)" ))

(defn- similar-codes
  "Given a code `c`, find similar codes, which are differs in a bit;
  where coll is a vector of 2 powers."
  [c coll]
  (let [random-list (shuffle coll)
        c1 (bit-xor c (coll 0))
        c2 (bit-xor c (coll 1))
        c3 (bit-xor c (coll 2))]
    [c1 c2 c3]))
(defn nf3
  "Normal form question with 3 variables, 
  where `id` identifier of the generated question,
  "
  [id kmf id-str nf-str]
  (let [f (rf/random-formula 5 [:p :q :r])
        p (count (qt/parameters f))
        code0 (qt/code3 f)]
    (if (and (= p 3) (< 0 code0 255))
      (let [[code1 code2 code3] (similar-codes code0 [1 2 4 8 16 32 64 128]),
            nf0 (str-normal-form code0 kmf 3), nf1 (str-normal-form code1 kmf 3),
            nf2 (str-normal-form code2 kmf 3), nf3 (str-normal-form code3 kmf 3),
            fb0 (str-truth-table code0 8), fb1 (str-truth-table code1 8),
            fb2 (str-truth-table code2 8), fb3 (str-truth-table code3 8),
            i (str id-str (inc id)),
            q (str "A \\(" (wf/write-short f)
                   "\\) formulának az alábbiak közül melyik a "
                   nf-str " alakja?"),
            a [[nf0 100.00] [nf1 -33.3333 fb1]
               [nf2 -33.3333 fb2][nf3 -33.3333 fb3]] ]
         [q a i fb0])
       nil)))

(defn dnf3
  "dnf question with 3 variables"
  [id]
  (nf3 id km-dnf "DNF2-" "DNF"))

(defn cnf3
  "cnf question with 3 variables"
  [id]
  (nf3 id km-cnf "CNF2-" "CNF"))

;; ## Karnaugh map questions

(defn write-map-row
  "Write one line of the Karnaugh map.
  The `head` is the row title on left, 
  `coll` is the content of the table in natural order."
  
  [head coll i1 i2 i3 i4]
  (str "<tr><th scope=\"row\">" head
       "</th><td style=\"text-align: center;\">" (get coll i1)
       "</td><td style=\"text-align: center;\">" (get coll i2)
       "</td><td style=\"text-align: center;\">" (get coll i3)
       "</td><td style=\"text-align: center;\">" (get coll i4)
       "</td></tr>\n"))

(defn table-head
  "Head part of a HTML table. `v1` and `v2` are the name of variables."
  [v1 v2 norm-form]
  (str "<p>Az alábbi Karnaugh táblázathoz melyik " norm-form " tartozik?</p>"
       "<table><thead>"
       "<th scope=\"col\"></th>"
       "<th scope=\"col\">-" v1 "-" v2 "</th>"
       "<th scope=\"col\">-" v1 "+" v2 "</th>"
       "<th scope=\"col\">+" v1 "+" v2 "</th>"
       "<th scope=\"col\">+" v1 "-" v2 "</th></tr>\n</thead><tbody>"))

(defn km4-nf
  "Karnaugh map quiz with 3 variables,
  where `id` is the identifier of the question,
  `kmf` is the function generates the solution;
  `normal-form` and `id-nf` are strings."
  [id kmf normal-form id-nf]
  (let [code0 (inc (rand-int 65534))
        [code1 code2 code3] (similar-codes code0 [1 2 4 8 16 32 64 128 256 512 1024 2048 4096 8192 16384])
        col (qt/truth-table-main-column code0 16)
        nf0 (str-normal-form code0 kmf 4), nf1 (str-normal-form code1 kmf 4),
        nf2 (str-normal-form code2 kmf 4), nf3 (str-normal-form code3 kmf 4),
        q (str (table-head "r" "s" normal-form)
               (write-map-row "-p-q" col 0 1 3 2)
               (write-map-row "-p+q" col 4 5 7 6)
               (write-map-row "+p+q" col 12 13 15 14)
               (write-map-row "+p-q" col 8 9 11 10)
               "</tbody></table>")
        i (str id-nf (inc id))
        a [[nf0 100.00] [nf1 -33.3333] [nf2 -33.3333] [nf3 -33.3333]]
        fb ""]
     [q a i fb]))

(defn km4-dnf
  "Karnaugh map quiz with 4 variables"
  [id]
  (km4-nf id km-dnf "DNF" "DNF4-"))

(defn km4-cnf
  "Karnaugh map quiz with 4 variables"
  [id]
  (km4-nf id km-cnf "CNF" "CNF4-"))

(defn km3-nf
  "Karnaugh map quiz with 3 variables,
  where `id` is the identifier of the question,
  `kmf` is the function generates the solution;
  `normal-form` and `id-nf` are strings."
  [id kmf normal-form id-nf]
  (let [code0 (inc (rand-int 254))
        [code1 code2 code3] (similar-codes code0 [1 2 4 8 16 32 64 128]),
        col (qt/truth-table-main-column code0 8),
        nf0 (str-normal-form code0 kmf 3), nf1 (str-normal-form code1 kmf 3),
        nf2 (str-normal-form code2 kmf 3), nf3 (str-normal-form code3 kmf 3),
        q (str (table-head "q" "r" normal-form)
               (write-map-row "-p" col 0 1 3 2)
               (write-map-row "+p" col 4 5 7 6)
               "</tbody></table>"),
        i (str id-nf (inc id)),
        a [[nf0 100.00] [nf1 -33.3333] [nf2 -33.3333] [nf3 -33.3333]],
        fb ""]
     [q a i fb]))

(defn km3-dnf
  "Karnaugh map quiz with 3 variables"
  [id]
  (km3-nf id km-dnf "DNF" "DNF3-"))

(defn km3-cnf
  "Karnaugh map quiz with 3 variables"
  [id]
  (km3-nf id km-cnf "CNF" "CNF3-"))

;; vim : fdm=syntax
