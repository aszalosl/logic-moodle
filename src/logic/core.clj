(ns logic.core
  (:require [logic.set :as hz]
            [clojure.string :as s])
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
  [id question answers]
  (html [:question {:type "matching"}
         [:name [:text id]]
         [:questiontext
          {:format "html"} [:text (cdata question)]]
         [:generalfeedback {:format "html"} [:text] ]
         (common-part)
         (for [cnt (range 0 (count answers)) 
               :let [v (nth answers cnt)]]
           [:subquestion {:format "html"} 
            [:text (cdata "\\(" v "\\)")]  ; an expression for MathJax!
           [:answer [:text (str (inc cnt))]]])
         ]))

(defn multi "generate MCQ tests" [id question answers]
  (html [:question {:type "multichoice"}
         [:name [:text id]]
         [:questiontext {:format "html"} [:text (cdata question)]]
         [:generalfeedback {:format "html"} [:text] ]
         (common-part)
         (for [x answers]
          [:answer {:fraction "0"} {:format "html"}
            [:text (cdata x)]
            [:feedback {:format "html"} [:text]]] )]))

(defn matching-sets "Match the corresponding set expressions!"
  [n filename]
  (do
    (spit filename "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<quiz>")
    (spit filename (kategoria "halmaz/level1") :append true)
    (loop [i 0]
      (when (< i n)
        (let [[q a id] (hz/set-matching-question i)]
          (spit filename (parosito id q a) :append true))
          (recur (inc i))  ))
    (spit filename "</quiz>" :append true)))


(defn -main []
  (println "Use the REPL to generate questions!"))
