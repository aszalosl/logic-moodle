;;;; Some properties of binary relation is interesting for freshmens.
;;;; Here we generate a relation randomly and ask about its properties.

(ns logic.relation
  (:require [clojure.string :as s]
            [clojure.set :as cs]
            [logic.common :as cmn])
  (:gen-class))

;; Number _1_ denotes that the relation holds, and number _0_, that doesn't hold.

;; For testing purposes we define some relations:

;    (def r1 [[1 0 1] [1 1 1] [0 0 0]])
;    (def r2 [[1 0 1] [1 1 1] [0 0 1]])
;    (def r3 [[0 1 1] [1 0 1] [1 1 0]])
;    (def r4 [[1 1 0] [1 0 1] [1 1 0]])

;; To help the students we show a counter-example, if its answer is wrong.
;; Hence the properties below search for counter-examples,
;; and they give the first one, or _nil_ if there is no such example,
;; i.e. the property holds.

(defn find-first "find the first matching item
                  for the property _f_ in the collection _coll_."
         [f coll]
         (first (filter f coll)))

(defn- diagonal "select the diagonal elements of a relation _r_" [r]
  (for [x (range 0 (count r))] [(get-in r [x x]) x]))

(defn non-reflexive? "the relation isn't reflexive?" [r]
  (find-first #(= 0 (first %)) (diagonal r)))

(defn non-irreflexive? "the relation isn't irreflexive?" [r]
  (find-first #(= 1 (first %)) (diagonal r)))

(defn- satisfy2 "select the pairs from _r_ where _f_ holds" [f r]
  (let [rr (range 0 (count r))]
    (for [x rr, y rr :when (f r x y)] [x y])))

(defn- mirrored "take the values at mirrored positions" [coll r]
  (for [pair coll]
    (let [x (first pair), y (second pair)]
      [(get-in r [y x]) x y])))

(defn non-symmetric? "the relation is non-symmetric?" [r]
  (find-first #(= 0 (first %))
   (mirrored
     (satisfy2 #(= (get-in %1 [%2 %3]) 1) r)
     r)))

(defn non-asymmetric? "the relation is non-asymmetric?" [r]
  (find-first #(= 1 (first %))
    (mirrored
      (satisfy2 #(= (get-in %1 [%2 %3]) 1) r)
      r)))

(defn non-antisymmetric? "the relation is non-antisymmetric?" [r]
  (find-first #(= 1 (first %))
    (mirrored
      (satisfy2 #(and
                      (not= %2 %3)
                      (= (get-in %1 [%2 %3]) 1)) r)
      r)))

(defn- void0 "Add a uninteresting value to the pair (or triple, etc)
              for the sake of uniform handling of results."
  [coll]
  (if (nil? coll)
    nil
    (cons 0 coll)))

(defn non-strongly-connected? "the relation is non-strongly-connected?" [r]
  (void0
    (first (satisfy2 #(= (+ (get-in %1 [%2 %3])
                            (get-in %1 [%3 %2])) 0) r))))

(defn non-connected? "the relation is non-connected?" [r]
  (void0
    (first (satisfy2
             #(and (not= %2 %3)
                   (= (+ (get-in %1 [%2 %3])
                         (get-in %1 [%3 %2]))))
             r))))


(defn- satisfy3 "select triplets from _r_ where
                 the (complicated) relation _f_ holds" [f r]
  (let [rr (range 0 (count r))]
    (for [x rr, y rr, z rr :when (f r x y z)]
       [x y z])))

(defn non-transitive? "the relation is non-transitive?" [r]
  (void0
    (first
      (satisfy3
        #(and (= (get-in %1 [%2 %3]) 1)
              (= (get-in %1 [%3 %4]) 1)
              (= (get-in %1 [%2 %4]) 0)) ;0!
        r))))

(defn non-intransitive? "the relation is non-intransitive?" [r]
  (void0
    (first
      (satisfy3
        #(and (= (get-in %1 [%2 %3]) 1)
              (= (get-in %1 [%3 %4]) 1)
              (= (get-in %1 [%2 %4]) 1)) ;1!
        r))))

;; We list the name of relations and corresponding functions.

(def names
  ["reflexív" "irreflexív"
   "szimmetrikus" "aszimmetrikus" "antiszimmetrikus"
   "összefüggő" "erősen összefüggő"
   "tranzitív" "intranzitív"])
(def functions
  [non-reflexive? non-irreflexive?
   non-symmetric? non-asymmetric? non-antisymmetric?
   non-connected? non-strongly-connected?
   non-transitive? non-intransitive?])

(defn feedbacktext "generate the text of the feedback,
                    i.e. the counter-example" [v]
  (condp = (count v)
    2 (str "x=" (inc (second v)))
    3 (str "x=" (inc (second v)) " és y=" (inc (nth v 2)))
    4 (str "x=" (inc (second v))
           ", y=" (inc (nth v 2))
           " és z=" (inc (nth v 3)))))

(defn construct-answer "generate the answer with feedbacks" [r]
  (let [all-answers (map vector (for [x functions] (x r)) names)
        properties-hold (filter #(nil? (first %)) all-answers)
        prop-arent-met (filter #((complement nil?) (first %)) all-answers)]
    (if (> (count properties-hold) 0)
      (let
        [all-good (count properties-hold)
         some-good  (cmn/num-good-answers all-good (count functions))
         good-answers (take some-good (shuffle properties-hold))
         bad-answers (take (- cmn/no-mcq-answers some-good)
                           (shuffle prop-arent-met))]
        (concat
          (for [x good-answers] [(second x) (nth cmn/prize some-good)])
          (for [y bad-answers] [(second y)
                                (nth cmn/penalty some-good)
                                (feedbacktext (first y))]))))))

(defn print-row "print one row of the table in HTML" [y xs]
   (str "<tr><th>" y "</th>"
     (clojure.string/join
       (for [x xs] (str "<td>"
                     (if (= x 1) "X" "-")
                     "</td>")))
     "</tr>"))

(defn construct-question "generate the text of the question,
                          and the table of the relation"
  [r]
  (str "Adott az alábbi reláció. Válassza ki, hogy a "
     "felsoroltak közül mely tulajdonságok teljesülnek a relációra!"
     "<table border=\"1\"><tr><td></td><th>1</th><th>2</th><th>3</th></tr>"
    (clojure.string/join
      (for [x (range 0 (count r))]
        (print-row (inc x) (get r x))))
    "</table>"))

(defn my-bit "mask a number to get a bit of the input" [i mask]
  (/ (bit-and i mask) mask))

(defn relation-problem "generate a relation problem from a random number"
  [i]
  (let [x (rand-int 512)
        r [
           [(my-bit x 1) (my-bit x 2) (my-bit x 4)]
           [(my-bit x 8) (my-bit x 16) (my-bit x 32)]
           [(my-bit x 64) (my-bit x 128) (my-bit x 256)]]
        a (construct-answer r)]
    (if (nil? a) nil
      [(construct-question r)
       a
       (str "RP1-" i)])))

