(ns logic.formula
  (:require [clojure.string :as s]
            [clojure.set :as cs]
            [logic.generate-formula :as gf]
            [logic.quine-table :as qt]
            [logic.random-formula :as rf]
            [logic.write-formula :as wf])
  (:gen-class))



(defn my-bit
  "One bit of the value.
  Args:
   value - input
   mask  - some power of 2
  Output: value of the corresponding bit: 0 or 1"
  [value mask]
  (if (= 0 (bit-and value mask)) "0" "1"))


(defn ** "power function" [x n] (reduce * (repeat n x)))

