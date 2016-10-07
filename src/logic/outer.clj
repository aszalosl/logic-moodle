;;;; We can generate test from external files, too.

;; Here in one file the question and a set of good answers and a set of bad answers are given.
;;
;; The stucture is the following:
;;
;;     FILE :=        [ Q1 Q2 ...]
;;     Qi :=          {:question "text of the question"
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

(defn construct-answer "Choose randomly from good and bad answers."
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

(defn generate-problem "From an _id_ and a _question_ we generate
                        the data of an MCQ."
  [id q]
  [(q :question) (construct-answer q) (str "FN" id "-")])


(defn mcq-question "From a _question_ we generate _n_ different MCQ
                    (with sub-id _counter_) and write it into
                    the Moodle XML file."
  [n counter question filename-out]
  (loop [i 1]
    (when (<= i n)
      (let [[question-text answers id] (generate-problem counter question)]
        (spit filename-out
          (xml/multi-separate (str id i) question-text answers) :append true)
        (recur (inc i))))))

(defn mcq-separate "From all question of the input file we generate _n_ MCQ,
                    and write into output under the given category."
  [n filename-in filename-out cat]
  (let [qs (read-string
                    (slurp (.getPath (clojure.java.io/resource filename-in))))]
    (do
      (xml/head cat filename-out)
      (doseq [[nu q] (map-indexed vector qs)]
        (mcq-question n nu q filename-out))
      (xml/tail filename-out))))

;; ### Tools
;;
;; For testing the external file we can generate a LaTeX file from it.
;; For the sake of generality if the answers are mathematical expressions
;; (like sets, formulae) we need to add math mode delimiters in the answers.

(defn to-latex [in out]
  (let [data (read-string (slurp (.getPath
                                   (clojure.java.io/resource in))))]
    (do
      (spit out (str "\\documentclass{article}\n"
                   "\\usepackage[utf8]{inputenc}"
                   "\\begin{document}\n"))
      (doseq [x data]
       (spit out (str
                   (:question x)
                   "\n\\begin{enumerate}\n")
             :append true)
       (doseq [y (:good x)]
         (spit out (str "  \\item " y "\n") :append true))
       (spit out "\\end{enumerate}\n \\begin{enumerate}\n" :append true)
       (doseq [y (:wrong x)]
         (spit out (str "  \\item " (first y) ", " (second y) "\n") :append true))
       (spit out "\\end{enumerate}\n" :append true))
      (spit out "\\end{document}" :append true))))
