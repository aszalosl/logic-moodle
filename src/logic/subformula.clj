(ns logic.subformula
  (:require [logic.write-formula :as wf]
            [clojure.set :as cs]
            [clojure.string :as s])
  (:gen-class))

;; ### Subformulae quiz

(defn subformulae
  "Set of subformulae of a formula
  Args:
   f - formula
   full - write the subform. with all parens.?"
  [f full]
  (let [sf (set [((if full wf/write-full wf/write-short) f)])]
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
       ((if full wf/write-full wf/write-short) f) 
       " \\) formulának?\"\n"
       (when-not full (str "  :feedback \"Az eredeti formula: \\( " (wf/write-full f) "\\) \"\n")) 
       "  :good [\n"
       (s/join
         (map #(str "    \"\\( " % " \\)\"\n") (subformulae f full)))
       "  ]\n  :wrong []}\n"))


(defn to-file "write into file out n semi-questions generated by func"
  [n func out]
  (doseq [i (range 0 n)]
    (let [x (func)]
      (spit out x :append true))))


