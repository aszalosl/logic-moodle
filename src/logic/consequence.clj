(ns logic.consequence
  (:require [logic.generate-formula :as gf]
            [logic.quine-table :as qt]
            [logic.write-formula :as wf]
            [clojure.string :as s])
  (:gen-class))
;; ### Quizzes for satisfiability, contradiction, equivalence

;; Only with 2 parameters

(def form2
  "Formulae with two parameters."
  (gf/form [:p :q]))

(defn equ-class2
  "Equivalence class of formulae with code n.
  Arg: the code"
  [n]
  (for [x form2 :when (= n (qt/code2 x))] x))

;; #### some quiz for a formula

(defn print-good-items
  "Print the good formulae in formatted way.
  Args:
   code - id of the equivalence class
   n - number of formulae
   full - write with all paren.? (bool)"
  [code n full]
  (s/join (map #(str
                  "    \"\\( "
                  ((if full wf/write-full wf/write-short) %)
                  " \\)\"\n")
             (repeatedly n #(rand-nth (equ-class2 code))))))

(comment (print-good-items 5 4 false))

(defn print-bad-items
  "Print the not suitable formulae and a feedback about its class
  Args:
   code - id of the equivalence class
   n - number of formulae
   full - write with all paren.? (bool)"
  [code n full]
  (s/join (map #(str
                  "    [\"\\( "
                  ((if full wf/write-full wf/write-short) %)
                  " \\)\""
                  " \" a formula eredetije: \\( "
                  (wf/write-full %)
                  " \\)<br>az igazságtábla főoszlopa: "
                  (qt/ttmc2 code)
                  "\"]\n")
             (repeatedly n #(rand-nth (equ-class2 code))))))

(defn cont-semi-question2
  "Generate semi-questions about contradictory formulae"
  [full]
  (str "[{:question \"Jelölje meg a kielégíthetetlen formulákat!\"\n  :good [\n"
       (print-good-items 0 30 full)
       "  ]\n  :wrong [\n"
       (s/join (for [i (range 1 16)] (print-bad-items i 5 full)))
       "]}]\n"))

(defn valid-quiz2
  "Generate semi-questions about valid formulae"
  [full]
  (str "[{:question \"Jelölje meg az érvényes formulákat!\"\n  :good [\n"
       (print-good-items  15 30 full)
       "  ]\n  :wrong [\n"
       (s/join (for [i (range 0 15)] (print-bad-items i 5 full)))
       "]}]\n"))

(defn sat-quiz2
  "Generate semi-questions about satisfiable formulae"
  [full]
  (str "[{:question \"Jelölje meg a kielégíthető,"
       " de nem érvényes formulákat!\"\n  :good [\n"
       (s/join (for [i (range 1 15)] (print-good-items i 5 full)))
       "  ]\n  :wrong [\n"
       (s/join [(print-bad-items 0 30 full) (print-bad-items 15 30 full)])
       "]}]\n"))


(defn logic_conseq
  "Generate semi-question about logical consequence of a formula"
  [full]
  (s/join
    (for [i (range 0 16)]
      (str " {:question \"Jelölje meg a \\( "
           ((if full wf/write-full wf/write-short) (rand-nth (equ-class2 i)))
           " \\) formula logikai következményeit!\"\n  :good [\n"
           (s/join (for [j (range 0 16) :when (= 0 (bit-and i (- 15 j)))]
                     (print-good-items j 5 full)))
           "  ]\n  :wrong [\n"
         (s/join
           (for [k (range 0 4) j (range 0 16)
                  :when (not= 0 (bit-and i (- 15 j)))]
             (str
               "            [\"\\( " ((if full wf/write-full wf/write-short)
                                      (rand-nth (equ-class2 j))) " \\)\""
               " \"a konklúzió igazságtáblájának főoszlopa: " (qt/ttmc2 j)
               ", míg a hipotézis igazságtáblájának főoszlopa " (qt/ttmc2 i)
               " \"]\n")))
         "]}\n"))))


(defn logic_conseq2
  "Generate semi-questions about logical consequence of something"
  [full]
  (s/join
    (for [i (range 0 16)]
      (str " {:question \"Jelölje meg azokat a formulákat, melyeknek a \\( "
           ((if full wf/write-full wf/write-short) (rand-nth (equ-class2 i)))
           " \\) formula logikai következménye! (Külön-külön)\"\n  :good [\n"
           (s/join (for [j (range 0 16) :when (= 0 (bit-and j (- 15 i)))]
                     (print-good-items j 5 full)))
           "  ]\n  :wrong [\n"
         (s/join
           (for [k (range 0 4) j (range 0 16)
                  :when (not= 0 (bit-and j (- 15 i)))]
             (str
               "            [\"\\( " ((if full wf/write-full wf/write-short)
                                      (rand-nth (equ-class2 j))) " \\)\""
               " \"a hipotézis igazságtáblájának főoszlopa: " (qt/ttmc2 j)
               ", míg a konklúzió igazságtáblájának főoszlopa " (qt/ttmc2 i)
               " \"]\n")))
         "]}\n"))))

;; #### some quiz for set of formulae

(defn make-quiz2
  "Generate semi-questions with criteria f
  Args:
   f - criteria
   question - text of the question
   full - write all the parens.?"
  [f question full]
  (str " {:question \"" question "\"\n  :good [\n"
       (s/join (for [x (range 0 16) y (range 0 16) :when (f x y)]
                 (str "         \"\\( \\{"
                      ((if full wf/write-full wf/write-short) (rand-nth (equ-class2 x)))
                      ",\\ "
                      ((if full wf/write-full wf/write-short) (rand-nth (equ-class2 y)))
                      "\\} \\)\"\n")))
       "  ]\n  :wrong [\n"
       (s/join (for [x (range 0 16) y (range 0 16) :when (not (f x y))]
                 (str "          [\"\\( \\{"
                      ((if full wf/write-full wf/write-short) (rand-nth (equ-class2 x)))
                      ",\\ "
                      ((if full wf/write-full wf/write-short) (rand-nth (equ-class2 y)))
                      "\\} \\)\" \""
                      "az igazságtáblák főoszlopai " (qt/ttmc2 x) " és "
                      (qt/ttmc2 y) "\"]\n")))
       "]}\n"))


(defn logic_conseq3
  "Generate a semi-questions about logical consequence of formulae"
  [full]
  (s/join
    (for [i (range 0 16) j (range 0 16) :when (< i j)]
      (str " {:question \"Jelölje meg a \\( \\{"
           ((if full wf/write-full wf/write-short) (rand-nth (equ-class2 i)))
           "\\), \\("
           ((if full wf/write-full wf/write-short) (rand-nth (equ-class2 j)))
           "\\} "
           " \\) formulahalmaz logikai következményeit!\"\n  :good [\n"
           (s/join (for [k (range 0 16) :when (= 0 (bit-and i j (- 15 k)))]
                     (print-good-items k 5 full)))
           "  ]\n  :wrong [\n"
         (s/join
           (for [l (range 0 4) k (range 0 16)
                  :when (not= 0 (bit-and i j (- 15 k)))]
             (str
               "            [\"\\( "
               ((if full wf/write-full wf/write-short) (rand-nth (equ-class2 k)))
               " \\)\""
               " \"a konklúzió igazságtáblájának főoszlopa: " (qt/ttmc2 k)
               ", míg a hipotézisek igazságtábláinak főoszlopai " (qt/ttmc2 i)
               " és " (qt/ttmc2 j) " \"]\n")))
         "]}\n"))))
