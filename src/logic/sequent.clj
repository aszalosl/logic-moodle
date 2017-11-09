(ns logic.sequent
  (:require [logic.random-formula :as r]
            [logic.write-formula :as wf]
            [clojure.string :as s])
  (:gen-class))

;; ### semi-quiz for sequent calculus

(defn generate-sequent
  "Create a random sequent.
  Args: number of formulae, complexity of formulae, variables"
  [n c vs]
  [ (vec (for [x (range 0 (+ 2 (rand-int n)))]
           (r/random-formula0 (+ 1 (rand-int c)) vs)))
    (vec (for [x (range 0 (+ 2 (rand-int n)))]
           (r/random-formula0 (+ 1 (rand-int c)) vs)))])

(defn antecedent
  [g1 g2 d a b c]
  (case c
   :and [ [(into [] (concat g1 [a b] g2)) d] ]
   :or  [ [(into [] (concat g1 [a] g2)) d]
          [(into [] (concat g1 [b] g2)) d]]
   :imp [ [(into [] (concat g1 g2)) (into [] (concat d [a]))]
          [(into [] (concat g1 [b] g2)) d]]
   :not [ [(into [] (concat g1 g2)) (into [] (concat d [a]))] ]
   :equ [ [(into [] (concat g1 [a b] g2)) d]
          [(into [] (concat g1 g2)) (into [] (concat d [a b]))]]))

(defn premise1
  "Work with antecedent"
  [gamma1 gamma2 delta premises]
  (if (empty? gamma2)
    premises
    (if (keyword? (first gamma2))
      (premise1 (conj gamma1 (first gamma2))
                (rest gamma2) delta premises)
      (let [frm (first gamma2)
            g2  (rest gamma2)
            a (second frm)
            b (get frm 2)
            new-premises (antecedent gamma1 g2 delta a b (first frm))]
        (premise1 (conj gamma1 frm) g2 delta 
                  (into [] (concat premises new-premises)))))))

(defn succedent
  [g d1 d2 a b c]
  (case c
    :and [ [g (into [] (concat d1 d2 [a]))]
           [g (into [] (concat d1 d2 [b]))]]
    :or  [ [g (into [] (concat d1 d2 [a b]))]]
    :imp [ [(into [] (concat g [a])) (into [] (concat d1 d2 [b]))]]
    :not [ [(into [] (concat g [a])) (into [] (concat d1 d2))]]
    :equ [ [(into [] (concat g [a])) (into [] (concat d1 d2 [b]))]
           [(into [] (concat g [b])) (into [] (concat d1 d2 [a]))]]))

(defn premise2
  "Work with succedent"
  [gamma delta1 delta2 premises]
  (if (empty? delta2)
    premises
    (if (keyword? (first delta2))
      (premise2 gamma (conj delta1 (first delta2))
                (rest delta2) premises)
      (let [frm (first delta2)
            d2  (rest delta2)
            a (second frm)
            b (get frm 2)
            new-premises (succedent gamma delta1 d2 a b (first frm))]
        (premise2 gamma (conj delta1 frm)
                  d2 (into [] (concat premises new-premises)))))))

(defn write-sequent
  [sequent]
  (let [pb (s/join ", " (for [f (first sequent)] (wf/write-out f)))
        pa (s/join ", " (for [f (second sequent)] (wf/write-out f)))]
    (str " \\\\( " pb "\\\\vdash " pa " \\\\) ")))

(defn write-sequents
  [sqnts]
  (s/join " "
          (for [s sqnts]
            (str "    \"" (write-sequent s) "\"\n"))))

(defn generate-problem
  "Generate the premise clauses for a consequnce clause.
  Args: l- max. length of formula, c - max. complexity, vars - vector of variables"
  [l c vars]
  (let [sq (generate-sequent l c vars)
        p1 (premise1 [] (first sq) (second sq) [])
        p2 (premise2 (first sq) [] (second sq) [])
        ps (concat p1 p2)]
    (str " {:question \"Válassza ki a felsoroltak közül azokat a szekventeket, melyek a "
        (write-sequent sq)
       " szekvent premissza-szekventjei lehetnek!\"\n  :good [\n"
       (write-sequents ps)
       "]\n  :wrong [\n\n]}\n")))

