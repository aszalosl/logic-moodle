;;;; Common constants for the whole project

(ns logic.common
  (:gen-class))

(def no-mcq-answers "Number of answers in a MCQ test" 4)

;; At Moodle MCQ test we can assigns points (positive or negative) for
;; each answers. If one solve precisely a MCQ test, it get _1.0_.
;; If one solve inversely (mark the bad answers, and doesn't mark the
;; good ones) get _-1.0_.
;; By Moodle restriction at least one answer need to be good,
;; and no upper limit. If the constant above _n_,
;; the size of vectors above _n+1_.

;; if x good answer selected and y bad (while there are z good answers), 
;; the result is
;;
;; ```x * prize[z] + y * penalty[z]```

(def prize   [0.0 100.0     50.0  33.33333 25.0])
(def penalty [0.0 -33.33333 -50.0 -100.0    0.0])

(defn num-good-answers "From n good (among 'all') answers we randomly select
 the number of good answers in the test. At least 1, at maximum no-mcq-answers."
  [n all]
  (let [lower (max 1 (+ no-mcq-answers (- n all)))
        upper (min no-mcq-answers n)]
    (+ lower (rand-int (- upper lower)))))


; problems stored in a Clojure data structure in an outer file
; (def problems (read-string (slurp (.getPath (clojure.java.io/resource "inductive.clj")))))

