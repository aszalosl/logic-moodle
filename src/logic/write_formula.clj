(ns logic.write-formula
  (:gen-class))
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


