(ns logic.exam
  (:require [logic.set :as sets]
            [logic.relation :as rels]
            [logic.outer :as out]
            [logic.xml :as xml]
            [logic.quine-table :as qt]
            [logic.subformula :as sf]
            [logic.random-formula :as rf]
            [logic.model-quiz :as mq]
            [logic.consequence :as lc]
            [logic.map :as lm]
            [logic.formula :as form]
            [logic.free :as fr]
            [logic.congruence :as cng])
  (:gen-class))
(do
  (out/mcq-xml-res 5 "inductive.clj" "P01.xml" "p01")
  (out/mcq-xml-res 30 "wff.clj" "P02.xml" "p02")
  (out/mcq-xml-res 7 "model4m.clj" "P03.xml" "p03")
  (out/mcq-xml-res 100 "satG22m.clj" "P04.xml" "p04")
  (out/mcq-xml-res 100 "contG22m.clj" "P05.xml" "p05")
  (out/mcq-xml-res 1 "lc2m.clj" "P06.xml" "p06")
  (out/mcq-xml-res 100 "valid2m.clj" "P07.xml" "p07")
  (xml/short-xml 50 "P08.xml" "p08" qt/quine-test3b)
  (xml/mcq-xml 50 "P09.xml" "p09" lm/dnf3)
  (xml/mcq-xml 50 "P10.xml" "p10" lm/cnf3)
  (xml/mcq-xml 50 "P11.xml" "p11" lm/km3-dnf)
  (xml/mcq-xml 50 "P12.xml" "p12" lm/km3-cnf)

  (out/mcq-xml-res 50 "terms.clj" "P14.xml" "p14")
  (xml/mcq-xml 50 "P15.xml" "p15" fr/free1)
  (xml/mcq-xml 50 "P16.xml" "p16" fr/bound1)
  (xml/mcq-xml 50 "P17.xml" "p17" fr/occur1)
  (xml/mcq-xml 50 "P18.xml" "p18" fr/occur2)
  (out/mcq-xml-res 50 "clean.clj" "P19.xml" "p19")
  (out/mcq-xml-res 50 "prenex.clj" "P20.xml" "p20")
  (xml/mcq-xml 50 "P21.xml" "p21" cng/subs1)

  (out/mcq-xml-res 50 "th01.clj" "T01.xml" "t01")
  (out/mcq-xml-res 50 "th02.clj" "T02.xml" "t02")
  (out/mcq-xml-res 50 "th03.clj" "T03.xml" "t03")
  (out/mcq-xml-res 50 "th04.clj" "T04.xml" "t04")
  (out/mcq-xml-res 50 "th05.clj" "T05.xml" "t05")
  (out/mcq-xml-res 50 "th06.clj" "T06.xml" "t06")
  (out/mcq-xml-res 50 "th07.clj" "T07.xml" "t07")
  (out/mcq-xml-res 50 "th08.clj" "T08.xml" "t08")
  (out/mcq-xml-res 50 "th09.clj" "T09.xml" "t09")
  (out/mcq-xml-res 50 "th10.clj" "T10.xml" "t10")
  (out/mcq-xml-res 50 "th11.clj" "T11.xml" "t11")
  (out/mcq-xml-res 50 "th12.clj" "T12.xml" "t12")
  (out/mcq-xml-res 50 "th13.clj" "T13.xml" "t13")
  (out/mcq-xml-res 50 "th14.clj" "T14.xml" "t14")
  (out/mcq-xml-res 50 "th15.clj" "T15.xml" "t15")
  (out/mcq-xml-res 50 "th16.clj" "T16.xml" "t16"))
