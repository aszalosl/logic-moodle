(ns logic.write-formula
  (:gen-class))
;; ## String representation of the formula
;;

;; almost any quiz uses the function write,
;; so one of them is commented

(defn write-term
      "string variant of the term 'e'"
      [e]
      (if (vector? e)
        (if (= :f (first e)) ; only 2 options: f,g
          (str "f(" (write-term (second e)) ")")
          (str "g(" (write-term (second e)) "," (write-term (nth e 2)) ")"))
        (case e :x "x" :y "y" :z "z" :c "c" :d "d" :u "u" :v "v" :w "w" :t "t" :s "s")))

;; ### Naive representation with all the parentheses.

(defn write-full
  "MathJax compatible string of an expression with all paren.
  Arg: expression as a vector"
  [e]
  (if (vector? e)
    (let [op (first e)]
      (condp = op
        :P   (str "P(" (write-term (second e)) ")")
        :Q   (str "Q(" (write-term (second e)) "," (write-term (nth e 2)) ")")
        :not (str "\\lnot " (write-full (second e)))
        :all (str "\\forall " (write-term (second e)) (write-full (nth e 2)))
        :ex  (str "\\exists " (write-term (second e)) (write-full (nth e 2)))
        :eq  (str (write-term (second e)) "=" (write-term (nth e 2)))
        (let [wop (case op :imp "\\supset " :and "\\land "
                   :or "\\lor " :equ "\\equiv ")
              w1 (write-full (second e))
              w2 (write-full (nth e 2))]
          (str "(" w1 wop w2 ")"))))
    (case e :p "p", :q "q", :r "r", :s "s", :t "t", :u "u")))

;; ### Typical representation with minimal number parentheses

(def precedence
  "The first symbol is stronger than the second"
  [ [:ex :and] [:ex :or] [:ex :imp] [:ex :equ]
    [:all :and] [:all :or] [:all :imp] [:all :equ]
    [:not :and] [:not :or] [:not :imp] [:not :equ]
    [:and :or] [:and :imp] [:and :equ]
    [:or :imp] [:or :equ]  [:imp :equ]])

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
        (condp = op
          :P   (str "P(" (write-term (second e)) ")")
          :Q   (str "Q(" (write-term (second e)) "," (write-term (nth e 2)) ")")
          :not (str "\\lnot " (write-short (second e) :not false))
          :all (str "\\forall " (write-term (second e)) (write-short (nth e 2) :all false))
          :ex  (str "\\exists " (write-term (second e)) (write-short (nth e 2) :ex false))
          :eq  (str (write-term (second e)) "=" (write-term (nth e 2)))
          (let [wop (case op :imp "\\supset " :and "\\land "
                      :or "\\lor " :equ "\\equiv ")
                w1 (write-short (second e) op true)
                w2 (write-short (nth e 2) op false)]
            (if (or (some #(= [outer op] %) precedence)
                    (and (= outer op) before)) ; right associativity
              (str "(" w1 wop w2 ")")
              (str w1 wop w2)))))
      (case e :p "p", :q "q" :r "r", :s "s", :t "t", :u "u"))))

(defn write-out
  "MathJax compatible string of an expression into datafile
  Args:
   e - expression as a vector
   outer - operator outside this formula
   before - this operator was before the this one"
  ([e] (write-out e 0 true))
  ([e outer before]
    (if (vector? e)
      (let [op (first e)
            e1 (get e 1)
            e2 (get e 2)]
        (condp = op
          :P   (str "P(" (write-term e1) ")")
          :Q   (str "Q(" (write-term e1) "," (write-term e2) ")")
          :not (str "\\\\lnot " (write-out e1 :not false))
          :all (str "\\\\forall " (write-term e1) (write-out e2 :all false))
          :ex  (str "\\\\exists " (write-term e1) (write-out e2 :ex false))
          :eq  (str (write-term e1) "=" (write-term e2))
          (let [wop (case op :imp "\\\\supset " :and "\\\\land "
                      :or "\\\\lor " :equ "\\\\equiv ")
                w1 (write-out e1 op true)
                w2 (write-out e2 op false)]
            (if (or (some #(= [outer op] %) precedence)
                    (and (= outer op) before)) ; right associativity
              (str "(" w1 wop w2 ")")
              (str w1 wop w2)))))
      (case e :p "p", :q "q" :r "r", :s "s", :t "t", :u "u"))))

(comment (write-full [:and [:and :p :p] :p]))
(comment (write-full [:and [:and :p [:not :p]] [:and :p [:not :q]]]))
(comment (write-short [:and :p [:and :p :p]]))
(comment (write-short [:and [:imp :p :p] :p]))
(comment (write-short [:and [:or :p [:not :p]] [:and :p [:not :q]]]))

