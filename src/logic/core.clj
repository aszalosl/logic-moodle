(ns logic.core
  (:require [logic.set :as sets])
  (:require [logic.relation :as rels])
  (:require [logic.outer :as out])
  (:require [logic.xml :as xml])
  (:gen-class))


;; different kind of tests

(defn mathching-sets "Match the set pairs"
  [n filename]
  (xml/matching-problems)  n  filename
    "halmaz/level3" sets/set-matching-question)

(defn members-of-sets "Select the suitable elements!"
  [n filename]
  (xml/mcq-general n filename "halmaz/level1" sets/construct-set))

(defn relations "Select properties of a relation"  [n filename]
  (xml/mcq-separate n filename "relacio/level1" rels/construct-relation))

;; tests from outer files
(defn fn-quiz "test about inductive definitions" [n]
  (out/mcq-separate n "inductive.clj" "FORM1.xml" "fn/level1"))

(defn wff-quiz "well formed formulae test" [n]
  (out/mcq-separate n "wff.clj" "WFF.xml" "formula/level1"))
;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn -main []
  (println "Use the REPL to generate questions!"))

(comment (members-of-sets 5 "HM1a.xml")) ; set construction
(comment (matching-sets 100 "HP3a.xml")) ; set pairing
(comment (relations 5 "RP1.xml")) ; relations

