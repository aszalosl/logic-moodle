(ns logic.set
  (:require [clojure.string :as s])
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


(def code-uni "the key of the universe (the biggest set)" 255)
;; alternative
; (def code-uni "the key of the universe (the biggest set)" 15)

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

;; # MathJax complatible printing
;(declare write) ;; forward declaration
; (defn my-write "write complex expression"
;   [form]
;      (if (= :comp (first form))
;        (str "\\overline{" (write (second form) ) "}")
;        (let [op (write (first form) )
;              s1 (write (second form))
;              s2 (write (nth form 2) )]
;            (str "(" s1 op s2 ")"))))
; 
; (defmulti write type)
; 
; (defmethod write clojure.lang.Keyword [kw]
;    (case kw
;     :a "A"
;     :b "B"
;     :c "C"
;     :0 "\\emptyset"
;     ;; :comp "\\not "
;     :isect "\\cap "
;     :union "\\cup "
;     :diff "\\backslash "
;     :symdiff "\\Delta "))
; 
; ; refactored the same part to my-write
; (defmethod write clojure.lang.PersistentList [form]
;   (my-write form ))
; 
; (defmethod write clojure.lang.Cons [form]
;   (my-write form ))


(defn question-expressions "list of expressions"
  [ep]
    (map #(str "<li>\\(" (write (second %)) "\\)</li>") ep))

(defn generate-question "complete question" [ep]
  (str "<p>Adottak az alábbi halmazok:</p><ol>"
    (s/join (question-expressions ep)) ; clojure.string used here
      "</ol><p>az alább felsorolt halmazok esetén adja meg,"
      " hogy azok ezek közül melyikkel esnek egybe!</p>"))

(defn generate-answers "the matching expressions" [ep]
  (map #(write (nth % 2)) ep))

(defn set-matching-question  "generate question, answers, and feedback"
  [i]
  (let [ep (expression-pairs)
        question (generate-question ep)
        answers (generate-answers ep)
        id (str "HP1-" i)]
       `(~question ~answers ~id)))
