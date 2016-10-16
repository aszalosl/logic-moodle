;;;; The simplest tests are about sets.

(ns logic.set
  (:require [clojure.string :as s]
            [clojure.set :as cs]
            [logic.common :as cmn])
  (:gen-class))

;; ### Generate set-expressions
;;
;; We have five operations: complement, intersection, union, set difference
;; and symmetric difference.
;; At generation we use all the combinations of the starting sets

(defn combine "combine the elements of two sets with all operators"
  [s1 s2]
  (for [x s1, y s2, op [:isect :union :diff :symdiff]]
    [op x y]))

(defn complement-sets "generate the complement sets"
  [s]
  (for [x s]
    [:comp x]))

(defn s1 "set expressions with one operator"
  [s0]
  (concat
    (combine s0 s0)
    (complement-sets s0)))

(defn s2 "set expressions with 2 operators"
  [s]
  (let [s1s (s1 s)]
    (concat
      (combine s s1s)
      (combine s1s s)
      (complement-sets s1s))))

(defn s3 "set expressions with 3 operators"
  [s]
  (let [s1s (s1 s)
        s2s (s2 s)]
    (concat
      (combine s s2s)
      (combine s1s s1s)
      (combine s2s s)
      (complement-sets s2s))))

;; ### Write set expressions
;;
;; Moodle uses MathJax, so we replace the operators with
;; their TeX equivalent in the output.

(defn write "from a structure we generate a string"
  ([e] (write e false))
  ([e outer]
   (if (vector? e)
     (let [op (first e)]
       (if (= :comp op)
         (str "\\overline{" (write (second e) false) "}")
         (let [wop (case op :isect "\\cap " :union "\\cup "
                    :diff "\\backslash " :symdiff "\\Delta ")
               w1 (write (second e) true)
               w2 (write (nth e 2) true)]
          (if outer
            (str "(" w1 wop w2 ")")
            (str w1 wop w2)))))
    (case e :a "A" :b "B" :c "C" :0 "\\emptyset"))))

;; ### Calculate the code of a set expression
;;
;; We code each subset with a 2-power.
;; If we have 3 sets, we got 8 subsets.
;; The code of each set is the sum of its subsets' code.

(def setA (+ 1 2  4  8))
(def setB (+ 4 8 32 64))
(def setC (+ 2 8 16 64))
(def set0 0)

;; The code of the universal set (needed for the complement of a set)
;; is the sum of all codes.

(def code-uni 255)

;; In the case of 2 sets, we have only 4 subsets.

; (def setA (+ 1 2))
; (def setB (+ 2 4))
; (def code-uni 15)

;; We follow the structure of the expression,
;; and apply the corresponding bit-operation to the arguments.

(defn calculate
  [e]
  (if (vector? e)
    (let [op (first e)
          k1 (calculate (second e))]
      (if (= :comp op)
        (- code-uni k1)
        (let [k2 (calculate (nth e 2))]
          (case op
            :isect   (bit-and k1 k2)
            :union   (bit-or  k1 k2)
            :diff    (bit-and k1 (- code-uni k2))
            :symdiff (bit-xor k1 k2)))))
    (case e  :a setA, :b setB, :c setC :0 set0)))

;; We grouping expressions by their code.
;; At first we need a filter which select expressions with a given key.

(defn set-filter
  [key sets]
  (filter #(= (calculate %) key) sets))

(defn keys-and-set-of-sets "list of vectors of keys and list of corresponding sets"
  [sets]
  (for [key (range 0 code-uni)
        :let [s (set-filter key sets)]
        :when (and (seq s) (seq (rest s)))] ; we got a list
    [key s]))

;; We assume that at introductory examples 3 connectives are enough.

(def all-sets "all the keys and corresponding expressions"
  (let [start [:a :b :c]]
    (keys-and-set-of-sets (concat start (s1 start) (s2 start) (s3 start)))))

;; ### Generate matching problem from keys

(defn expression-pairs "randomly select 5 pair from the list above"
  []
  (map #(cons (first %) (take 2 (shuffle (second %))))
    (take 5 (shuffle all-sets))))

(defn make-listing "from a list of expressions create a listing" [ep]
    (map #(str "<li>\\(" (write (second %)) "\\)</li>") ep))

;; Due the limitations of Moodle, we cannot put formulae
;; into answers of matching question, just regular text or numbers.
;; Hence we list the options inside the text of the question

(defn make-pairing-question-text [ep]
  (str "<p>Adottak az alábbi halmazok:</p><ol>"
    (s/join (make-listing ep))
    "</ol><p>az alább felsorolt halmazok esetén adja meg,"
      " hogy azok ezek közül melyikkel esnek egybe!</p>"))

(defn make-pairing-answers "the matching expressions" [ep]
  (map #(write (nth % 2)) ep))

(defn colored "In the feedback we list the regions are part
               of the solution. We check it here."
  [i a]
  (if (pos? (bit-and i (first a))) "X" "-"))

(defn make-feedback-text "We list the corresponding expressions,
                     and their structure in a HTML table."
  [ep]
  (map #(str "<p>\\(" (write (second %)) "\\) és \\(" (write (nth % 2))
             "\\)</p><br><table align=\"center\" border=\"1\"><tbody><tr>"
             "<td>-A</td><td>-A</td><td>-A</td><td>-A</td>"
             "<td>+A</td><td>+A</td><td>+A</td><td>+A</td></tr>"
             "<tr><td>-B</td><td>-B</td><td>+B</td><td>+B</td>"
             "<td>-B</td><td>-B</td><td>+B</td><td>+B</td></tr>"
             "<tr><td>-C</td><td>+C</td><td>-C</td><td>+C</td>"
             "<td>-C</td><td>+C</td><td>-C</td><td>+C</td></tr><tr>"
             "<td>" (colored 128 %) "</td>"
             "<td>" (colored 16 %) "</td>"
             "<td>" (colored 32 %) "</td>"
             "<td>" (colored 64 %) "</td>"
             "<td>" (colored 1 %) "</td>"
             "<td>" (colored 2 %) "</td>"
             "<td>" (colored 4 %) "</td>"
             "<td>" (colored 8 %) "</td>"
             "</tbody></table>") ep))

(defn set-matching-question  "generate question, answers, and feedback"
  [i]
  (let [ep (expression-pairs)
        question (make-pairing-question-text ep)
        answers (make-pairing-answers ep)
        id (str "HP3-" i)
        ft (s/join (make-feedback-text ep))]
       [question answers id ft]))


;; ### Easy calculation with sets
;;
;; We generate sets, and ask the members of a set expression.

(def U "Our universe (base set) is the positive numbers until 10."
  (set (range 1 11)))

(defn generate-set "generate a subset of U"
  []
  (set (take 5 (shuffle (range 1 11)))))

(defn set-value "We use set operations to determine the value of the
                 set expression. Here the content of starting sets
                 are change, so need to be argument at calculation."
  [e a b c]
  (if (vector? e)
    (let [op (first e)
          k1 (set-value (second e) a b c)]
      (if (= :comp op)
        (cs/difference U k1)
        (let [k2 (set-value (nth e 2) a b c)]
          (case op
            :isect   (cs/intersection k1 k2)
            :union   (cs/union k1 k2)
            :diff    (cs/difference k1 k2)
            :symdiff (cs/union
                       (cs/difference k1 k2)
                       (cs/difference k2 k1))))))
    (case e :a a :b b :c c :0 #{})))

(defn make-set-question "generate the text of the question" [sA sB sC e]
  (str "Ha adott az \\(A=\\{"
       (s/join ", " (apply sorted-set sA))
       "\\}\\), \\(B=\\{"
       (s/join ", " (apply sorted-set sB))
       "\\}\\) és \\(C=\\{"
       (s/join ", " (apply sorted-set sC))
       "\\}\\) halmazok, akkor a \\("
       (write e)
       "\\) halmaznak az alábbiak közül melyek az elemei?"))

(defn make-set-feedback "one general feedback for the question,
                         the content of the resulting set"
  [sol]
  (str "<p>A művelet eredménye: \\(\\{"
       (s/join ", " (apply sorted-set sol))
       "\\}\\)</p>"))

(defn make-set-answer "based on good and bad answers generate
                       the answers of the question"
  [solutions no-solutions]
  (let [no-good (count solutions)
        some-good (cmn/num-good-answers no-good 10)
        good-answers (take some-good (shuffle solutions))
        bad-answers (take (- 4 some-good) (shuffle no-solutions))]
    (concat
      (for [x good-answers] [x (nth cmn/prize some-good)])
      (for [y bad-answers] [y (nth cmn/penalty some-good)]))))

(defn construct-set "Generate the base sets and their combination." [id]
  (let [sA (generate-set)
        sB (generate-set)
        sC (generate-set)
        e  (rand-nth (s3 [:a :b :c]))
        solutions (set-value e sA sB sC)
        no-solutions (cs/difference U solutions)]
    (when-not (empty? solutions)
      (let [q (make-set-question sA sB sC e)
            a (make-set-answer solutions no-solutions)
            fb (make-set-feedback solutions)
            i (str "HM1-" (inc id))]
       [q a i fb]))))
