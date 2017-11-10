(ns logic.quine-table-test
  (:use clojure.test)
  (:use logic.quine-table))

(deftest code1-testing
  (is (= 0 (code1 [:and [:not :p] :p])))
  (is (= 1 (code1 [:not :p])))
  (is (= 2 (code1 :p)))
  (is (= 3 (code1 [:or [:not :p] :p]))) )

(deftest code2-testing
  (is (= 1  (code2 [:and [:not :p] [:not :q]])))
  (is (= 2 (code2 [:and :q [:not :p]])))
  (is (= 3 (code2 [:not :p])))
  (is (= 4 (code2 [:and :p [:not :q]])))
  (is (= 5 (code2 [:not :q])))
  (is (= 6 (code2 [:not [:equ :p :q]])))
  (is (= 7 (code2 [:or [:not :p] [:not :q]])))
  (is (= 8 (code2 [:and :p :q])))
  (is (= 9 (code2 [:equ :p :q])))
  (is (= 10 (code2 :q)))
  (is (= 11 (code2 [:imp :p :q])))
  (is (= 12 (code2 :p)))
  (is (= 13 (code2 [:imp :q :p])))
  (is (= 14 (code2 [:or :p :q]))))

(deftest code3-testing
  (is (= 128 (code3 [:and :p [:and :q :r]])))
  (is (= 254 (code3 [:or :p [:or :q :r]])))
  (is (= 150 (code3 [:equ :p [:equ :q :r]])))
  (is (= 191 (code3 [:imp :p [:imp :q :r]])))
  (is (= 186 (code3 [:imp [:imp :p :q] :r]))))

