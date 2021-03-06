(defproject clojure-logic-moodle "0.0.2-SNAPSHOT"
  :description "Generate questions for Moodle"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [hiccup "1.0.5"]]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :plugins [[lein-marginalia "0.9.0"] 
            [lein-exec "0.3.6"]]
  :aot [logic.core]
  :main logic.core)
