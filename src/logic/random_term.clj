(ns logic.random-term
 (:gen-class))

;; Random term





;; Generate semi-quiz

(defn list-expressions
  "generate answers for a semi-quiz
  Args: es - list of expressions"
  [es
    (doseq [e es] (prn (str "\\( " e " \\)")))])

(defn list-terms
  "list of terms in a first-order logic
  Args:
   l - max length of terms
   n - max number of terms"
  [l n]
  (list-expressions 
    (into #{} 
          (for [x (range n)] (write-term (random-term l))))))

(defn list-formulae
  "list of prime formulae in a first-order logic
  Args:
   l - max length of terms inside
   n - max number of different kind of formulae"
  [l n]
  (do
    (list-expressions (into #{} (for [x (range n)] (equality l))))
    (list-expressions (into #{} (for [x (range n)] (p1 l))))
    (list-expressions (into #{} (for [x (range n)] (p2 l))))))
