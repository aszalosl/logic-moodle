(ns logic.congruence
  (:require [logic.write-formula :as w]
            [logic.random-formula :as r]
            [logic.free :as f]
            [logic.common :as cmn]
            [clojure.set :as s])
  (:gen-class))

;; congruent formulae
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
      [q (nth cmn/prize c) (str "A helyettesítés eredménye: \\(" 
                             (w/write-short fxt) "\\)")]
      [q (nth cmn/penalty c) (str "A helyettesítés során a \\(" 
                               (w/write-term (first a))
                               "\\) kötötté válna")])))

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
      (let [q (str "Az alábbiak közül melyik esetben megengedett a "
                   "behelyettesítés, ahol A a következő formula \\(" 
                   (w/write-short f) "\\)?")
            a [(generate-answer f x1 t1 sc) 
               (generate-answer f x2 t2 sc) 
               (generate-answer f x3 t3 sc) 
               (generate-answer f x4 t4 sc)]
            id (str "SUB1-" i)]
        [q a id]))))

(defn subs1 [i] (subs-test i 5 4 4))

;; quantifier clean formula (renaming is unnecessary renaming for prenex form?)

(defn map-join
  "Update with multiplicity"
  [m1 m2]
  (loop [m m1, result m2]
    (if (empty? m)
      result
      (let [k (key (first m))
            v (get (first m) 1)]
        (if (contains? result k)
          (recur (rest m) (update result k + v))
          (recur (rest m) (into result {k v})))))))

(defn bound-var-multi
  "map of bound variables in formula f"
  [f]
  (if (vector? f)
    (let [op (first f)
          f1 (get f 1)
          f2 (get f 2)]
      (cond
        (contains? #{:f :P :g :Q} op) {}
        (= :not op) (bound-var-multi f1)
        (contains? #{:all :ex} op)
        (let [bv (bound-var-multi f2)]
          (if (contains? bv f1)
            (update bv f1 inc)
            (into bv {f1 1})))
        (contains? #{:or :and :imp :equ :eq} op)
        (let [b1 (bound-var-multi f1)
              b2 (bound-var-multi f2)]
          (map-join b1 b2))))
    {}))

(defn clean?
  "the formula f is clean in its variables?"
  [ff]
  (let [free-vars (f/free-var ff)
        bound-multi (bound-var-multi ff)
        bound-vars (set (keys bound-multi))]
    (and
      (= (s/intersection free-vars bound-vars) #{})
      (every? #(= 1 %) (vals bound-multi)))))

(defn clean-problem
  "some hint about problems"
  [ff]
  (let [free-vars (f/free-var ff)
        bound-multi (bound-var-multi ff)
        bound-vars (set (keys bound-multi))
        inter (s/intersection free-vars bound-vars)
        multi (filter #(not= 1 (val %)) bound-multi)]
    (if (not= inter #{})
      (str "a(z) "(w/write-term (first inter)) 
        " változónak vannak mind szabad, mind kötött előfordulásai is")
      (when (not (empty? multi))
        (str "a(z) " (w/write-term (key (first multi))) " változó " 
          (val (first multi)) " kvantornak változója")))))

(defn clean-quiz
  "Generate semi-questions about clean-ness
  Args:
   n - number of formulae
   f1 - random formula parameter
   f2 - random formula parameter"
  [n f1 f2]
  (str " {:question \"Válassza ki az alábbiak közül a változóiban tiszta "
       "formulákat!\"\n  :good [\n"
       (clojure.string/join
         (for [x (range 0 n) 
               :let [ff (r/random-formula1 f1 f2)] 
               :when (clean? ff)]
           (str "         \"\\\\( " (w/write-out ff) " \\\\)\"\n")))
       "  ]\n  :wrong [\n"
       (clojure.string/join  
         (for [y (range 0 n) 
               :let [ff (r/random-formula1 f1 f2)] 
               :when (not (clean? ff))]
           (str "          [\"\\\\( " (w/write-out ff) " \\\\)\" \""
             (clean-problem ff) "\"]\n")))    
        "]}\n"))
        
;; prenex form
(defn calculate-bindings
  "Determine the necessary renamings for a formula based on its free and 
  bounded variables.
  Args:
  free-vars - free variables of the formula
  bound-multi - multiplicities of the bound variables"
  [free-vars bound-multi]
  (loop [bs {}, bounded bound-multi, ax-vars [:u :v :w :t :s]]
    (if (empty? bounded)
      bs
      (let [k (key (first bounded))
            v (val (first bounded))]
        (if (contains? free-vars k)
          (recur 
            (into bs {k (vec (take v ax-vars))}) 
            (rest bounded)
            (vec (drop v ax-vars)))
          (if (> v 1)
            (recur 
              (into bs {k (conj (vec (take (dec v) ax-vars)) k)}) 
              (rest bounded)
              (vec (drop v ax-vars)))
            (recur bs (rest bounded) ax-vars)))))))

(defn quantifier?
  "We have two quantifiers"
  [q]
  (or (= q :all) (= q :ex)))

(defn cleaning
  "Generate a variable-clean format for formula.
  Args:
  frm - formula
  fb - future bindings
  ab - actual bindings"
  [frm fb ab]
  (if (vector? frm)
    (let [op (first frm)
          f1 (get frm 1)
          f2 (get frm 2)]
      (cond
        (contains? #{:f :P :not} op)
        (let [[fc1 b1] (cleaning f1 fb ab)]
          [[op fc1] b1])
          
        (contains? #{:g :Q :eq :or :and :imp :equ} op) 
        (let [[fc1 b1] (cleaning f1 fb ab) 
              [fc2 b2] (cleaning f2 b1 ab)]
          [[op fc1 fc2] b2])
          
        (quantifier? op)
        (if (contains? fb f1)
          (let [x (first (get fb f1))
                xs (vec (rest (get fb f1)))
                fbn (assoc fb f1 xs)
                abn (assoc ab f1 x)
                [fc2 b2] (cleaning f2 fbn abn)]
            [[op x fc2] b2])
          (let [[fc2 b2] (cleaning f2 fb ab)]
            [[op f1 fc2] b2]))))
    (if (contains? ab frm) 
      [(ab frm) fb]
      [frm fb])))

;       
(defn converse
  "The other quantifier"
  [op]
  (case op :all :ex :ex :all))

(defn begins-with-quantifier?
  [frm]
  (if (vector? frm)
     (quantifier? (first frm))
     false))

(defn prenex-form
  "Construct some prenex form of the formula frm"
  [frm]
  (if (vector? frm) 
    (let [op (first frm)
          f1 (get frm 1)
          pf1 (prenex-form f1)
          q1 (begins-with-quantifier? pf1)
          f2 (get frm 2)
          pf2 (prenex-form f2)
          q2 (begins-with-quantifier? pf2)]   
      (cond
        (contains? #{:P :Q :eq :f :g} op) frm
        
        (= op :not) 
        (if q1
          [(converse (first pf1)) (second pf1) (prenex-form [:not (get pf1 2)])]
          [:not pf1])
          
        (contains? #{:and :or} op) 
        (cond 
          (and q1 q2)
            (if (< (rand) 0.5)
               [(first pf1) (second pf1) (prenex-form [op (get pf1 2) pf2])]
               [(first pf2) (second pf2) (prenex-form [op pf1 (get pf2 2)])])
          q1 [(first pf1) (second pf1) (prenex-form [op (get pf1 2) pf2])]
          q2 [(first pf2) (second pf2) (prenex-form [op pf1 (get pf2 2)])]
          :else [op pf1 pf2])
        
        (= op :imp) 
        (cond 
          (and q1 q2)
            (if (< (rand) 0.5)
               [(converse (first pf1)) (second pf1) (prenex-form [op (get pf1 2) pf2])]
               [(first pf2) (second pf2) (prenex-form [op pf1 (get pf2 2)])])
          q1 [(converse (first pf1)) (second pf1) (prenex-form [op (get pf1 2) pf2])]
          q2 [(first pf2) (second pf2) (prenex-form [op pf1 (get pf2 2)])]
          :else [op pf1 pf2])
        
        (contains? #{:all :ex} op) [op f1 pf2]))
      frm))
      
(defn clean
  [frm]
  (let [free-vars (f/free-var frm)
        bound-multi (bound-var-multi frm)
        fb (calculate-bindings free-vars bound-multi)]
    (cleaning frm fb {})))
    
(defn prenex-quiz 
  "generate a semi-question for a quiz about prenex-form"
  [frm]
  (let [[f1 c] (clean frm)]
    (str " {:question \"A felsoroltak közül melyek részformulái a \\\\( "
      (w/write-out frm) 
      " \\\\) formulának?\"\n"
      "  :good [\n"
      (clojure.string/join
        (for [x (range 0 5)]     
         (str "    \"\\\\( " (w/write-out (prenex-form f1)) " \\\\)\"\n")))
       "  ]\n  :wrong []}\n")))

; (defn prenex-quiz1 [] (prenex-quiz (r/random-formula-prenex 7 4)))
