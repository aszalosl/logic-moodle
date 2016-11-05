(ns logic.map-test
  (:use clojure.test)
  (:use logic.map))

(deftest diff-implicants-test
  (is (= 2 (diff-implicants [1 1 1 0] [1 1 0 1])))
  (is (= 1 (diff-implicants [1 1 1 0] [1 1 0 0])))
  (is (= 3 (diff-implicants [1 1 1 0] [0 0 0 0])))
  (is (= 4 (diff-implicants [1 1 1 1] [0 0 0 0])))
  (is (= 2 (diff-implicants [1 1 1 0] [0 1 1 1])))
  (is (= 1 (diff-implicants [1] [0])))
  (is (= 0 (diff-implicants [0] [0])))
  (is (= 1000 (diff-implicants [:x] [1])))
  (is (= 1 (diff-implicants [0 1 :x 0] [0 1 :x 1])))
  (is (= 1 (diff-implicants [1 1 1] [0 1 1]))) )

(deftest combine-implicants-test
  (is (= [:x] (combine-implicants [1] [0])))
  (is (= [:x :x :x] (combine-implicants [1 0 1] [0 1 0])))
  (is (= [0 0 0] (combine-implicants [0 0 0] [0 0 0])))
  (is (= [1 1 1 1] (combine-implicants [1 1 1 1] [1 1 1 1])))
  (is (= [0 0 :x 1] (combine-implicants [0 0 0 1] [0 0 1 1])))
  (is (= [0 :x :x 1] (combine-implicants [0 :x 0 1] [0 :x 1 1]))))

(deftest hide-test
  (is (hide? [:x] [0]))
  (is (hide? [:x] [1]))
  (is (hide? [0 :x 1] [0 0 1]))
  (is (hide? [0 :x 1] [0 1 1]))
  (is (not (hide? [0 :x 1] [0 1 0])))
  (is (not (hide? [0 :x 1] [0 1 :x])))
  (is (hide? [0 :x :x] [0 :x 1]))
  (is (hide? [0 :x :x] [0 1 :x])))

(deftest visible-test
  (is (= '([0 0] [1 0]) (visible [:x 1] [[0 0] [0 1] [1 0] [1 1]])))
  (is (= '([0 1] [1 1]) (visible [:x 0] [[0 0] [0 1] [1 0] [1 1]])))
  (is (= '([1 0] [1 1]) (visible [0 :x] [[0 0] [0 1] [1 0] [1 1]])))
  (is (= () (visible [:x :x] [[0 0] [0 1] [1 0] [1 1]]))))

(deftest to-binary-test
  (is (= [0] (to-binary 0 1)))
  (is (= [0 0 0 0] (to-binary 0 4)))
  (is (= [1] (to-binary 1 1)))
  (is (= [0 0 0 1] (to-binary 1 4)))
  (is (= [1 1 1 1] (to-binary 15 4)))
  (is (= [1 1 1 0] (to-binary 14 4))))

(deftest minterms-test
  (is (= [] (minterms 0 2)))
  (is (= [[0 0]] (minterms 1 2)))
  (is (= [[0 1]] (minterms 2 2)))
  (is (= [[0 0][0 1]] (minterms 3 2)))
  (is (= [[0 0] [0 1] [1 0]] (minterms 7 2)))
  (is (= [[1 1]] (minterms 8 2))))

(deftest dfn-test
  (is (= "()" (km-cnf 0 2)))
  (is (= "" (km-dnf 0 2)))
  (is (= "(\\lnot p \\land \\lnot q)" (km-dnf 1 2)))
  (is (= "\\lnot p \\land \\lnot q" (km-cnf 1 2)))
  (is (= "(\\lnot p \\land q)" (km-dnf 2 2)))
  (is (= "\\lnot p" (km-dnf 3 2)))
  (is (= "\\lnot q" (km-dnf 5 2)))
  (is (= "(\\lnot p \\land \\lnot q) \\lor (p \\land q)" (km-dnf 9 2)))
  (is (= "(\\lnot p \\lor q) \\land (p \\lor \\lnot q)" (km-cnf 9 2)))
  (is (= "\\lnot p \\lor q" (km-dnf 11 2))))







