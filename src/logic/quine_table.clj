(ns logic.quine-table
  (:require [logic.random-formula :as rf]
            [logic.write-formula :as wf]
            [clojure.string :as s]
            [clojure.set :as cs])
  (:gen-class))

(defn parameters
  "The list of atomic formulae occur in the formula
  Arg: a formula"
  [f]
  (if (vector? f)
    (let [s1 (parameters (second f))]
      (if (= :not (first f))
        s1
        (cs/union s1 (parameters (nth f 2)))))
    (set [f])))

(comment (parameters (rf/random-formula 6 [:p :q])))


;; ### Quine truth table problems
;;
(defn notbit "binary complement until limit"
  [n limit]
  (- limit n))

(defn code
  "The main column of the truth table of the formula.
  Args:
   form - formula
   vars - map of variables and their value (values in their column)"
  [form vars]
  (if (vector? form)
    (let [c1 (code (second form) vars)
          op (first form)]
      (if (= :not op)
        (notbit c1 (:t vars))
        (let [c2 (code (nth form 2) vars)]
          (case op
            :and (bit-and c1 c2)
            :or  (bit-or c1 c2)
            :imp (bit-or c2 (notbit c1 (:t vars)))
            :equ (notbit (bit-xor c1 c2) (:t vars))))))
    (form vars)))

;; We code the 4 equivalence classes of formulae with
;; 1 parameters with numbers 0-3:
;;
;; * code(p) = 2r10 = 2
;; * code(T) = 2r11 = 3

(defn code1
  "Code of a formula with 1 variable
  Arg: formula"
  [f]
  (code f {:p 2, :t 3}))

;; We code the 16 equivalence classes of formulae with
;; 1 parameters with numbers 0-3:
;;
;; * code(p) = 2r1100 = 12
;; * code(q) = 2r1010 = 10
;; * code(T) = 2r1111 = 15

(defn code2
  "Code of a formula with 2 variable
  Arg: formula"
  [f]
  (code f {:p 12, :q 10,  :t 15}))

;; We code the 256 equivalence classes of formulae with
;; 3 parameters with numbers 0-255
;;
;; * code(p) = 2r11110000 = 240
;; * code(q) = 2r11001100 = 204
;; * code(r) = 2r10101010 = 170
;; * code(T) = 2r11111111 = 255

(defn code3
  "Code of a formula with 3 variable
  Arg: formula"
  [f]
  (code f {:p 240, :q 204, :r 170, :t 255}))

;; We code the 65636 equivalence classes of formulae with
;; 4 parameters with numbers 0-65635
;;
;; * code(p) = 2r1111111100000000 = 65280
;; * code(q) = 2r1111000011110000 = 61680
;; * code(r) = 2r1100110011001100 = 52428
;; * code(s) = 2r1010101010101010 = 43690
;; * code(T) = 2r1111111111111111 = 65635

(defn code4
  "Code of a formula with 3 variable
  Arg: formula"
  [f]
  (code f {:p 65280, :q 61680, :r 52428, :s 42690 :t 65635}))

(defn truth-table-main-column
  "Convert from radix 10 to binary with a fixed length.
  Args:
   code - value of the binary number in radix 10
   size - length of the binary number"
  [code size]
  (s/join (take size (reverse (str (s/join (repeat size "0"))
                                   (Integer/toBinaryString code))))))

(defn ttmc2
  "Main column of a Quine-table with 2 vars.
  Arg: code of the column"
  [code]
  (truth-table-main-column code 4))

(defn quine-test
  "Generate a random formulae with given parameters,
  and construct a test based on it.
  (If the random formula have less parameters gives nil.)
  Args:
   i - id of the question
   pars - number of atomic formulae (parameters)
   f - formula
   full - all the parens. (optional)"
  [pars f full i]
  (let [lp (count pars)
        p (count (parameters f))]
    (when (= lp p)
      (let [c (case p 1 (code1 f), 2 (code2 f), 3 (code3 f))
            size (case p 1 2, 2 4, 3 8)
            q (str
               "Mit tartalmaz a(z) \\( "
               (if full (wf/write-full f) (wf/write-short f))
               " \\) igazságtáblájának a fő oszlopa az interpretációk"
               " <i>növekvő</i> sorrendje esetén?")
            ans (truth-table-main-column c size)
            id (str "QTT" p "-" i)
            fb (str "a megoldás: " ans
                    (when-not full (str "<br>az eredeti formula: \\("
                                        (wf/write-full f) "\\)")))]
          [q ans id fb]))))

;; only one paramter: the id of the question
;; difference in size, and in full/short formula
(defn quine-test1a [i] (quine-test [:p] (rf/random-formula 3 [:p]) true i))
(defn quine-test1b [i] (quine-test [:p] (rf/random-formula 3 [:p]) false i))

(defn quine-test2a [i] (quine-test [:p :q] (rf/random-formula 4 [:p :q]) true i))
(defn quine-test2b [i] (quine-test [:p :q] (rf/random-formula 4 [:p :q]) false i))

(defn quine-test3a [i] (quine-test [:p :q :r] (rf/random-formula 5 [:p :q :r]) true i))
(defn quine-test3b [i] (quine-test [:p :q :r] (rf/random-formula 5 [:p :q :r]) false i))


