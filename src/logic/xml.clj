;;;; Most of the XML generation code collected here.

(ns logic.xml
  (:use hiccup.core)
  (:gen-class))

(defn cdata "put HTML code into the text of the question" [& args]
  (str "<![CDATA[" (apply str args) "]]>"))

(defn category "generate category part for Moodle XML"
  [cat]
  (html
    [:question {:type "category"}
      [:category [:text (str "$course$/" cat)]]]))

(defn head "first lines of a Moodle XML file"
  [cat filename]
  (do
    (spit filename "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<quiz>")
   (spit filename (category cat) :append true)))

(defn tail "last line of a Moodle XML file" [filename]
  (spit filename "</quiz>" :append true))

(defn common-part "Dont repeat yourself!
                   We collected in one place which is common
                   in all type of tests."
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

(defn matching-questions   "XML part of a matching question"
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

(defn matching-problems "A whole Moodle XML file with matching questions"
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
;; #### Global feedback
;; At some problems it is better if we have one global feedback for the whole question.

(defn multi-general "XML part of a MCQ question with general feedback"
  [id question feedback answers]
  (html [:question {:type "multichoice"}
         [:name [:text id]]
         [:questiontext {:format "html"} [:text (cdata question)]]
         [:generalfeedback {:format "html"} [:text (cdata feedback)]]
         [:single "false"]
         [:answernumbering "abc"]
         (common-part)
         (for [x answers]
          [:answer {:fraction (second x) :format "html"}
            [:text (cdata (first x))]
            [:feedback {:format "html"} [:text]]])]))

(defn mcq-general "Whole Moodle XML file with MCQ questions, general feedback"
  [n filename cat func]
  (do
    (head cat filename)
    (loop [i 0]
      (when (< i n)
        (let [all (func i)]
          (if (nil? all)
            (recur i)
            (let [[q a id fb] all]
              (spit filename (multi-general id q fb a) :append true)
              (recur (inc i)))))))
    (tail filename)))

;; #### Separated feedback
;;
;; In some cases better, if we give feedback for each (bad) answers.

(defn multi-separate "XML part of a MCQ tests with separated feedback"
  [id question answers]
  (html [:question {:type "multichoice"}
         [:name [:text id]]
         [:questiontext {:format "html"} [:text (cdata question)]]
         [:generalfeedback {:format "html"} [:text]]
         [:single "false"]
         [:answernumbering "abc"]
         (common-part)
         (for [x answers]
          ;(print x)
          [:answer {:fraction (second x) :format "html"}
            [:text (cdata (first x))]
            [:feedback {:format "html"}
             [:text (when (= (count x) 3)
                      (cdata (nth x 2)))]]])]))


(defn mcq-separate "Whole Moodle XML file with MCQ questions, separated feedback"
  [n filename cat func]
  (do
    (head cat filename)
    (loop [i 0]
      (when (< i n)
        (let [all (func i)]
          (if (nil? all)
            (recur i)
            (let [[q a id] all]
              (spit filename (multi-separate id q a) :append true)
              (recur (inc i)))))))
    (tail filename)))

;; ### Short answer
(defn short-answer "XML part of a short-answer question"
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

(defn short-quiz "A whole Moodle XML file with short-answer questions"
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
