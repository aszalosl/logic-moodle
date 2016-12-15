(ns logic.congruence
  (:require [logic.write-formula :as w]
            [logic.random-formula :as r]
            [logic.common :as cmn]
            [clojure.set :as s])
  (:gen-class))

;; congruent formulae
(defn binding-walk
  [e bs c]
  "Add information about bindings.
  Args:
  e - expression (formula/term)
  bs - list of bindings
  c - counter"
  (if (vector? e)
    (let [op (first e)
          e1 (get e 1)
          e2 (get e 2)]
      (cond
        (contains? #{:f :P :not} op)
        (let [[be c1] (binding-walk e1 bs c)]
          [[op be] c1])
        (contains? #{:g :Q :or :and :imp :equ :eq} op)
        (let [[b1 c1] (binding-walk e1 bs c)
              [b2 c2] (binding-walk e2 bs c1)]
          [[op b1 b2] c2])
        (contains? #{:all :ex} op)
        (let [bs1 (assoc bs e1 c)
              [b2 c2] (binding-walk e2 bs1 (inc c))]
          [[op {:name e1, :id c} b2] c2])))
    (if (some #(= e %) (keys bs))
      [{:bound (get bs e), :name e } c]
      [{:name e, :bind (keys bs)} c])))

(defn bindings
  "Free variables and their environments.
  Args:
  e - formula or term
  bs - set of bounded vars"
  [e bs]
  (if (vector? e)
    (let [op (first e)
          e1 (get e 1)
          e2 (get e 2)]
      (cond
        (contains? #{:f :P :not} op) (bindings e1 bs)
        (contains? #{:g :Q :or :and :imp :equ :eq} op)
        (into (bindings e1 bs) (bindings e2 bs))
        (contains? #{:all :ex} op)
        (bindings e2 (conj bs e1))))
    (if (or (.contains bs e) (contains? #{:c :d } e))
      nil
      [{:name e, :bound bs}])))

(defn params
  "The variables of a term.
  Args:
  t - term
  s - set of yet found vars."
  [t vs]
  (if (vector? t)
    (let [op (first t)
          t1 (get t 1)
          t2 (get t 2)]
      (case op
        :f (params t1 vs)
        :g (s/union (params t1 vs) (params t2 vs))))
    (if (contains? #{:x :y :z} t)
      (if (contains? vs t)
        vs
        (conj vs t))
      #{})))


(defn subs?
  "Can we substitutute t instead of x in f?
  Returns the problematic parameter.
  Args:
  f - formula
  x - variable
  t - term"
  [f x t]
  (let [free-vars (bindings f #{})
        ps (params t #{})
        to-change (filter #(= x (get % :name)) free-vars)
        env (apply s/union (map #(get % :bound) to-change))]
    (s/intersection ps env)))

(defn substitute
  "Substitute t instead of x in f.
  Args:
  f - formula
  x - variable
  t - term"
  [f x t]
  (if (vector? f)
    (let [op (first f)
          f1 (get f 1)
          f2 (get f 2)]
      (cond
        (contains? #{:f :P :not} op) [op (substitute f1 x t)]

        (contains? #{:g :Q :or :and :imp :equ :eq} op)
        [op (substitute f1 x t) (substitute f2 x t)]

        (contains? #{:all :ex} op)
        (if (= f1 x) [op f1 f2] [op f1 (substitute f2 x t)])))
    (if (= x f) t f)))

(defn generate-answer
  "Based on a concrete formula, variable and term, construct the response.
  Args:
  f - formula
  x - variable
  t - term
  c - number of good answers"
  [f x t c]
  (let [q (str "\\( A(" (w/write-term x) "||" (w/write-term t) ") \\)")
        a (subs? f x t)
        fxt (substitute f x t)]
    (if (= a #{})
      [q (nth cmn/prize c) (str "A helyettesítés eredménye: \\(" (w/write-short fxt) "\\)")]
      [q (nth cmn/penalty c) (str "A helyettesítés során a \\(" (w/write-term (first a)) "\\) kötötté válna")])))


(defn subs-test
  "Generate a random formula and several substitutions, 
  and based on them make a test.
  Args:
  i - question id
  fl - formula length
  fl2 - formula param
  tl - term length"
  [i fl fl2 tl]
  (let [f (r/random-formula1 fl fl2)
        t1 (r/random-term tl)
        t2 (r/random-term tl)
        t3 (r/random-term tl)
        t4 (r/random-term tl)
        x1 (rand-nth [:x :y :z])
        x2 (rand-nth [:x :y :z])
        x3 (rand-nth [:x :y :z])
        x4 (rand-nth [:x :y :z])
        s1 (subs? f x1 t1)
        s2 (subs? f x2 t2)
        s3 (subs? f x3 t3)
        s4 (subs? f x4 t4)
        sc (count (filter #(= % #{}) [s1 s2 s3 s4]))]
    (when (and
            (< 0 sc)
            (or (.contains (flatten f) :ex) (.contains (flatten f) :all)))
      (let [q (str "Az alábbiak közül melyik esetben megengedett a behelyettesítés, ahol A a következő formula \\(" (w/write-short f) "\\)?")
            a [(generate-answer f x1 t1 sc) (generate-answer f x2 t2 sc) (generate-answer f x3 t3 sc) (generate-answer f x4 t4 sc)]
            id (str "SUB1-" i)]
        [q a id]))))

(defn subs1 [i] (subs-test i 5 4 4))
