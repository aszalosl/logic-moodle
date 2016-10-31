(ns logic.map
  (:gen-class))

(defn diff
  "distance of two vector"
  [a b]
  (let [l (count a)]
    (loop [i 0
           c 0]
      (if (< i l)
        (if (= 1 (+ (a i) (b i)))
           (recur (inc i) (inc c))
           (recur (inc i) c))
        c))))

(diff [1 1 1 0] [1 1 0 1])
(diff [1 1 1 0] [1 1 0 0])
(diff [1 1 1 1] [0 0 0 0])
(diff [1 1 1 0] [1 1 0 1])

(< [1 1 0] [0 1 1])

(for [x (range 0 3) y (range 0 3) :when (< x y)] 
  (if (= 1 (diff [x y])

