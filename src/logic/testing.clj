(ns logic.testing
  (:require [clojure.string :as s])
  (:gen-class))

;; ### testing the hand-generated semi-problems 
;;
;; Write in LaTeX format

(defn good-part [problem]
  (str "\\begin{enumerate}\n" 
       (clojure.string/join "\n" 
                            (map #(str "  \\item " %) 
                                 (:good problem))) 
       "\n\\end{enumerate}\n"))


(defn wrong-part [problem]
  (str "\\begin{enumerate}\n" 
       (clojure.string/join "\n" 
                            (map 
                              #(str "  \\item " (first %) "  [" (second %) "]") 
                              (:wrong problem))) 
       "\n\\end{enumerate}\n"))

(defn print-problem [problem]
  (str "\\textbf{" (:question problem) "}\\smallskip\n" (good-part problem) (wrong-part problem)))

(defn write-problems [in out]
  (spit out 
       (str "\\documentclass{article}\\usepackage[utf8]{inputenc}\\usepackage[T1]{fontenc}\\begin{document}\n"
            (s/join (map print-problem (read-string (slurp in))))
            "\\end{document}" )))

