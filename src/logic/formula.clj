(ns logic.formula
  (:require [clojure.string :as s]
            [clojure.set :as cs])
  (:gen-class))

;; ## Formulae generation (systematic)

(defn combine
  "Combine the formulae of 2 lists with all operators.
  Args: 2 lists of formula"
  [s1 s2]
  (for [x s1, y s2, op [:imp :and :or :equ]]
    [op x y]))

(defn negated
  "Generate the list of negated elements
  Arg: list of formula"
  [s]
  (for [x s] [:not x]))

(defn f1
  "Formulae written with one operator.
  Arg: list of atomic formula"
  [af]
  (concat
    (combine af af)
    (negated af)))

(defn f2
  "Formulae written with 2 operators.
  Arg: list of atomic formula"
  [af]
  (let [f1s (f1 af)]
    (concat
      (combine af f1s)
      (combine f1s af)
      (negated f1s))))

(defn f3
  "Formulae written written with 3 operators
  Arg: list of atomic formula"
  [af]
  (let [f1s (f1 af)
        f2s (f2 af)]
    (concat
       (combine af f2s)
       (combine f1s f1s)
       (combine f2s af)
       (negated f2s))))

(defn form
  "Generate a big set of formulae
  Arg: list of atomic formula"
  [af]
  (concat af (f1 af) (f2 af)  (f3 af)))

;; ### Random formula

(defn random-formula
  "Generate a random formula with
  Args:
   l - number of connectives
   vars - list of atomic formulae"
  [l vars]
  (if (= 0 l)
    (rand-nth vars)
    (let [op (rand-nth [:not :imp :and :or :equ])]
      (if (= op :not)
        [:not (random-formula (- l 1) vars)]
        (let [l1 (rand-int l)
              l2 (- l l1 1)]
          [op (random-formula l1 vars)
              (random-formula l2 vars)])))))

;; ## String representation of the formula
;;

;; almost any quiz uses the function write,
;; so one of them is commented

;; ### Naive representation with all the parentheses.

(defn write-full
  "MathJax compatible string of an expression with all paren.
  Arg: expression as a vector"
  [e]
  (if (vector? e)
    (let [op (first e)]
      (if (= :not op)
        (str "\\lnot " (write-full (second e)))
        (let [wop (case op :imp "\\supset " :and "\\land "
                   :or "\\lor " :equ "\\equiv ")
              w1 (write-full (second e))
              w2 (write-full (nth e 2))]
          (str "(" w1 wop w2 ")"))))
   (case e :p "p", :q "q", :r "r", :s "s", :t "t", :u "u")))

;; ### Typical representation with minimal number parentheses

(def precedence
  "The first symbol is stronger than the second"
  [ [:not :and] [:not :or] [:not :imp] [:not :equ]
    [:and :or] [:and :imp] [:and :equ]
    [:or :imp] [:or :equ]  [:imp :equ] ])

(defn write-short
  "MathJax compatible string of an expression
  Args:
   e - expression as a vector
   outer - operator outside this formula
   before - this operator was before the this one"
  ([e] (write-short e 0 true))
  ([e outer before]
    (if (vector? e)
      (let [op (first e)]
        (if (= :not op)
          (str "\\lnot " (write-short (second e) :not false))
          (let [wop (case op :imp "\\supset " :and "\\land "
                      :or "\\lor " :equ "\\equiv ")
                w1 (write-short (second e) op true)
                w2 (write-short (nth e 2) op false)]
            (if (or (some #(= [outer op] %) precedence)
                    (and (= outer op) before)) ; right associativity
              (str "(" w1 wop w2 ")" )
              (str w1 wop w2)))))
    (case e :p "p", :q "q" :r "r", :s "s", :t "t", :u "u"))))

(comment (write-full [:and [:and :p :p] :p]))
(comment (write-full [:and [:and :p [:not :p]] [:and :p [:not :q]]]))
(comment (write-short [:and :p [:and :p :p]]))
(comment (write-short [:and [:imp :p :p] :p]))
(comment (write-short [:and [:or :p [:not :p]] [:and :p [:not :q]]]))


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

(comment (parameters (random-formula 6 [:p :q])))

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
               (if full (write-full f) (write-short f))
               " \\) igazságtáblájának a fő oszlopa az interpretációk"
               " <i>növekvő</i> sorrendje esetén?")
            ans (truth-table-main-column c size)
            id (str "QTT" p "-" i)
            fb (str "a megoldás: " ans
                    (when-not full (str "<br>az eredeti formula: \\("
                                        (write-full f) "\\)")))]
          [q ans id fb]))))

;; only one paramter: the id of the question
;; difference in size, and in full/short formula
(defn quine-test1a [i] (quine-test [:p] (random-formula 3 [:p]) true i))
(defn quine-test1b [i] (quine-test [:p] (random-formula 3 [:p]) false i))

(defn quine-test2a [i] (quine-test [:p :q] (random-formula 4 [:p :q]) true i))
(defn quine-test2b [i] (quine-test [:p :q] (random-formula 4 [:p :q]) false i))

(defn quine-test3a [i] (quine-test [:p :q :r] (random-formula 5 [:p :q :r]) true i))
(defn quine-test3b [i] (quine-test [:p :q :r] (random-formula 5 [:p :q :r]) false i))

;; ### Model quiz
;;
(defn my-bit
  "One bit of the value.
  Args:
   value - input
   mask  - some power of 2
  Output: value of the corresponding bit: 0 or 1"
  [value mask]
  (if (= 0 (bit-and value mask)) "0" "1"))

(defn model-question "make question with models"
  [vars row q]
  (str "Jelölje meg az alábbi " q " közül azokat, melyeknek modellje az"
    " a \\( \\varrho \\) interpretáció, ahol "
    (case vars
      1 (str "\\( \\varrho (p) \\)=" (my-bit row 1) "!")
      2 (str "\\( \\varrho (p) \\)=" (my-bit row 2) " és "
             "\\( \\varrho (q) \\)=" (my-bit row 1) "!")
      3 (str "\\( \\varrho (p) \\)=" (my-bit row 4) ", "
             "\\( \\varrho (q) \\)=" (my-bit row 2) " és "
             "\\( \\varrho (r) \\)=" (my-bit row 1) "!")
      4 (str "\\( \\varrho (p) \\)=" (my-bit row 8) ", "
             "\\( \\varrho (q) \\)=" (my-bit row 4) ", "
             "\\( \\varrho (r) \\)=" (my-bit row 2) " és "
             "\\( \\varrho (s) \\)=" (my-bit row 1) "!"))))

(defn model-formula-question
  "Text of the model question about formulae
  Args:
   vars - number of parameters
   row - some row of the truth table i.e. an interpretation"
  [vars row]
  (model-question vars row "formulák"))

(defn model-set-question
  "Text of a model question about sets of formulae
  Args:
   vars - number of parameters
   row - some row of the truth table i.e. an interpretation"
  [vars row]
  (model-question vars row "formulahalmazok"))

(defn ** "power function" [x n] (reduce * (repeat n x)))

(defn model-semi-questions-formulae
  "Generate semi-questions for formulae.
  Args:
   length - operators in the random formula ~ length of it
   vars - number of parameters/variables
   formula - number of generated formulae
   row - id of the interpreation
   full - write all the paren.? (bool)"
  [length vars formulae row full]
  (let [fs (for [i (range 0 formulae)]
             (random-formula length
               (case vars 1 [:p], 2 [:p :q], 3 [:p :q :r], 4 [:p :q :r :s])))
        pred (case vars 1 code1, 2 code2, 3 code3, 4 code4)
        good (filterv #(not= 0 (bit-and (** 2 row) (pred %))) fs)
        bad (filterv #(= 0 (bit-and (** 2 row) (pred %))) fs)]
    (str " {:question \"" (model-formula-question vars row) "\"\n"
         "  :good [\n"
         (s/join (for [a good]
                   (str "         \"\\( "
                        (if full (write-full a) (write-short a))
                        " \\)\"\n")))
         "]\n  :wrong [\n"
         (s/join (for [b bad]
                   (str "          [\"\\( "
                        (if full (write-full b) (write-short b))
                        " \\)\" \""
                        (when-not full
                          (str "az eredeti formula: \\(" (write-full b) "\\)<br>"))
                        "az igazságtábla főoszlopa: "
                        (truth-table-main-column (pred b) (** 2 vars)) "\"]\n")))
         "]}\n\n")))

(defn model-semi-questions-sets
  "Generate a semi-question for sets formulae
  Args:
   length - operators in the random formula ~ length of it
   vars - number of parameters/variables
   sets - number of generated formula-set
   row - id of the interpreation
   full - write all the paren.? (bool)"
  [length vars sets row full]
  (let [variables (case vars 1 [:p], 2 [:p :q], 3 [:p :q :r], 4 [:p :q :r :s])
        fs (for [i (range 0 sets)]
             [ (random-formula length variables)
               (random-formula length variables)])
        pred (case vars 1 code1, 2 code2, 3 code3, 4 code4)
        good (filterv
               #(not= 0 (bit-and (** 2 row) (pred (first %)) (pred (second %))))
                fs)
        bad (filterv
               #(= 0 (bit-and (** 2 row) (pred (first %)) (pred (second %))))
               fs)]
    (str " {:question \"" (model-set-question vars row) "\"\n"
         "  :good [\n"
         (s/join (for [a good]
                   (str "         \"\\(\\{ "
                        (if full (write-full (first a)) (write-short (first a)))
                        ", "
                        (if full (write-full (second a)) (write-short (second a)))
                        " \\}\\)\"\n")))
         "]\n  :wrong [\n"
         (s/join (for [b bad]
                   (str "          [\"\\(\\{ "
                        (if full (write-full (first b)) (write-short (first b))) ","
                        (if full (write-full (second b)) (write-short (second b)))
                        " \\}\\)\" \""
                        (when-not full
                          (str "az eredeti formulák: \\("
                               (write-full (first b))
                               "\\) és \\("
                               (write-full (second b))
                               "\\)<br>" ))
                        "az igazságtáblák főoszlopai: "
                        (truth-table-main-column (pred (first b)) (** 2 vars))
                        " és "
                        (truth-table-main-column (pred (second b)) (** 2 vars))
                        "\"]\n")))
         "]}\n\n")))

;; ### Quizzes for satisfiability, contradiction, equivalence

;; Only with 2 parameters

(def form2
  "Formulae with two parameters."
  (form [:p :q]))

(defn equ-class2
  "Equivalence class of formulae with code n.
  Arg: the code"
  [n]
  (for [x form2 :when (= n (code2 x))] x))

;; #### some quiz for a formula

(defn print-good-items
  "Print the good formulae in formatted way.
  Args:
   code - id of the equivalence class
   n - number of formulae
   full - write with all paren.? (bool)"
  [code n full]
  (s/join (map #(str
                  "    \"\\( "
                  ((if full write-full write-short) %)
                  " \\)\"\n")
             (repeatedly n #(rand-nth (equ-class2 code))))))

(comment (print-good-items 5 4 false))

(defn print-bad-items
  "Print the not suitable formulae and a feedback about its class
  Args:
   code - id of the equivalence class
   n - number of formulae
   full - write with all paren.? (bool)"
  [code n full]
  (s/join (map #(str
                  "    [\"\\( "
                  ((if full write-full write-short) %)
                  " \\)\""
                  " \" a formula eredetije: \\( "
                  (write-full %)
                  " \\)<br>az igazságtábla főoszlopa: "
                  (ttmc2 code)
                  "\"]\n")
             (repeatedly n #(rand-nth (equ-class2 code))))))

(defn cont-semi-question2
  "Generate semi-questions about contradictory formulae"
  [full]
  (str "[{:question \"Jelölje meg a kielégíthetetlen formulákat!\"\n  :good [\n"
       (print-good-items 0 30 full)
       "  ]\n  :wrong [\n"
       (s/join (for [i (range 1 16)] (print-bad-items i 5 full)))
       "]}]\n"))

(defn valid-quiz2
  "Generate semi-questions about valid formulae"
  [full]
  (str "[{:question \"Jelölje meg az érvényes formulákat!\"\n  :good [\n"
       (print-good-items  15 30 full)
       "  ]\n  :wrong [\n"
       (s/join (for [i (range 0 15)] (print-bad-items i 5 full)))
       "]}]\n"))

(defn sat-quiz2
  "Generate semi-questions about satisfiable formulae"
  [full]
  (str "[{:question \"Jelölje meg a kielégíthető,"
       " de nem érvényes formulákat!\"\n  :good [\n"
       (s/join (for [i (range 1 15)] (print-good-items i 5 full)))
       "  ]\n  :wrong [\n"
       (s/join [(print-bad-items 0 30 full) (print-bad-items 15 30 full)])
       "]}]\n"))


(defn logic_conseq
  "Generate semi-question about logical consequence of a formula"
  [full]
  (s/join
    (for [i (range 0 16)]
      (str " {:question \"Jelölje meg a \\( "
           ((if full write-full write-short) (rand-nth (equ-class2 i)))
           " \\) formula logikai következményeit!\"\n  :good [\n"
           (s/join (for [j (range 0 16) :when (= 0 (bit-and i (- 15 j)))]
                     (print-good-items j 5 full)))
           "  ]\n  :wrong [\n"
         (s/join
           (for [k (range 0 4) j (range 0 16)
                  :when (not= 0 (bit-and i (- 15 j)))]
             (str
               "            [\"\\( " ((if full write-full write-short)
                                      (rand-nth (equ-class2 j))) " \\)\""
               " \"a konklúzió igazságtáblájának főoszlopa: " (ttmc2 j)
               ", míg a hipotézis igazságtáblájának főoszlopa " (ttmc2 i)
               " \"]\n")))
         "]}\n"))))


(defn logic_conseq2
  "Generate semi-questions about logical consequence of something"
  [full]
  (s/join
    (for [i (range 0 16)]
      (str " {:question \"Jelölje meg azokat a formulákat, melyeknek a \\( "
           ((if full write-full write-short) (rand-nth (equ-class2 i)))
           " \\) formula logikai következménye! (Külön-külön)\"\n  :good [\n"
           (s/join (for [j (range 0 16) :when (= 0 (bit-and j (- 15 i)))]
                     (print-good-items j 5 full)))
           "  ]\n  :wrong [\n"
         (s/join
           (for [k (range 0 4) j (range 0 16)
                  :when (not= 0 (bit-and j (- 15 i)))]
             (str
               "            [\"\\( " ((if full write-full write-short)
                                      (rand-nth (equ-class2 j))) " \\)\""
               " \"a hipotézis igazságtáblájának főoszlopa: " (ttmc2 j)
               ", míg a konklúzió igazságtáblájának főoszlopa " (ttmc2 i)
               " \"]\n")))
         "]}\n"))))

;; #### some quiz for set of formulae

(defn make-quiz2
  "Generate semi-questions with criteria f
  Args:
   f - criteria
   question - text of the question
   full - write all the parens.?"
  [f question full]
  (str " {:question \"" question "\"\n  :good [\n"
       (s/join (for [x (range 0 16) y (range 0 16) :when (f x y)]
                 (str "         \"\\( \\{"
                      ((if full write-full write-short) (rand-nth (equ-class2 x)))
                      ",\\ "
                      ((if full write-full write-short) (rand-nth (equ-class2 y)))
                      "\\} \\)\"\n")))
       "  ]\n  :wrong [\n"
       (s/join (for [x (range 0 16) y (range 0 16) :when (not (f x y))]
                 (str "          [\"\\( \\{"
                      ((if full write-full write-short) (rand-nth (equ-class2 x)))
                      ",\\ "
                      ((if full write-full write-short) (rand-nth (equ-class2 y)))
                      "\\} \\)\" \""
                      "az igazságtáblák főoszlopai " (ttmc2 x) " és "
                      (ttmc2 y) "\"]\n")))
       "]}\n"))


(defn logic_conseq3 
  "Generate a semi-questions about logical consequence of formulae"
  [full]
  (s/join
    (for [i (range 0 16) j (range 0 16) :when (< i j)]
      (str " {:question \"Jelölje meg a \\( \\{"
           ((if full write-full write-short) (rand-nth (equ-class2 i))) 
           "\\), \\("
           ((if full write-full write-short) (rand-nth (equ-class2 j))) 
           "\\} "
           " \\) formulahalmaz logikai következményeit!\"\n  :good [\n"
           (s/join (for [k (range 0 16) :when (= 0 (bit-and i j (- 15 k)))]
                     (print-good-items k 5 full)))
           "  ]\n  :wrong [\n"
         (s/join
           (for [l (range 0 4) k (range 0 16)
                  :when (not= 0 (bit-and i j (- 15 k)))]
             (str
               "            [\"\\( " 
               ((if full write-full write-short) (rand-nth (equ-class2 j))) 
               " \\)\""
               " \"a konklúzió igazságtáblájának főoszlopa: " (ttmc2 k)
               ", míg a hipotézisek igazságtábláinak főoszlopai " (ttmc2 i)
               " és " (ttmc2 j) " \"]\n")))
         "]}\n"))))

;; ### Subformulae quiz

(defn subformulae
  "Set of subformulae of a formula
  Args:
   f - formula
   full - write the subform. with all parens.?"
  [f full]
  (let [sf (set [((if full write-full write-short) f)])]
    (if (vector? f)
      (let [sf1 (subformulae (second f) full)
            op (first f)]
        (if (= :not op)
          (cs/union sf1 sf)
          (let [sf2 (subformulae (nth f 2) full)]
            (cs/union sf1 sf2 sf))))
    sf)))

(comment (subformulae [:and :q :p] false))

(defn sub-quiz "generate a semi-question for a quiz about subformulae"
  [f full]
  (str " {:question \"A felsoroltak közül melyek részformulái a \\( "
       ((if full write-full write-short) f) 
       " \\) formulának?\"\n"
       (when-not full (str "  :feedback \"Az eredeti formula: \\( " (write-full f) "\\) \"\n")) 
       "  :good [\n"
       (s/join
         (map #(str "    \"\\( " % " \\)\"\n") (subformulae f full)))
       "  ]\n  :wrong []}\n"))


(defn to-file "write into file out n semi-questions generated by func"
  [n func out]
  (doseq [i (range 0 n)]
    (let [x (func)]
      (spit out x :append true))))

