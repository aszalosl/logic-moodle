;;;; Most of the XML generation code collected here.

(ns logic.xml
  (:use hiccup.core)
  (:gen-class))

(defn cdata 
  "Put HTML code into the text of the question.
  Arg: strings" 
  [& args]
  (str "<![CDATA[" (apply str args) "]]>"))

(defn category 
  "Generate category part for Moodle XML.
  Arg: a string"
  [cat]
  (html
    [:question {:type "category"}
      [:category [:text (str "$course$/" cat)]]]))

(defn head 
  "First lines of a Moodle XML file.
  Args: 
   cat - category (string)
   filename - name of the output"
  [cat filename]
  (do
    (spit filename "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<quiz>")
   (spit filename (category cat) :append true)))

(defn tail 
  "Last line of a Moodle XML file.
  Arg: filename - the output file"
  [filename]
  (spit filename "</quiz>" :append true))

(defn common-part 
  "Dont repeat yourself!
  We collected in one place which is common in all type of tests."
  []
  (html [:defaultgrade "1.000"]
    [:penalty "0.33"]       ;; not used
    [:hidden "0"]           ;; ???
    [:shuffleanswers "true"];; yes, we need this
    ; for Hungarian students
    [:correctfeedback {:format "html"} [:text "Válasza helyes."]]
    [:partiallycorrectfeedback {:format "html"}
      [:text "Válasza részben helyes."]]
    [:incorrectfeedback {:format "html"} [:text "Válasza helytelen."]]
    [:shownumcorrect]))

;; ### Matching questions

(defn matching-questions 
  "XML part of a matching question.
  Args:
   id - question id
   question - text of the question
   answer - text of subquestions and their answers
   feedback-text - general feedback"
  [id question answers feedback-text]
  (html [:question {:type "matching"}
         [:name [:text id]]
         [:questiontext
          {:format "html"} [:text (cdata question)]]
         [:generalfeedback {:format "html"}
          [:text (cdata feedback-text)]]
         (common-part)
         (for [cnt (range 0 (count answers))
               :let [v (nth answers cnt)]]
           [:subquestion {:format "html"}
            [:text (cdata "\\(" v "\\)")]  ; an expression for MathJax!
            [:answer [:text (str (inc cnt))]]])]))

(defn matching-problems 
  "A whole Moodle XML file with matching questions.
  Args: 
   n - number of questions
   filename - output file
   cat - category
   func - function to generate questions"
  [n filename cat func]
  (do
    (head cat filename)
    (loop [i 0]
      (when (< i n)
        (let [[q a id ft] (func i)]
          (spit filename (matching-questions id q a ft) :append true))
        (recur (inc i))))
    (tail filename)))

;; ### Multiple Choice Question
;; Common approach - uniform function for the case we have general feedback, 
;; or we haven't; we have feedback for each answer, or we haven't.

(defn mcq-question 
  "text of MCQ question in XML format.
  Args:
   id - id of the question
   question - text of the question
   answers - pair/triplets of points, answers and feedbacks
   feedback - general feedback (inside a one-element list, if exists at all)"

  [id question answers & feedback]
  (html [:question {:type "multichoice"}
         [:name [:text id]]
         [:questiontext {:format "html"} [:text (cdata question)]]
         [:generalfeedback {:format "html"} 
           [:text (when feedback (cdata (first feedback)))]]
         [:single "false"]
         [:answernumbering "abc"]
         (common-part)
         (for [x answers]
          [:answer {:fraction (second x) :format "html"}
            [:text (cdata (first x))]
            [:feedback {:format "html"} 
              [:text (when (= (count x) 3) (cdata (nth x 2)))]]])]))

(defn mcq-xml 
  "Whole Moodle XML file with MCQ questions.
  Args:
   n - number of questions
   filename - output file
   cat - category
   func - function to generate questions"
  [n filename cat func]
  (do
    (head cat filename)
    (loop [i 0]
      (when (< i n)
        (let [all (func i)]
          (if (nil? all)
            (recur i)
            (let [[q a id fb] all]
              (spit filename (mcq-question id q a fb) :append true)
              (recur (inc i)))))))
    (tail filename)))

;; ### Short answer
(defn short-answer 
  "XML part of a short-answer question
  Args:
   id - id of the question
   question - text of the question 
   answer - the uniq (good) answer
   feedback - the solution or a hint"
  [id question answer feedback]
  (html [:question {:type "shortanswer"}
          [:name [:text id]]
          [:questiontext {:format "html"} [:text (cdata question)]]
          [:generalfeedback {:format "html"} [:text (cdata feedback)]]
          [:defaultgrade "1.000"]
          [:penalty "0.33"]
          [:hidden "0"]
          [:usecase "0"]
          [:answer {:fraction "100"} {:format "moodle_auto_format"}
            [:text (cdata answer)]
            [:feedback {:format "html"} [:text]]]]))

(defn short-quiz 
  "A whole Moodle XML file with short-answer questions.
  Args: 
   n - number of questions
   filename - output file
   category - category of the questions
   func - function to generate questions"
  [n filename category func]
  (do
    (head category filename)
    (loop [i 0]
      (when (< i n)
        (let [all (func i)]
          (if (nil? all)
            (recur i)
            (let [[q a id ft] all]
              (spit filename (short-answer id q a ft) :append true)
              (recur (inc i)))))))
    (tail filename)))
