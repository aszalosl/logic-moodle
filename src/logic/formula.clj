(ns logic.formula
  (:require [clojure.string :as s])
            ;[clojure.set :as cs])
  (:gen-class))

(defn combine "combine the formulae of 2 lists with all operators"
  [s1 s2]
  (for [x s1, y s2, op [:imp :and :or :equ]]
   `(~op ~x ~y)))

(defn negated "generate the list of negated elements"
  [s]
  (for [x s]
    `(:not ~x)))

(def f0 "atomic formulae" '(:p :q :r))
;; alternative
;(def f0 "atomic formulae" '(:p :q :r :s))
;(def f0 "atomic formulae" '(:p :q :r :s :t))
;(def f0 "atomic formulae" '(:p :q :r :s :t :u))
; (def f0 "starting sets" '(:a :b :c :0))

(def f1 "formulae written with one operator"
  (concat
    (combine f0 f0)
    (negated f0)))

(def f2 "formulae written with 2 operators"
  (concat
    (combine f0 f1)
    (combine f1 f0)
    (negated f1)))

(def f3 "formulae written written with 3 operators"
  (concat
     (combine f0 f2)
     (combine f1 f1)
     (combine f2 f0)
     (negated f2)))

(def formulae (concat f0 f1 f2 f3))

(defn write "MathJax compatible string of an expression"
  ([e] 
   (if (seq? e)
     (let [op (first e)]
       (if (= :not op)
         (str "\\lnot " (write (second e)))
         (let [wop (case op :imp "\\supset " :and "\\land "
                    :or "\\lor " :equ "\\equiv ")
               w1 (write (second e))
               w2 (write (nth e 2))]
           (str "(" w1 wop w2 ")"))))
    (case e :p "p" :q "q" :r "r" :s "s" :t "t" :u "u"))))

(def wff "test data for well formed formulae"
  (read-string
    (slurp
      (.getPath
        (clojure.java.io/resource "wff.clj")))))


(defn latex-test "math mode is correct in the problems?" [out]
  (do
    (spit out (str "\\documentclass{article}\n"
                 "\\usepackage[utf8]{inputenc}"
                 "\\begin{document}\n"))
          (doseq [x wff]
      (spit out (str
                  (:question x)
                  "\n\\begin{enumerate}\n")
            :append true)
      (doseq [y (:good x)]
        (spit out (str "  \\item $" y "$\n") :append true))
      (spit out "\\end{enumerate}\n \\begin{enumerate}\n" :append true)
      (doseq [y (:wrong x)]
        (spit out (str "  \\item $" (first y) "$, " (second y) "\n") :append true))
      (spit out "\\end{enumerate}\n" :append true))
    (spit out "\\end{document}" :append true)))

