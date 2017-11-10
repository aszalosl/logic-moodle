(ns logic.model-quiz
  (:require [logic.formula :as f]
            [logic.random-formula :as rf]
            [logic.quine-table :as qt]
            [logic.write-formula :as wf]
            [clojure.string :as s])
  (:gen-class))

;; ### Model quiz
;;
(defn model-question "make question with models"
  [vars row q]
  (str "Jelölje meg az alábbi " q " közül azokat, melyeknek modellje az"
    " a \\( \\varrho \\) interpretáció, ahol "
    (case vars
      1 (str "\\( \\varrho (p) \\)=" (f/my-bit row 1) "!")
      2 (str "\\( \\varrho (p) \\)=" (f/my-bit row 2) " és "
             "\\( \\varrho (q) \\)=" (f/my-bit row 1) "!")
      3 (str "\\( \\varrho (p) \\)=" (f/my-bit row 4) ", "
             "\\( \\varrho (q) \\)=" (f/my-bit row 2) " és "
             "\\( \\varrho (r) \\)=" (f/my-bit row 1) "!")
      4 (str "\\( \\varrho (p) \\)=" (f/my-bit row 8) ", "
             "\\( \\varrho (q) \\)=" (f/my-bit row 4) ", "
             "\\( \\varrho (r) \\)=" (f/my-bit row 2) " és "
             "\\( \\varrho (s) \\)=" (f/my-bit row 1) "!"))))

(defn model-formula-question
  "Text of the model question about formulae
  Args:
   vars - number of parameters
   row - some row of the truth table i.e. an interpretation"
  [vars row]
  (model-question vars row "formulák"))

(defn model-set-question
  "Text of a model question about sets of formulae
  Args:
   vars - number of parameters
   row - some row of the truth table i.e. an interpretation"
  [vars row]
  (model-question vars row "formulahalmazok"))


(defn model-semi-questions-formulae
  "Generate semi-questions for formulae.
  Args:
   length - operators in the random formula ~ length of it
   vars - number of parameters/variables
   formula - number of generated formulae
   row - id of the interpreation (determines the values of the variables)
   full - write all the paren.? (bool)"
  [length vars formulae row full]
  (let [variables (case vars 1 [:p], 2 [:p :q], 3 [:p :q :r], 4 [:p :q :r :s])
        fs (for [i (range 0 formulae)]
             (rf/random-formula0 length variables))
        pred (case vars 1 qt/code1, 2 qt/code2, 3 qt/code3, 4 qt/code4)
        func (fn [z] (bit-and (f/** 2 row) (pred z)))
        good (filterv #(not= 0 (func %)) fs)
        bad (filterv #(= 0 (func %)) fs)]
    (str " {:question \"" (model-formula-question vars row) "\"\n"
         "  :good [\n"
         (s/join
           (for [a good]
             (str "         \"\\( "
                  (if full (wf/write-full a) (wf/write-short a))
                  ;": " (qt/truth-table-main-column (pred a) (f/** 2 vars)) ; testing result
                  " \\)\"\n")))
         "]\n  :wrong [\n"
         (s/join
           (for [b bad]
             (str "          [\"\\( "
                  (if full (wf/write-full b) (wf/write-short b))
                  " \\)\" \""
                  (when-not full
                    (str "az eredeti formula: \\(" (wf/write-full b) "\\)<br>"))
                  "az igazságtábla főoszlopa: "
                  (qt/truth-table-main-column (pred b) (f/** 2 vars)) "\"]\n")))
         "]}\n\n")))

(defn model-semi-questions-sets
  "Generate a semi-question for sets formulae
  Args:
   length - operators in the random formula ~ length of it
   vars - number of parameters/variables
   sets - number of generated formula-set
   row - id of the interpreation
   full - write all the paren.? (bool)"
  [length vars sets row full]
  (let [variables (case vars 1 [:p], 2 [:p :q], 3 [:p :q :r], 4 [:p :q :r :s])
        fs (for [i (range 0 sets)]
             [(rf/random-formula0 length variables)
              (rf/random-formula0 length variables)])
        pred (case vars 1 qt/code1, 2 qt/code2, 3 qt/code3, 4 qt/code4)
        func #(bit-and (f/** 2 row) (pred (first %)) (pred (second %)))
        good (filterv #(not= 0 (func %)) fs)
        bad (filterv #(= 0 (func %)) fs)]
    (str
      " {:question \"" (model-set-question vars row) "\"\n"
      "  :good [\n"
      (s/join (for [a good]
                (str
                  "         \"\\(\\{ "
                  (if full (wf/write-full (first a)) (wf/write-short (first a)))
                  ", "
                  (if full (wf/write-full (second a)) (wf/write-short (second a)))
                  ;": " (qt/truth-table-main-column (pred (first a)) (f/** 2 vars))
                  ;"+" (qt/truth-table-main-column (pred (second a)) (f/** 2 vars))
                  " \\}\\)\"\n")))
      "]\n  :wrong [\n"
      (s/join (for [b bad]
                (str
                  "          [\"\\(\\{ "
                  (if full (wf/write-full (first b)) (wf/write-short (first b))) ","
                  (if full (wf/write-full (second b)) (wf/write-short (second b)))
                  " \\}\\)\" \""
                  (when-not full
                    (str
                      "az eredeti formulák: \\("
                      (wf/write-full (first b))
                      "\\) és \\("
                      (wf/write-full (second b))
                      "\\)<br>"))
                  "az igazságtáblák főoszlopai: "
                  (qt/truth-table-main-column (pred (first b)) (f/** 2 vars))
                  " és "
                  (qt/truth-table-main-column (pred (second b)) (f/** 2 vars))
                  "\"]\n")))
      "]}\n\n")))


