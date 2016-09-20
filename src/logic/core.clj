(ns logic.core
  (:require [logic.set :as sets])
  (:use hiccup.core)
  (:gen-class))

(defn cdata [& args]
  (str "<![CDATA[" (apply str args) "]]>"))

(defn category "generate category part for Moodle XML"
  [cat]
  (html
    [:question {:type "category"}
      [:category [:text (str "$course$/" cat)]]]))

(defn common-part "DRY" []
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

(defn matching-questions   "generate questions"
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
         

(defn multi "generate MCQ tests" [id question feedback answers]
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

(defn matching-sets "Match the corresponding set expressions!"
  [n filename]
  (do
    (spit filename "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<quiz>")
    (spit filename (category "halmaz/level3") :append true)
    (loop [i 0]
      (when (< i n)
        (let [[q a id ft] (sets/set-matching-question i)]
          (spit filename (matching-questions id q a ft) :append true))
        (recur (inc i))))
    (spit filename "</quiz>" :append true)))

(defn members-of-sets "Select the suitable elements!"
  [n filename]
  (do
    (spit filename "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<quiz>")
    (spit filename (category "halmaz/level1") :append true)
    (loop [i 0]
      (when (< i n)
        (let [all (sets/construct-set i)]
          (if (nil? all)
            (recur i)
            (let [[q a id fb] all]
              (spit filename (multi id q fb a) :append true)
              (recur (inc i)))))))
    (spit filename "</quiz>" :append true)))


(defn -main []
  (println "Use the REPL to generate questions!"))

(comment (members-of-sets 5 "HM1a.xml")) ; set construction
(comment (matching-sets 100 "HP3a.xml")) ; set pairing
