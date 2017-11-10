# logic-moodle

A Clojure app to generate Moodle XML files with different type questions on logic.

## Usage

From REPL:

### Sets
* ```(xml/mcq-xml number-of-questions filename category sets/construct-set)```
    * to generate set members problems
* ```(xml/matching-xml number-of-questions filename category sets/set-matching-question)```
    * to generate set matching problems


### Properties of a random relation
* ```(xml/mcq-xml number-of-questions filename category rels/relation-problem)```

### Inductive definitions
* constuct ```inductive.clj``` by hand
* ```(out/mcq-xml-res number-of-questions "inductive.clj" filename category)```

### Well formed formulae
* construct ```wff.clj``` by hand
* ```(out/mcq-xml-res 30 "wff.clj" "WFF.xml" "formula/wff1")```

### Subformulae
* full formulae
    * ```(sf/to-file number-of-question (fn [] (sf/sub-quiz (rf/random-formula0 length [:p :q :r]) true)) semiquestion-file)```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```
* minimal formulae                  
    * ```(sf/to-file number-of-question (fn [] (sf/sub-quiz (rf/random-formula0 length [:p :q :r]) false))  semiquestion-file))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```


### Quine truth-tables (main column)
* ```(xml/short-xml number-of-questions filename category qt/quine-test1a)```
    * full formula, 1 variable
* ```(xml/short-xml number-of-questions filename category qt/quine-test2a)```
    * full formula, 2 variables
* ```(xml/short-xml number-of-questions filename category qt/quine-test3a)```
    * full formula, 3 variables

* ```(xml/short-xml number-of-questions filename category qt/quine-test1b)```
    * minimal formula, 1 variable
* ```(xml/short-xml number-of-questions filename category qt/quine-test2b)```
    * minimal formula, 2 variables
* ```(xml/short-xml number-of-questions filename category qt/quine-test3b)```
    * minimal formula, 3 variables

### Semantics
* contradictory formulae (full)
    * ```(spit semiquestion-file (lc/cont-semi-question2 true))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```
* contradictory formulae (minimal)
    * ```(spit semiquestion-file (lc/cont-semi-question2 false))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```

* valid formulae (full)
    * ```(spit semiquestion-file (lc/valid-quiz2 true))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```
* valid formulae (minimal)
    * ```(spit semiquestion-file (lc/valid-quiz2 false))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```

* satifiable formulae (full)
    * ```(spit semiquestion-file (lc/sat-quiz2 true))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```
* satifiable formulae (minimal)
    * ```(spit semiquestion-file (lc/sat-quiz2 false))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```

* contradictory set of formulae (full)
    * ```(spit semiquestion-file (lc/make-quiz2 #(= 0 (bit-and %1 %2)) instruction true))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```
* contradictory set of formulae (minimal)
    * ```(spit semiquestion-file (lc/make-quiz2 #(= 0 (bit-and %1 %2)) instruction false))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```

* satifiable set of formulae (full)
    * ```(spit semiquestion-file (lc/make-quiz2 #(not= 0 (bit-and %1 %2)) instruction true))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```
* satifiable set of formulae (full)
    * ```(spit semiquestion-file (lc/make-quiz2 #(not= 0 (bit-and %1 %2)) instruction false))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```

* logical consequence of a formula (full)
    * ```(spit semiquestion-file (lc/logic_conseq true))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```

* logical consequence of a formula (minimal)
    * ```(spit semiquestion-file (lc/logic_conseq false))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```

* logical consequence of something (full)
    * ```(spit semiquestion-file (lc/logic_conseq2 true))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```

* logical consequence of something (minimal)
    * ```(spit semiquestion-file (lc/logic_conseq2 false))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```

* logical consequence of a set of formulae (full)
    * ```(spit semiquestion-file (lc/logic_conseq3 true))```
    * manual work
    * ```(out/mcq-xml-res 1 semiquestion-file filename category)```

* logical consequence of a set of formulae (minimal)
    * ```(spit semiquestion-file (lc/logic_conseq3 false))```
    * manual work
    * ```(out/mcq-xml-res 1 semiquestion-file filename category)```


### Models
* model of a formula (full)
    * ```(doseq [row (range 0 4)] (spit semiquestion-file (mq/model-semi-questions-formulae len vars number row true) :append true))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category))```
* model of a formula (minimal)
    * ```(doseq [row (range 0 4)] (spit semiquestion-file (mq/model-semi-questions-formulae len vars number row false) :append true))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```    


### DNF, Karnaugh map
* DNF with 3 variables
    * ```(xml/mcq-xml number-of-questions filename category lm/dnf3)```
* canonical normal form (DNF)
    * ```(sf/to-file 20 cdnf3 semiquestion-file)```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```
* SOP Karnaugh map with 3 varibles
    * ```(xml/mcq-xml number-of-questions filename category lm/km3-dnf)```
* SOP Karnaugh map with 4 varibles
    * ```(xml/mcq-xml number-of-questions filename category lm/km4-dnf)```
* CNF with 3 variables
    * ```(xml/mcq-xml number-of-questions filename category lm/cnf3)```
* canonical normal form (CNF)
    * ```(sf/to-file 20 ccnf3 semiquestion-file)```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```
* POS Karnaugh map with 3 varibles
    * ```(xml/mcq-xml number-of-questions filename category lm/cm3-dnf)```
* POS Karnaugh map with 4 varibles
    * ```(xml/mcq-xml number-of-questions filename category lm/cm4-dnf)```

### Sequent calculus 
* ```(doseq [no (range 0 20)] (spit "sequents.clj" (sc/generate-problem 3 2 [:p :q :r :s]) :append true))```
    * generate sequents and their premise sequents, some manual work
    * ```(out/mcq-xml-res 5 "sequents.clj" "SEQ.xml" "calculus/sequent")```
    
### Free and bound variables, substitution (first order)
* ```(xml/mcq-xml number-of-questions filename category fr/free1)```
    * question about free variables 
* ```(xml/mcq-xml number-of-questions filename category fr/bound1)```
    * question about bound variables
* ```(xml/mcq-xml number-of-questions filename category fr/occur1)```
    * free occurences of a variable
* ```(xml/mcq-xml number-of-questions filename category fr/occur2)```
    *  bound occurences of a variable


###Substitution, variable clean form, prenex form
* ```(xml/mcq-xml number-of-questions filename category cng/subs1)```
* Substitution
    * ```(spit semiquestion-file (clean-quiz number-formulae length complexity))```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```
* prenex form
    * ```(sf/to-file number-of-questions (fn [] (prenex-quiz (r/random-formula-prenex length complexity))) semiquestion-file)```
    * manual work
    * ```(out/mcq-xml-res number-of-questions semiquestion-file filename category)```

