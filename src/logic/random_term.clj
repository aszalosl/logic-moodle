(ns logic.random-term
 (:gen-class))

;; Random term

(defn random-term
  "generate a random term
  Arg: l - max length"
  [l]
  (if (< l 2)
    (rand-nth [:x :y :z])
    (case (rand-int 4)
      0 :x
      1 :y
      2 [:f (random-term (dec l))]
      3 (let [l1 (rand-int l) 
              l2 (- l l1 1)]
          [:g (random-term l1) (random-term l2)]))))
        
(defn write-term
  "string variant of the term 'e'"
  [e]
  (if (vector? e)
    (if (= :f (first e))
      (str "f(" (write-term (second e)) ")")
      (str "g(" (write-term (second e)) ","
                (write-term (nth e 2)) ")"))
    (case e :x "x" :y "y" :z "z")))

(defn equality
  "write equality with max length l"
  [l]
  (let [l1 (rand-int l)
        l2 (- l l1)]
    (str 
      (write-term(random-term l1))
      " = "
      (write-term(random-term l2)))))
      
(defn p1
  "Predicate with max length l, and 1 arg"
  [l]
    (str 
      "P("
      (write-term(random-term l))
      ")"))
      
(defn p2
  "write equality with max length l"
  [l]
  (let [l1 (rand-int l)
        l2 (- l l1)]
    (str
      "Q(" 
      (write-term(random-term l1))
      ","
      (write-term(random-term l2))
      ")")))

