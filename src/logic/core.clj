;;;; Main level of the software, we can generate Moodle XML files from here.
;;;; All the other files are tools, implement some type of tests.

(ns logic.core
  (:require [logic.set :as sets])
  (:require [logic.relation :as rels])
  (:require [logic.outer :as out])
  (:require [logic.xml :as xml])
  (:require [logic.formula :as form])
  (:gen-class))


;; ### Generate problems alone

(defn mathching-sets "Match the pairs of sets."
  [n filename]
  (xml/matching-problems)  n  filename
    "halmaz/level3" sets/set-matching-question)

(defn members-of-sets "Which ones are elements of some given set?"
  [n filename]
  (xml/mcq-general n filename "halmaz/level1" sets/construct-set))

(defn relations "Select the properties of a given relation."  [n filename]
  (xml/mcq-separate n filename "relacio/level1" rels/relation-problem))

;; #### Concrete test generation
(comment (members-of-sets 5 "HM1a.xml")) ; set construction
(comment (matching-sets 100 "HP3a.xml")) ; set pairing
(comment (relations 5 "RP1.xml")) ; relations
(comment (xml/short-quiz 20 "Quine1.xml" "formula/quine1" form/quine-test1))
(comment (xml/short-quiz 50 "Quine2.xml" "formula/quine2" form/quine-test2))
(comment (xml/short-quiz 50 "Quine3.xml" "formula/quine3" form/quine-test3))
;; ### Generate test from given answers

(defn fn-quiz "Find the parts of the inductive function definitions." [n]
  (out/mcq-separate n "inductive.clj" "FORM1.xml" "fn/level1"))

(defn wff-quiz "Select the well formed formulae." [n]
  (out/mcq-separate n "wff.clj" "WFF.xml" "formula/level1"))

(defn subformula-quiz1 "Select the subformulae at full formula." [n]
  (out/mcq-separate n "subform.clj" "SF1.xml" "formula/level2"))

(defn contra2-quiz "Model - contradictory formulae." [n]
  (out/mcq-separate n "contra2.clj" "contra.xml" "formula/model/contra2"))

(defn valid2-quiz "Model - valid formulae." [n]
  (out/mcq-separate n "valid2.clj" "valid.xml" "formula/model/valid2"))

(defn sat2-quiz "Model - satisfiable formulae." [n]
  (out/mcq-separate n "sat2.clj" "sat.xml" "formula/model/sat2"))

(defn contra2G-quiz "Model - contradictory set of formulae." [n]
  (out/mcq-separate n "contG22.clj" "contraG.xml" "formula/model/contra-set2"))

(defn sat2G-quiz "Model - satisfiable set of formulae." [n]
  (out/mcq-separate n "satG22.clj" "satG.xml" "formula/model/sat-set2"))

(defn lc1a-quiz "Model - logical consequence of a formula." [n]
  (out/mcq-separate n "lc1a.clj" "lc1a.xml" "formula/model/lc1a"))

(defn lc1b-quiz "Model - logical consequence of a something." [n]
  (out/mcq-separate n "lc1b.clj" "lc1b.xml" "formula/model/lc1b"))

(defn lc2-quiz "Model - logical consequence of a formula." [n]
  (out/mcq-separate n "lc2.clj" "lc2.xml" "formula/model/lc2"))

(defn -main []
  (println "Use the REPL to generate questions!"))
