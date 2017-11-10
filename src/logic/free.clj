(ns logic.free
  (:require [clojure.set :as s]
            [logic.write-formula :as w]
            [logic.common :as cmn]
            [logic.random-formula :as r])
  (:gen-class))
;; free and bound variables of a 1st-order formula

(defn all-var
  "all the vars and constans in expression e"
  [e]
  (if (vector? e)
    (let [op (get e 0)
          e1 (get e 1)
          e2 (get e 2)]
     (condp = op
       :f (all-var e1)
       :P (all-var e1)
       :not (all-var e1)
       :all (s/union #{e1} (all-var e2))
       :ex  (s/union #{e1} (all-var e2))
       (s/union (all-var e1) (all-var e2))))
   #{e}))

(defn free-var
  "Set of free variables of expression e"
  [e]
  (if (vector? e)
    (let [op (first e)
          e1 (get e 1)
          e2 (get e 2)]
      (condp = op
        :f (free-var e1)
        :P (free-var e1)
        :g (s/union (free-var e1) (free-var e2))
        :Q (s/union (free-var e1) (free-var e2))
        :not (free-var e1)
        :all (s/difference (free-var e2) (set [e1]))
        :ex  (s/difference (free-var e2) (set [e1]))
        (s/union (free-var e1) (free-var e2))))
    (case e :c #{} :d #{} :x #{:x} :y #{:y} :z #{:z} :u #{:u} :v #{:v} :w #{:w})))

(defn bound-var
  "Set of bound variables of expression e"
  [e]
  (if (vector? e)
    (let [op (first e)
          se (second e)]
      (condp = op
        :f #{}
        :P #{}
        :g #{}
        :Q #{}
        :not (bound-var se)
        :all (s/union (set [se]) (bound-var (nth e 2)))
        :ex  (s/union (set [se]) (bound-var (nth e 2)))
        (s/union (bound-var se) (bound-var (nth e 2)))))
    #{}))

(defn- feedback-text
  "Some explanation for the user about var/const. v."
  [v t]
  (if (contains? #{:c :d} v)
    (str (w/write-term v) " egy névkonstans, és nem egy változó")
    (str (w/write-term v) " változónak nincs " t " előfordulása")))

(defn freevar-question
  "Generate a question about free variables
  Args:
  l - length of formula
  lt - complexity of terms
  i - identifier of the question"
  [i l lt]
  (let [f (r/random-formula1 l lt)
        wf (w/write-short f)
        fv (free-var f)
        cfv (count fv)
        av (all-var f)]
    (when (and (>= (count av) 4) (< 0 cfv))
      (let [q (str "Mely változók elemei a \\(" wf "\\) formula FreeVar halmazának"
                   " ahol F(0)={c,d}, F1={f}, F2={g}, P1={P} és P2={Q}?")
            id (str "FV-" i)
            wv (take (- 4 cfv) (s/difference av fv))
            answers (concat
                      (for [x fv] [(w/write-term x) (nth cmn/prize cfv)])
                      (for [y wv] [(w/write-term y)
                                   (nth cmn/penalty cfv)
                                   (feedback-text y "szabad")]))]
        [q answers id]))))

(defn free1
  "Question about free variables"
  [i]
  (freevar-question i 7 6))

(defn boundvar-question
  "Generate a question about bound variables
  Args:
  l - length of formula
  lt - complexity of terms
  i - identifier of the question"
  [i l lt]
  (let [f (r/random-formula1 l lt)
        wf (w/write-short f)
        bv (bound-var f)
        cbv (count bv)
        av (all-var f)]
    (when (and (>= (count av) 4) (< 0 cbv))
      (let [q (str "Mely változók elemei a \\(" wf "\\) formula BoundVar halmazának"
                   " ahol F(0)={c,d}, F1={f}, F2={g}, P1={P} és P2={Q}?")
            id (str "BV-" i)
            wv (take (- 4 cbv) (s/difference av bv))
            answers (concat
                      (for [x bv] [(w/write-term x) (nth cmn/prize cbv)])
                      (for [y wv] [(w/write-term y)
                                   (nth cmn/penalty cbv)
                                   (feedback-text y "kötött")]))]
        [q answers id]))))

(defn bound1
  "Question about bound variables"
  [i]
  (boundvar-question i 7 6))

(defn var-walk
  "walk on a formula tree and rewrite the variables
  Args:
  t - tree
  c - counter"
  [t c]
  (if (vector? t)
    (cond
      (contains? #{:f :P :not} (first t))
      (let [[t1 c1] (var-walk (second t) c)]
        [[(first t) t1] c1])
      (contains?
        #{:g :Q :or :and :imp :equ :all :ex :eq}
        (first t))
      (let [[t1 c1] (var-walk (second t) c)
            [t2 c2] (var-walk (nth t 2) c1)]
        [[(first t) t1 t2] c2]))
    (if (contains? #{:x :y :z :u :v :w} t)
      [{:name t, :id c} (inc c)]
      [t c]))) 

(defn bound-walk
  "add boundness information to variables"
  [e s]
  (if (vector? e)
    (cond
      (contains? #{:f :P :not} (first e))
      [(first e) (bound-walk (second e) s)]
      (contains? #{:g :Q :or :and :imp :equ :eq} (first e))
      (let [e1 (bound-walk (second e) s)
            e2 (bound-walk (nth e 2) s)]
        [(first e) e1 e2])
      (contains? #{:all :ex} (first e))
      (let [vm (second e)
            v (get vm :name)
            s1 (conj s v)
            e1 (bound-walk (nth e 2) s1)]
        [(first e) (into vm {:bounded true}) e1]))
    (if (or (= e :c) (= e :d))
      e
      (if (contains? s (get e :name))
        (into e {:bounded true})
        (into e {:bounded false})))))

;(filter map? (flatten [:all {:name :x, :id 0, :bounded true} [:eq [:P {:name :x, :id 1, :bounded true}] [:P {:name :y, :id 2, :bounded false}]]]))

(comment (defn numbered-formula)
  "add numbers to the formula, to denote variables
  Args:
  f - formula
  is - indices"
  [f is]
  (for [pair (map-indexed vector f)]
    (if (contains? #{\x \y \z \u \v \w \t \s } (second pair))
      (str (second pair) (first pair))
      (second pair))))

(defn write-term
  "Add indices to variables, to able refer them in the questions.
  Args:
  e - expression (term)
  vars - list of variables"
  [e vars]
  (if (vector? e)
    (if (= :f (first e))
      (str "f(" (write-term (second e) vars) ")")
      (str "g("
           (write-term (second e) vars) ","
           (write-term (nth e 2) vars) ")"))
    (cond
      (= e :c) "c"
      (= e :d) "d"
      :else
      (let [r {:x "x", :y "y", :z "z", :u "u" :v "v" :w "w"}
            id (get e :id)
            v (get r (get e :name))]
        (if (contains? (set vars) id)
          (str v "_" (inc (.indexOf vars id)))
          (str v))))))

(defn write-indexed
  "Add indices to formula - written in short way.
  Args:
  e - expression (formula)
  outer - connective at outer level (needs parenthesis, or not)
  before - boolean (we are before the operator of previous level, or not)
  vars - list of variables"
  [e outer before vars]
  (if (vector? e)
    (let [op (first e)
          e1 (get e 1)
          e2 (get e 2)]
      (condp = op
        :P (str "P(" (write-term e1 vars) ")")
        :Q (str "Q(" (write-term e1 vars) "," (write-term e2 vars) ")")
        :not (str "\\lnot " (write-indexed e1 :not false vars))
        :all (str "\\forall " (write-term e1 vars) (write-indexed e2 :all false vars))
        :ex (str "\\exists " (write-term e1 vars) (write-indexed e2 :ex false vars))
        :eq (str (write-term e1 vars) "=" (write-term e2 vars))
        (let [wop (case op :imp "\\supset " :and "\\land "
                    :or "\\lor " :equ "\\equiv ")
              w1 (write-indexed e1 op true vars)
              w2 (write-indexed e2 op false vars )]
          (if (or (some #(= [outer op] %) w/precedence)
                  (and (= outer op) before))
            (str "(" w1 wop w2 ")")
            (str w1 wop w2)))))
    (case e :p "p", :q "q" :r "r")))

(defn free-occurences
  "generate a test about free occurences of variables.
  Args:
  i - id of the question
  f - formula of the question"
  [i f]
  (let [[f1 n] (var-walk f 0)         ; count the variables inside
        f2 (bound-walk f1 #{})        ; take care of boundness/freeness
        rand-nums (sort (take 4 (shuffle (range n))))  ; take 4 random indices
        variables (filter map? (flatten f2)) ; select the vars with these indices
        selected-vars (filter #(contains? (set rand-nums) (get % :id)) variables)
        bounded-vars (map #(get % :bounded) selected-vars)]  ; logic values
    (when (and
            (= 4 (count bounded-vars))
            (not (every? identity bounded-vars))) ; if there is one free variable (false) among them
      (let [qf (write-indexed f2 0 false rand-nums)
            q (str "A \\(" qf "\\) formulában az indexszel megjelölt változóelőfordulások közül melyik szabad?")
            id (str "FO-" i)
            fr (- 4 (get (frequencies bounded-vars) true 0)) ; number of good answers
            a (for [v selected-vars]
                [(str (inc (.indexOf selected-vars v)))
                 (if (get v :bounded) (nth cmn/penalty fr) (nth cmn/prize fr))])]
            [q a id]))))

(defn occur1 [i]
  (let [f (r/random-formula1 7 3)]
      (free-occurences i f)))

(defn bounded-occurences
  "generate a test about bounded occurences of variables.
  Args:
  i - id of the question
  f - formula of the question"
  [i f]
  (let [[f1 n] (var-walk f 0)         ; count the variables inside
        f2 (bound-walk f1 #{})        ; take care of boundness/freeness
        rand-nums (sort (take 4 (shuffle (range n))))  ; take 4 random indices
        variables (filter map? (flatten f2)) ; select the vars with these indices
        selected-vars (filter #(contains? (set rand-nums) (get % :id)) variables)
        bounded-vars (map #(get % :bounded) selected-vars)]  ; logic values
    (when (and
            (= 4 (count bounded-vars))
            (some true? bounded-vars)) ; if there is one bounded variable (true) among them
      (let [qf (write-indexed f2 0 false rand-nums)
            q (str "A \\(" qf "\\) formulában az indexszel megjelölt változóelőfordulások közül kötött?")
            id (str "FO-" i)
            fr (get (frequencies bounded-vars) true ) ; number of good answers
            a (for [v selected-vars]
                [(str (inc (.indexOf selected-vars v)))
                 (if (get v :bounded) (nth cmn/prize fr) (nth cmn/penalty fr))])]
            [q a id]))))

(defn occur2 [i]
  (let [f (r/random-formula1 7 3)]
      (bounded-occurences i f)))


(comment (free-occurences 4 (r/random-formula1 7 4)))

; vim: fdm=syntax:ts=2:et
