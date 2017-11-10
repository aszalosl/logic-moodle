(ns logic.random-formula
  (:gen-class))

;; ### Random formula

(defn random-formula0
  "Generate a random 0th-order formula with
  Args:
  l - number of connectives
  vars - list of atomic formulae"
  [l vars]
  (if (= 0 l)
    (rand-nth vars)
    (let [op (rand-nth [:not :imp :and :or :equ])]
      (if (= op :not)
        [:not (random-formula0 (- l 1) vars)]
        (let [l1 (rand-int l)
              l2 (- l l1 1)]
          [op (random-formula0 l1 vars)
              (random-formula0 l2 vars)])))))

;; We have a fixed language:
;; Vars = {x,y,z}
;; F(0) = {c,d}
;; F(1) = {f}
;; F(2) = {g}
;; P(1) = {P}
;; P(2) = {Q}

(defn random-term
  "generate a random 1st-order term
  Arg: l - max length"
  [l]
  (if (< l 2)
    (rand-nth [:x :y :z :c :d])
    (case (rand-int 6)
      0 :x
      1 :y
      2 :c
      3 :d
      4 [:f (random-term (dec l))]
      5 (let [l1 (rand-int l)
              l2 (- l l1 1)]
          [:g (random-term l1) (random-term l2)]))))

(defn equality
  "construct equality with max length l"
  [l]
  (let [l1 (rand-int l)
        l2 (- l l1)]
    [:eq (random-term l1) (random-term l2)]))

(defn p1
  "Predicate with max length l and 1 arg"
  [l]
  [:P (random-term l)])

(defn p2
  "Predicate with max length l and 2 args"
  [l]
  (let [l1 (rand-int l)
        l2 (- l l1)]
    [:Q (random-term l1) (random-term l2)]))

(defn random-formula1
  "Generate a random formula with
  Args:
  l - number of connectives
  lt - complexity of terms"
  [l lt]
  (if (= 0 l)
    (case (rand-int 3)
      0 (equality lt)
      1 (p1 lt)
      2 (p2 lt))
    (let [op (rand-nth [:not :imp :and :or :equ :all :ex])]
      (condp = op
        :not [:not (random-formula1 (dec l) lt)]
        :all [:all (rand-nth [:x :y :z]) (random-formula1 (dec l) lt)]
        :ex [:ex (rand-nth [:x :y :z]) (random-formula1 (dec l) lt)]
        (let [l1 (rand-int l)
              l2 (- l l1 1)]
          [op (random-formula1 l1 lt)
              (random-formula1 l2 lt)])))))

(defn random-formula-prenex
  "Generate a random formula with
  Args:
  l - number of connectives
  lt - complexity of terms"
  [l lt]
  (if (= 0 l)
    (case (rand-int 3)
      0 (equality lt)
      1 (p1 lt)
      2 (p2 lt))
    (let [op (rand-nth [:not :imp :and :or :all :ex])]
      (condp = op
        :not [:not (random-formula-prenex (dec l) lt)]
        :all [:all (rand-nth [:x :y :z]) (random-formula-prenex (dec l) lt)]
        :ex [:ex (rand-nth [:x :y :z]) (random-formula-prenex (dec l) lt)]
        (let [l1 (rand-int l)
              l2 (- l l1 1)]
          [op (random-formula-prenex l1 lt)
              (random-formula-prenex l2 lt)])))))
