(ns logic.outer
  (:require [clojure.string :as s])
  (:require [logic.xml :as xml])
  (:gen-class))
;; a file in the repository contains the questions ans its good and bad answers

(def no-mcq-answers 4) ;; how many answers will be in MCQ tests

;; problems stored in a Clojure data structure in an outer file
(def problems (read-string (slurp (.getPath (clojure.java.io/resource "inductive.clj")))))

(def prize   "if you have good answer" [0.0 100.0     50.0  33.33333 25.0])
(def penalty "if you haven't"          [0.0 -33.33333 -50.0 -100.0    0.0]) 


(defn num-good-answers "how many good point will be in the answer" 
  [n all]
  (let [lower (max 1 (+ no-mcq-answers (- n all)))
        upper (min no-mcq-answers n)]
    (+ lower (rand-int (- upper lower)))))

;(rand-int 5)
;(num-good-answers 6 10)

(defn construct-answer [q]
  (let [gn (count (q :good))          ; no of all good answers
        wn (count (q :wrong))
        r  (num-good-answers gn (+ gn wn))      ; select some of them
        s4 (take r (shuffle (q :good)))
        n3 (take (- 4 r) (shuffle (q :wrong)))] ; the others are wrong answers
    (concat 
      (for [x s4] [x (nth prize r)])
      (for [y n3] [(first y) (nth penalty r) (second y)]))))

(defn generate-problem [id q]
   [(q :question) (construct-answer q) (str "FN" id "-")])

(defn mcq-question [n n-id q filename-out]
  (loop [i 1]
    (when (<= i n)
      (let [[qt a id] (generate-problem n-id q)]
        (spit filename-out (xml/multi-separate (str id i) qt a) :append true)
        (recur (inc i))))))

(defn mcq-separate "Questions with separate feedback"
  [n filename-in filename-out cat]
  (let [qs (read-string 
                    (slurp (.getPath (clojure.java.io/resource filename-in))))]
    (do
      (xml/head cat filename-out)
      (doseq [[nu q] (map-indexed vector qs)]
        (mcq-question n nu q filename-out))
      (xml/tail filename-out))))

