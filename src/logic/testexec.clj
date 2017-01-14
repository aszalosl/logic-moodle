(ns logic.testexec
  (:require [logic.testing :as t]))

(if (= 3 (count *command-line-args*))
  (t/write-problems (second *command-line-args*) (nth *command-line-args* 2))
  (println *command-line-args*))
