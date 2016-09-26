(ns logic.set
  (:require [clojure.string :as s]
            [clojure.set :as cs])
  (:gen-class))

(defn combine "combine the elements of 2 sets with all operators"
  [s1 s2]
  (for [x s1, y s2, op [:isect :union :diff :symdiff]]
   `(~op ~x ~y)))

(defn my-complement "generate the my-complementer sets"
  [s]
  (for [x s]
    `(:comp ~x)))

(def f0 "starting sets" '(:a :b :c))
;; alternative
; (def f0 "starting sets" '(:a :b :c :0))

(def f1 "sets written with one operator"
  (concat
    (combine f0 f0)
    (my-complement f0)))

(def f2 "sets written with 2 operators"
  (concat
    (combine f0 f1)
    (combine f1 f0)
    (my-complement f1)))

(def f3 "sets written written with 3 operators"
  (concat
     (combine f0 f2)
     (combine f1 f1)
     (combine f2 f0)
     (my-complement f2)))

;; for MCQ questions
(def prize   "if you have good answer" [0.0 100.0 50.0 33.33333 25.0])
(def penalty "if you haven't" [0.0 -33.33333 -50.0 -100.0 0.0]) 

(def code-uni "the key of the universe (the biggest set)" 255)
;; alternative
; (def code-uni "the key of the universe (the biggest set)" 15)

(declare calculate)
(defn set-filter "filter sets belonging a given key"
  [key sets]
  (filter #(= (calculate %) key) sets))

(defn keys-and-set-of-sets "list of (keys and list of corresponding sets)"
  [sets]
  (for [key (range 0 code-uni)
        :let [s (set-filter key sets)]
        :when (and (seq s) (seq (rest s)))]
    [key s]))

(def all-sets "all interesting sets grouped by key"
 (keys-and-set-of-sets (concat f0 f1 f2 f3)))

(defn expression-pairs "randomly select 5 pair of sets and their key"
  []
  (map #(cons (first %) (take 2 (shuffle (second %))))
    (take 5 (shuffle all-sets))))

;; # Determining the key of a set expression

(def setA "key of set A if we have 3 sets" (+ 1 2  4  8))
(def setB "key of set A if we have 3 sets" (+ 4 8 32 64))
(def setC "key of set A if we have 3 sets" (+ 2 8 16 64))
(def set0 "key of empty set" 0)
;; alternative
; (def setA "key of set A if we have 2 sets" (+ 1 2))
; (def setB "key of set A if we have 2 sets" (+ 2 4))

(defn calculate "the key of an expression"
  [e]
  (if (seq? e)
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

;; generate sets for easy calculations

(def U "Universe for our set-world" (set (range 1 11)))

(defn generate-set "generate a subset of U"
  []
  (set (take 5 (shuffle (range 1 11)))))

(defn set-value "calculate the value of an expression"
  [e a b c]
  (if (seq? e)
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


(defn write "MathJax compatible string of an expression"
  ([e] (write e false))
  ([e outer]
   (if (seq? e)
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

(defn question-expressions "list of expressions" [ep]
    (map #(str "<li>\\(" (write (second %)) "\\)</li>") ep))

(defn generate-question "complete question" [ep]
  (str "<p>Adottak az alábbi halmazok:</p><ol>"
    (s/join (question-expressions ep)) ; clojure.string used here
    "</ol><p>az alább felsorolt halmazok esetén adja meg,"
      " hogy azok ezek közül melyikkel esnek egybe!</p>"))

(defn generate-answers "the matching expressions" [ep]
  (map #(write (nth % 2)) ep))

(defn colored "the region coded with i is colored" [i a]
  (if (pos? (bit-and i (first a))) "X" "-"))

(defn feedback-text "generate the text of it" [ep]
  ; a table to describe the solution
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
        question (generate-question ep)
        answers (generate-answers ep)
        id (str "HP3-" i)
        ft (s/join (feedback-text ep))]
       `(~question ~answers ~id ~ft)))

(defn construct-set-question [sA sB sC e]
  (str "Ha adott az \\(A=\\{" 
       (s/join ", " (apply sorted-set sA))
       "\\}\\), \\(B=\\{"
       (s/join ", " (apply sorted-set sB))
       "\\}\\) és \\(C=\\{"
       (s/join ", " (apply sorted-set sC))
       "\\}\\) halmazok, akkor a \\("
       (write e)
       "\\) halmaznak az alábbiak közül melyek az elemei?"))

(defn construct-set-feedback [sol]
  (str "<p>A művelet eredménye: \\(\\{" 
       (s/join ", " (apply sorted-set sol))
       "\\}\\)</p>"))

(defn number-of-good-answers [g]
  (case g
    1 1
    2 (+ 1 (rand-int 2))
    3 (+ 1 (rand-int 3))
    (4 5 6 7) (+ 1 (rand-int 4))
    8 (+ 2 (rand-int 3))
    9 (+ 3 (rand-int 2))
    10 4))

(defn construct-set-answer [sol no-sol]
  (let [sz (count sol)                      ; no of all good answers
        r  (number-of-good-answers sz)      ; select some of them
        s4 (take r (shuffle sol))
        n3 (take (- 4 r) (shuffle no-sol))] ; the others are wrong answers
    (concat 
      (for [x s4] [x (nth prize r)])
      (for [y n3] [y (nth penalty r)]))))

(defn construct-set "Generate the base sets and their combination." [id]
  (let [sA (generate-set)
        sB (generate-set)
        sC (generate-set)
        e  (rand-nth f3)
        sol (set-value e sA sB sC)          ; the resulting set
        no-sol (cs/difference U sol)]       ; other elements
    (when-not (empty? sol)
      (let [q (construct-set-question sA sB sC e)
            a (construct-set-answer sol no-sol)
            fb (construct-set-feedback sol)
            i (str "HM1-" (inc id))]
       [q a i fb]))))
