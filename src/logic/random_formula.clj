(ns logic.random-formula
  (:gen-class))

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


