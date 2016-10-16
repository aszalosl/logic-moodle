;;;; Main level of the software, we can generate Moodle XML files from here.
;;;; All the other files are tools, implement some type of tests.

(ns logic.core
  (:require [logic.set :as sets])
  (:require [logic.relation :as rels])
  (:require [logic.outer :as out])
  (:require [logic.xml :as xml])
  (:require [logic.formula :as form])
  (:gen-class))


;; ### Generate complete problems
;; set member-problem, the feedback is the members of the set
(comment (xml/mcq-xml 50 "HM1.xml" "halmaz/level1" sets/construct-set))
;; set matching problems, the feedback is a table about regions
(comment (xml/matching-problems 100 "HP3.xml" "halmaz/level3" sets/set-matching-question))
;; properties of a random relation
(comment (xml/mcq-xml 50 "RP1.xml" "relacio/level1" rels/relation-problem))
;; main column of Quine tables
(comment (xml/short-quiz 20 "Quine1.xml" "formula/quine1" form/quine-test1))
(comment (xml/short-quiz 50 "Quine2.xml" "formula/quine2" form/quine-test2))
(comment (xml/short-quiz 50 "Quine3.xml" "formula/quine3" form/quine-test3))

;; ### Generate test from semi questions
;; inductive definitions
(comment (out/mcq-xml-res 5 "inductive.clj" "FORM1.xml" "fn/level1"))
;; well formed formulae
(comment (out/mcq-xml-res 30 "wff.clj" "WFF.xml" "formula/wff1"))
;; subformulae of a formula
(comment (out/mcq-xml-res 7 "subform.clj" "SF1.xml" "formula/subformula1"))
;; contradictory formulae
(comment (out/mcq-xml-res 100 "contra2.clj" "contra.xml" "formula/model/contra2"))
;; valid formulae
(comment (out/mcq-xml-res 100 "valid2.clj" "valid.xml" "formula/model/valid2"))
;; satifiable formulae
(comment (out/mcq-xml-res 100 "sat2.clj" "sat.xml" "formula/model/sat2"))
;; contradictory set of formulae
(comment (out/mcq-xml-res 100 "contG22.clj" "contraG.xml" "formula/model/contra-set2"))
;; satifiable set of formulae
(comment (out/mcq-xml-res 100 "satG22.clj" "satG.xml" "formula/model/sat-set2"))
;;  logical consequence of a formula
(comment (out/mcq-xml-res 7 "lc1a.clj" "lc1a.xml" "formula/model/lc1a"))
;; logical consequence of something
(comment (out/mcq-xml-res 7 "lc1b.clj" "lc1b.xml" "formula/model/lc1b"))
;; logical consequence of a set of formulae
(comment (out/mcq-xml-res 1 "lc2.clj" "lc2.xml" "formula/model/lc2"))
;;  model of a formula with 2 variables
(comment (out/mcq-xml-res 25 "model2.clj" "modelA2.xml" "formula/model/modelA2"))
;;  model of a formula with 3 variables
(comment (out/mcq-xml-res 14 "model3.clj" "modelA3.xml" "formula/model/modelA3"))
;;  model of a set of formulae with 4 variables
(comment (out/mcq-xml-res 7 "model4.clj" "modelG4.xml" "formula/model/modelG4"))
;; ### Generate semi questions


(defn -main [& args]
  (if (and (seq? args) (= 4 (count args)))
    (let [in (first args)
          out (second args)
          n  (Integer. (re-find #"[0-9*]" (nth args 2)))
          category (nth args 3)]
      (do
         (println "OK\n")
         (out/mcq-xml n in out category)))
    (println
      "Use the REPL to generate questions!\n"
      "Or give the following args in this order to generate MCQ tests: \n"
      "  in  - name of the file with semi-questions,\n"
      "  out - name of output file (Moodle-XML),\n"
      "  n   - number of tests generated from one semi-question,\n"
      "  cat - Moodle category of this questions.\n")))

