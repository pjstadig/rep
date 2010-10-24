(ns rep.test.main
  (:use [rep.main] :reload)
  (:use [clojure.test]))

(defn rep-it [s]
  (with-in-str s
    (with-out-str
      (rep))))

(deftest test-rep
  (is (= "user" (rep-it "(str *ns*)")))
  (is (= "3" (rep-it "(+ 1 2)"))))
