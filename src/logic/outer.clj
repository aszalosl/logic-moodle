;;;; We can generate test from external files, too.

;; Here in one file the question, a general feedback, a set of good answers
;; and a set of bad answers (and feedback to each of them) are given.
;;
;; The stucture of the datafile is the following:
;;
;;     FILE :=        [ Q1 Q2 ...]
;;     Qi :=          {:question "text of the question"
;;                     : feedback "text of feedback"  (optional)
;;                     :good GOOD-ANSWERS
;;                     :wrong BAD-ANSWERS}
;;     GOOD-ANSWERS:= [ "1st answer" "2nd answer" ...]
;;     BAD-ANSWERS:=  [ R1 R2 ...]
;;     Ri:=           [ "wrong answer" "feedback"]


(ns logic.outer
  (:require [clojure.string :as s])
  (:require [logic.xml :as xml])
  (:require [logic.common :as cmn])
  (:gen-class))

(defn construct-answer
  "Choose randomly from good and bad answers.
  Args: q - the semi-question"
  [q]
  (let [no-g (count (q :good))
        no-w (count (q :wrong))
        some-good  (cmn/num-good-answers no-g (+ no-g no-w))
        good-answers (take some-good (shuffle (q :good)))
        bad-answers (take (- cmn/no-mcq-answers some-good)
                          (shuffle (q :wrong)))]
    (concat
      (for [x good-answers] [x (nth cmn/prize some-good)])
      (for [y bad-answers] [(first y)
                            (nth cmn/penalty some-good)
                            (second y)]))))

(defn generate-problem
  "Generate the parts of the questions.
  Args:
    id - id of the question
    q - semi-question"
  [id q]
  [(q :question) (construct-answer q) (str "FN" id "-") (q :feedback)])


(defn mcq-question
  "Generate from a semi-question n different question and write them out.
  Args:
   n - number questions generated,
   counter - id of the semi-question,
   question - the question, the feedbacks, good and bad answers
   filename-out - the file of the output"
  [n counter question filename-out]
  (loop [i 1]
    (when (<= i n)
      (let [[question-text answers id feedback]
            (generate-problem counter question)]
        (spit filename-out
          (xml/mcq-question (str id i) question-text answers feedback)
          :append true)
        (recur (inc i))))))

(defn mcq-xml
  "Generate xml file from semi questions.
  Args:
   n - number of questions generated from 1 semi-question
   filename-in - file of semi-questions
   filename-out - Moodle-XML file
   cat - category of the questions"
  [n filename-in filename-out cat]
  (let [qs (read-string (slurp filename-in))]
    (do
      (xml/head cat filename-out)
      (doseq [[nu q] (map-indexed vector qs)]
        (mcq-question n nu q filename-out))
      (xml/tail filename-out))))

(defn mcq-xml-res
  "Generate xml file from resource files of semi-questions.
  Args:
   n - number of questions generated from 1 semi-question
   in-res - resource file of semi-questions
   out - Moodle-XML file
   cat - category of the questions"
  [n in-res out cat]
  (let [in (.getPath (clojure.java.io/resource in-res))]
    (mcq-xml n in out cat)))

;; ### Tools
;;
;; For testing the external file we can generate a LaTeX file from it.
;; For the sake of generality if the answers are mathematical expressions
;; (like sets, formulae) we need to add math mode delimiters in the answers.


(defn to-latex
  "Semiquestions in printable format
  Args:
   in - file of semiquestions
   out - LaTeX file"
  [in out]
  (let [data (read-string (slurp (.getPath
                                   (clojure.java.io/resource in))))]
    (do
      (spit out (str "\\documentclass{article}\n"
                   "\\usepackage[utf8]{inputenc}"
                   "\\begin{document}\n"))
      (doseq [x data]
       (spit out (str
                   (:question x)
                   (when-not (nil? (:feedback x)) (:feedback x))
                   "\n\\begin{enumerate}\n")
             :append true)
       (doseq [y (:good x)]
         (spit out (str "  \\item " y "\n") :append true))
       (spit out "\\end{enumerate}\n \\begin{enumerate}\n" :append true)
       (doseq [y (:wrong x)]
         (spit out (str "  \\item " (first y) ", " (second y) "\n") :append true))
       (spit out "\\end{enumerate}\n" :append true))
      (spit out "\\end{document}" :append true))))
