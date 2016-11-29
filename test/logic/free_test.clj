(ns logic.free-test
  (:use clojure.test)
  (:use logic.free))

(deftest all-var-test
  (is (= #{:x} (all-var :x)))
  (is (= #{:y} (all-var :y)))
  (is (= #{:w} (all-var :w)))
  (is (= #{:c} (all-var :c)))
  (is (= #{:x} (all-var [:f :x])))
  (is (= #{:x :y} (all-var [:g :x :y])))
  (is (= #{:x} (all-var [:g :x :x])))
  (is (= #{:x} (all-var [:P [:f :x]])))
  (is (= #{:x} (all-var [:Q [:f :x] [:g :x :x]])))
  (is (= #{:x :y :z} (all-var [:Q [:f :x] [:g :y :z]])))
  (is (= #{:x} (all-var [:equ [:P [:f :x]] [:P [:f :x]]])))
  (is (= #{:x :y} (all-var [:equ [:P [:f :x]] [:P [:f :y]]])))
  (is (= #{:x} (all-var [:not [:P [:f :x]]])))
  (is (= #{:x} (all-var [:all :x [:P [:f :x]]])))
  (is (= #{:x :y} (all-var [:all :y [:P [:f :x]]])))
  (is (= #{:x :y} (all-var [:all :x [:P [:f :y]]])))
  (is (= #{:x :y} (all-var [:ex :y [:all :x [:P [:f :y]]]]))))

(deftest free-var-test
  (is (= #{:x} (free-var :x)))
  (is (= #{:y} (free-var :y)))
  (is (= #{:w} (free-var :w)))
  (is (= #{} (free-var :c)))
  (is (= #{:x} (free-var [:f :x])))
  (is (= #{:x :y} (free-var [:g :x :y])))
  (is (= #{:x} (free-var [:g :x :x])))
  (is (= #{:x} (free-var [:P [:f :x]])))
  (is (= #{:x} (free-var [:Q [:f :x] [:g :x :x]])))
  (is (= #{:x :y :z} (free-var [:Q [:f :x] [:g :y :z]])))
  (is (= #{:x} (free-var [:equ [:P [:f :x]] [:P [:f :x]]])))
  (is (= #{:x :y} (free-var [:equ [:P [:f :x]] [:P [:f :y]]])))
  (is (= #{:x} (free-var [:not [:P [:f :x]]])))
  (is (= #{} (free-var [:all :x [:P [:f :x]]])))
  (is (= #{:x} (free-var [:all :y [:P [:f :x]]])))
  (is (= #{:y} (free-var [:all :x [:P [:f :y]]])))
  (is (= #{} (free-var [:ex :y [:all :x [:P [:f :y]]]]))))

(deftest bound-var-test
  (is (= #{} (bound-var :x)))
  (is (= #{} (bound-var :y)))
  (is (= #{} (bound-var :w)))
  (is (= #{} (bound-var :c)))
  (is (= #{} (bound-var [:f :x])))
  (is (= #{} (bound-var [:g :x :y])))
  (is (= #{} (bound-var [:g :x :x])))
  (is (= #{} (bound-var [:P [:f :x]])))
  (is (= #{} (bound-var [:Q [:f :x] [:g :x :x]])))
  (is (= #{} (bound-var [:Q [:f :x] [:g :y :z]])))
  (is (= #{} (bound-var [:equ [:P [:f :x]] [:P [:f :x]]])))
  (is (= #{} (bound-var [:equ [:P [:f :x]] [:P [:f :y]]])))
  (is (= #{} (bound-var [:not [:P [:f :x]]])))
  (is (= #{:x} (bound-var [:all :x [:P [:f :x]]])))
  (is (= #{:y} (bound-var [:all :y [:P [:f :x]]])))
  (is (= #{:x} (bound-var [:all :x [:P [:f :y]]])))
  (is (= #{:x :y} (bound-var [:ex :y [:all :x [:P [:f :y]]]]))))

(deftest var-walk-test
  (is (= [{:name :x :id 0} 1] 
         (var-walk :x 0)))
  (is (= [[:f {:name :x :id 0}] 1] 
         (var-walk [:f :x] 0)))
  (is (= [[:g {:name :x :id 0} {:name :x :id 1}] 2]
         (var-walk [:g :x :x] 0)))
  (is (= [[:eq [:P {:name :x :id 0}] [:P {:name :y :id 1}]] 2]
         (var-walk [:eq [:P :x] [:P :y]] 0)))
  (is (=[[:all {:name :y :id 0} [:eq [:P {:name :x :id 1}] [:P {:name :y :id 2}]]] 3]
         (var-walk [:all :y [:eq [:P :x] [:P :y]]] 0)))
  (is (= [[:all {:name :z :id 0} [:eq [:P {:name :x :id 1}] [:P {:name :y :id 2}]]] 3]
         (var-walk [:all :z [:eq [:P :x] [:P :y]]] 0)))
  (is (= [[:all {:name :x :id 0} {:name :u :id 1}] 2]
         (var-walk [:all :x :u] 0))))

(deftest bound-walk-test
  (is (= :c
         (bound-walk :c #{})))
  (is (= {:name :x, :id 0, :bounded false}
         (bound-walk {:name :x, :id 0} #{})))
  (is (= [:all {:name :z, :id 0, :bounded true} [:eq [:P {:name :x, :id 1, :bounded false}] [:P {:name :y, :id 2, :bounded false}]]]
         (bound-walk [:all {:name :z, :id 0} [:eq [:P {:name :x, :id 1}] [:P {:name :y, :id 2}]]] #{})))

  (is (= [:all {:name :x, :id 0, :bounded true} [:eq [:P {:name :x, :id 1, :bounded true}] [:P {:name :y, :id 2, :bounded false}]]]
         (bound-walk [:all {:name :x, :id 0} [:eq [:P {:name :x, :id 1}] [:P {:name :y, :id 2}]]] #{}))))


(deftest write-term-test
  (is (= "y" (write-term {:name :y, :id 3, :bounded true} '(1 2))))
  (is (= "y_1" (write-term {:name :y, :id 3, :bounded true} '(3 5))))
  (is (= "y_2" (write-term {:name :y, :id 3, :bounded true} '(1 3)))))

(deftest write-indexed-test
  (is (= "P(x)" (write-indexed (bound-walk (first (var-walk [:P :x] 0)) #{}) 0 false '(2 3 4))))
  (is (= "P(x_1)" (write-indexed (bound-walk (first (var-walk [:P :x] 0)) #{}) 0 false '(0 3 4))))
  (is (= "Q(x_1,y_2)" (write-indexed (bound-walk (first (var-walk [:Q :x :y] 0)) #{}) 0 false '(0 1 4)))))
