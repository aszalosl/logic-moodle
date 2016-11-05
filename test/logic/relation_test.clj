(ns logic.relation-test
  (:use clojure.test)
  (:use logic.relation))

(deftest find-first-testing
  (is (= (find-first pos? [-2 -1 1 2 3]) 1))
  (is (= (find-first neg? [-2 -1 0]) -2)))

(def r-equal [[1 0 0]
              [0 1 0]
              [0 0 1]])

(def r-non-equal [[0 1 1]
                  [1 0 1]
                  [1 1 0]])

(def r-less-than [[0 1 1]
                  [0 0 1]
                  [0 0 0]])

(def r-less-or-eq [[1 1 1]
                   [0 1 1]
                   [0 0 1]])

(def rrand1 [[0 1 0]
             [0 1 0]
             [0 0 1]])

(deftest reflexivity
  (is (= (non-reflexive? r-equal) nil)) ; +
  (is (= (non-reflexive? r-non-equal) [0 0])) 
  (is (= (non-reflexive? r-less-than) [0 0]))
  (is (= (non-reflexive? r-less-or-eq) nil)
    (is (= (non-reflexive? rrand1) [0 0]))))
  
(deftest irreflexivity
  (is (= (non-irreflexive? r-equal) [1 0])) ; +
  (is (= (non-irreflexive? r-non-equal) nil)) 
  (is (= (non-irreflexive? r-less-than) nil))
  (is (= (non-irreflexive? r-less-or-eq) [1 0]))
  (is (= (non-irreflexive? rrand1) [1 1])))
   
(deftest symmetric
  (is (= (non-symmetric? r-equal) nil))
  (is (= (non-symmetric? r-non-equal) nil))
  (is (= (non-symmetric? r-less-than) [0 0 1]))
  (is (= (non-symmetric? r-less-or-eq) [0 0 1]))
  (is (= (non-symmetric? rrand1) [0 0 1])))

(deftest asymmetric
  (is (= (non-asymmetric? r-equal) [1 0 0]))
  (is (= (non-asymmetric? r-non-equal) [1 0 1]))
  (is (= (non-asymmetric? r-less-than) nil))
  (is (= (non-asymmetric? r-less-or-eq) [1 0 0]))
  (is (= (non-asymmetric? rrand1) [1 1 1])))

(deftest antisymm
  (is (= (non-antisymmetric? r-equal) nil))
  (is (= (non-antisymmetric? r-non-equal) [1 0 1]))
  (is (= (non-antisymmetric? r-less-than) nil))
  (is (= (non-antisymmetric? r-less-or-eq) nil))
  (is (= (non-antisymmetric? rrand1) nil)))

(deftest strongly-connected
  (is (= (non-strongly-connected? r-equal) '(0 0 1)))
  (is (= (non-strongly-connected? r-non-equal) '(0 0 0)))
  (is (= (non-strongly-connected? r-less-than) '(0 0 0)))
  (is (= (non-strongly-connected? r-less-or-eq) nil))
  (is (= (non-strongly-connected? rrand1) '(0 0 0))))

(deftest connected
  (is (= (non-connected? r-equal) '(0 0 1)))
  (is (= (non-connected? r-non-equal) '(0 0 1)))
  (is (= (non-connected? r-less-than) '(0 0 1)))
  (is (= (non-connected? r-less-or-eq) '(0 0 1)))
  (is (= (non-connected? rrand1) '(0 0 1))))

(deftest transitive
  (is (= (non-transitive? r-equal) nil))
  (is (= (non-transitive? r-non-equal) '(0 0 1 0)))
  (is (= (non-transitive? r-less-than) nil))
  (is (= (non-transitive? r-less-or-eq) nil))
  (is (= (non-transitive? rrand1) nil)))

(deftest intransitive
  (is (= (non-intransitive? r-equal) '(0 0 0 0)))
  (is (= (non-intransitive? r-non-equal) '(0 0 1 2)))
  (is (= (non-intransitive? r-less-than) '(0 0 1 2)))
  (is (= (non-intransitive? r-less-or-eq) '(0 0 0 0)))
  (is (= (non-intransitive? rrand1) '(0 0 1 1))))

