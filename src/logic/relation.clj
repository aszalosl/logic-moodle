(ns logic.relation
  (:require [clojure.string :as s]
            [clojure.set :as cs])
  (:gen-class))

;; 1 denotes that the relation holds, 
;; 0 doesn't hold

(def r1 [[1 0 1] [1 1 1] [0 0 0]])
(def r2 [[1 0 1] [1 1 1] [0 0 1]])
(def r3 [[0 1 1] [1 0 1] [1 1 0]])
(def r4 [[1 1 0] [1 0 1] [1 1 0]])

(defn find-first "find the first matching item" 
         [f coll]
         (first (filter f coll)))

(defn- diagonal "diagonal elements of a relation" [r]
  (for [x (range 0 (count r))] [(get-in r [x x]) x]))

(defn non-reflexive? "the relation isn't reflexive?" [r]
  (find-first #(= 0 (first %)) (diagonal r)))

(defn non-irreflexive? "the relation isn't irreflexive?" [r]
  (find-first #(= 1 (first %)) (diagonal r)))

(defn- satisfy2 "pairs from r where f holds" [f r]
  (let [rr (range 0 (count r))]
    (for [x rr, y rr :when (f r x y)] [x y])))

(defn- mirrored "values at opposite places" [coll r]
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

(defn- void0 "add a uninteresting value for the sake of similarity"
  [coll]
  (if (nil? coll)
    nil
    (cons 0 coll)))

(defn non-strongly-connected? "the relation is non-s-connected?" [r]
  (void0
    (first (satisfy2 #(= (+ (get-in %1 [%2 %3]) 
                            (get-in %1 [%3 %2])) 0) r))))

(defn non-connected? "the relation is non-s-connected?" [r]
  (void0
    (first (satisfy2 
             #(and (not= %2 %3) 
                   (= (+ (get-in %1 [%2 %3]) 
                         (get-in %1 [%3 %2]))))
             r))))
 
(non-connected? r3)

(defn- satisfy3 "pairs from r where f holds" [f r]
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
              (= (get-in %1 [%2 %4]) 1))
        r)))) ; 1!

(def names "names of the relations"
  ["reflexív" "irreflexív"
   "szimmetrikus" "aszimmetrikus" "antiszimmetrikus"
   "összefüggő" "erősen összefüggő"
   "tranzitív" "intranzitív"])
(def functions "functions of the relations"
  [non-reflexive? non-irreflexive?
   non-symmetric? non-asymmetric? non-antisymmetric?
   non-connected? non-strongly-connected?
   non-transitive? non-intransitive?])

;; we have 9 relations
(defn number-of-good-answers [g]
  (case g
    1 1
    2 (+ 1 (rand-int 2))
    3 (+ 1 (rand-int 3))
    (4 5 6) (+ 1 (rand-int 4))
    7 (+ 2 (rand-int 3))
    8 (+ 3 (rand-int 2))
    9 4))

;; for MCQ questions
(def prize   "if you have good answer" [0.0 100.0     50.0  33.33333 25.0])
(def penalty "if you haven't"          [0.0 -33.33333 -50.0 -100.0    0.0]) 

(defn feedbacktext "generate the text of the feedback" [v]
  (condp = (count v)
    2 (str "x=" (inc (second v)))
    3 (str "x=" (inc (second v)) " és y=" (inc (nth v 2)))
    4 (str "x=" (inc (second v)) 
           ", y=" (inc (nth v 2)) 
           " és z=" (inc (nth v 3)))))

(defn construct-relation-answer "generate the answer" [r]
  (let [answers (map vector (for [x functions] (x r)) names)
        sol (filter #(nil? (first %)) answers)
        no-sol (filter #((complement nil?) (first %)) answers)]
    (if (> (count sol) 0)
      (let
        [sz (count sol)                      ; no of all good answers
         r  (number-of-good-answers sz)      ; select some of them
         s4 (take r (shuffle sol))
         n3 (take (- 4 r) (shuffle no-sol))] ; the others are wrong answers
        (concat 
          (for [x s4] [(second x) 
                       (nth prize r)])
          (for [y n3] [(second y) 
                       (nth penalty r) 
                       (feedbacktext (first y))]))))))

(defn print-row "print one row of the table" [y xs]
   (str "<tr><th>" y "</th>" 
     (clojure.string/join 
       (for [x xs] (str "<td>" 
                     (if (= x 1) "X" "-") 
                     "</td>")))
     "</tr>"))
(print-row  1 [1 2 3])

(defn construct-relation-question "generate the question" [r]
  (str "Adott az alábbi reláció. Válassza ki, hogy a " 
     "felsoroltak közül mely tulajdonságok teljesülnek a relációra!"
     "<table><tr><td></td><th>1</th><th>2</th><th>3</th></tr>"
    (clojure.string/join      
      (for [x (range 0 (count r))]
        (print-row (inc x) (get r x)))) 
    "</table>"))         

(construct-relation-question r1)

(defn my-bit "mask a number to get a bit" [i mask]
  (/ (bit-and i mask) mask))
(defn construct-relation "generate a relation problem" [i]
  (let [x (rand-int 512)
        r [
           [(my-bit x 1) (my-bit x 2) (my-bit x 4)]
           [(my-bit x 8) (my-bit x 16) (my-bit x 32)]
           [(my-bit x 64) (my-bit x 128) (my-bit x 256)]]
        a (construct-relation-answer r)]
    (if (nil? a) nil
      [(construct-relation-question r)
       a
       (str "RP1-" i)])))
     
(construct-relation 25)        

