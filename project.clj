(defproject rep "1.0.0"
  :description "Read, Eval, Print."
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]]
  :dev-dependencies [[swank-clojure "1.2.1"]
                     [lein-difftest "1.2.2"]]
  :namespaces [rep.main])
