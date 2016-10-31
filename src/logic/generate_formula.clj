(ns logic.generate-formula
  (:gen-class))

;; ## Formulae generation (systematic, all of them)

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


