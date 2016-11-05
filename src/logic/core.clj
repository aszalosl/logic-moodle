;;;; Main level of the software, we can generate Moodle XML files from here.
;;;; All the other files are tools, implement some type of tests.

(ns logic.core
  (:require [logic.set :as sets]
            [logic.relation :as rels]
            [logic.outer :as out]
            [logic.xml :as xml]
            [logic.quine-table :as qt]
            [logic.subformula :as sf]
            [logic.random-formula :as rf]
            [logic.model-quiz :as mq]
            [logic.consequence :as lc]
            [logic.map :as lm]
            [logic.formula :as form])
  (:gen-class))


;; ### Generate complete problems
;; set member-problem, the feedback is the members of the set
(comment (xml/mcq-xml 50 "HM1.xml" "halmaz/level1" sets/construct-set))
;; set matching problems, the feedback is a table about regions
(comment (xml/matching-xml 100 "HP3.xml" "halmaz/level3" sets/set-matching-question))
;; properties of a random relation
(comment (xml/mcq-xml 50 "RP1.xml" "relacio/level1" rels/relation-problem))
;; main column of Quine tables
(comment (xml/short-xml 20 "quine1.xml" "formula/quine1" qt/quine-test1a))
(comment (xml/short-xml 20 "quine1m.xml" "formula-min/quine1" qt/quine-test1b))
(comment (xml/short-xml 50 "quine2.xml" "formula/quine2" qt/quine-test2a))
(comment (xml/short-xml 50 "quine2m.xml" "formula-min/quine2" qt/quine-test2b))
(comment (xml/short-xml 50 "quine3.xml" "formula/quine3" qt/quine-test3a))
(comment (xml/short-xml 50 "quine3m.xml" "formula-min/quine3" qt/quine-test3b))
;;DNF
(comment (xml/mcq-xml 50 "dnf2.xml" "formula-min/dnf-knf/dnf2" lm/dnf3))
(comment (xml/mcq-xml 50 "dnf3.xml" "formula-min/dnf-knf/dnf3" lm/km3-dnf))
(comment (xml/mcq-xml 50 "dnf4.xml" "formula-min/dnf-knf/dnf4" lm/km4-dnf))



;; ### Generate test from semi questions
;; inductive definitions
(comment (out/mcq-xml-res 5 "inductive.clj" "FORM1.xml" "fn/level1"))
;; well formed formulae
(comment (out/mcq-xml-res 30 "wff.clj" "WFF.xml" "formula/wff1"))
;; subformulae of a formula
;; needs a lot of human work to give the bad answers and their feedback
(comment (out/mcq-xml-res 7 "subform.clj" "SF1.xml" "formula/subformula1"))
(comment (out/mcq-xml-res 20 "subformM.clj" "SF1.xml" "formula-min/subformula1"))
;; contradictory formulae
(comment (out/mcq-xml-res 100 "contra2.clj" "contra.xml" "formula/model/contra2"))
(comment (out/mcq-xml-res 100 "contra2m.clj" "contra.xml" "formula-min/model/contra2"))
;; valid formulae
(comment (out/mcq-xml-res 100 "valid2.clj" "valid.xml" "formula/model/valid2"))
(comment (out/mcq-xml-res 100 "valid2m.clj" "valid.xml" "formula-min/model/valid2"))
;; satifiable formulae
(comment (out/mcq-xml-res 100 "sat2.clj" "sat.xml" "formula/model/sat2"))
(comment (out/mcq-xml-res 100 "sat2m.clj" "sat.xml" "formula-min/model/sat2"))
;; contradictory set of formulae
(comment (out/mcq-xml-res 100 "contG22.clj" "contraG.xml" "formula/model/contra-set2"))
(comment (out/mcq-xml-res 100 "contG22m.clj" "contraG.xml" "formula-min/model/contra-set2"))
;; satifiable set of formulae
(comment (out/mcq-xml-res 100 "satG22.clj" "satG.xml" "formula/model/sat-set2"))
(comment (out/mcq-xml-res 100 "satG22m.clj" "satG.xml" "formula-min/model/sat-set2"))
;;  logical consequence of a formula
(comment (out/mcq-xml-res 7 "lc1a.clj" "lc1a.xml" "formula/model/lc1a"))
(comment (out/mcq-xml-res 7 "lc1am.clj" "lc1a.xml" "formula-min/model/lc1a"))
;; logical consequence of something
(comment (out/mcq-xml-res 7 "lc1b.clj" "lc1b.xml" "formula/model/lc1b"))
(comment (out/mcq-xml-res 7 "lc1bm.clj" "lc1b.xml" "formula-min/model/lc1b"))
;; logical consequence of a set of formulae
(comment (out/mcq-xml-res 1 "lc2.clj" "lc2.xml" "formula/model/lc2"))
(comment (out/mcq-xml-res 1 "lc2m.clj" "lc2.xml" "formula-min/model/lc2"))
;;  model of a formula with 2 variables
(comment (out/mcq-xml-res 25 "model2.clj" "modelA2.xml" "formula/model/modelA2"))
(comment (out/mcq-xml-res 25 "model2m.clj" "modelA2m.xml" "formula-min/model/modelA2"))
;;  model of a formula with 3 variables
(comment (out/mcq-xml-res 14 "model3.clj" "modelA3.xml" "formula/model/modelA3"))
;;  model of a set of formulae with 4 variables
(comment (out/mcq-xml-res 7 "model4.clj" "modelG4.xml" "formula/model/modelG4"))
(comment (out/mcq-xml-res 7 "model4m.clj" "modelG4m.xml" "formula-min/model/modelG4"))
;; DNF-CNF
;; minterms, maxterms
(comment (out/mcq-xml-res 9 "cdnf.clj" "dnf1.xml" "formula-min/dnf-knf/dnf1"))
(comment (out/mcq-xml-res 9 "cknf.clj" "cnf1.xml" "formula-min/dnf-knf/cnf1"))

;; ### Generate semi questions
;; model of a formula
(comment (doseq [row (range 0 4)] (spit "model2.clj" (mq/model-semi-questions-formulae 4 2 15 row true) :append true)))
(comment (doseq [row (range 0 4)] (spit "model2m.clj" (mq/model-semi-questions-formulae 4 2 15 row false) :append true)))
(comment (doseq [row (range 0 16)] (spit "model4.clj" (mq/model-semi-questions-sets 5 4 30 row true) :append true)))
(comment (doseq [row (range 0 16)] (spit "model4m.clj" (mq/model-semi-questions-sets 5 4 30 row false) :append true)))
(comment (spit "contra2.clj" (lc/cont-semi-question2 true)))
(comment (spit "contra2m.clj" (lc/cont-semi-question2 false)))
(comment (spit "valid2.clj" (lc/valid-quiz2 true)))
(comment (spit "valid2m.clj" (lc/valid-quiz2 false)))
(comment (spit "sat2.clj" (lc/sat-quiz2 true)))
(comment (spit "sat2m.clj" (lc/sat-quiz2 false)))
(comment (spit "lc1a.clj" (lc/logic_conseq true)))
(comment (spit "lc1am.clj" (lc/logic_conseq false)))
(comment (spit "lc1b.clj" (lc/logic_conseq2 true)))
(comment (spit "lc1bm.clj" (lc/logic_conseq2 false)))
(comment (spit "contG22.clj"
           (lc/make-quiz2 #(= 0 (bit-and %1 %2))
             "Jelölje meg a kielégíthetetlen formulahalmazokat!" true)))
(comment (spit "contG22m.clj"
           (lc/make-quiz2 #(= 0 (bit-and %1 %2))
             "Jelölje meg a kielégíthetetlen formulahalmazokat!" false)))
(comment (spit "satG22.clj"
           (lc/make-quiz2 #(not= 0 (bit-and %1 %2))
             "Jelölje meg a kielégíthetető formulahalmazokat!" true)))
(comment (spit "satG22m.clj"
           (lc/make-quiz2 #(not= 0 (bit-and %1 %2))
             "Jelölje meg a kielégíthetető formulahalmazokat!" false)))
(comment (spit "lc2.clj" (lc/logic_conseq3 true)))
(comment (spit "lc2m.clj" (lc/logic_conseq3 false)))
(comment (sf/to-file 50
                  (fn [] (sf/sub-quiz (rf/random-formula 7 [:p :q :r]) true))
                  "subform.clj"))
(comment (sf/to-file 50
                  (fn [] (sf/sub-quiz (rf/random-formula 7 [:p :q :r]) false))
                  "subformM.clj"))

(defn -main
  "Generate questions from MCQ semi-question file.
  Args:
   in - input file
   out - output file
   n - number of questions from one semi-question
   cat - category of the questions (string)"
  [& args]
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

