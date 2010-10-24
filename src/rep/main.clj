(ns rep.main
  (:gen-class))

(defn rep []
  (try
    (flush)
    (print (eval `(binding [*ns* *ns*]
                    (in-ns '~'user)
                    ~(read))))
    (catch clojure.lang.LispReader$ReaderException _)))

(defn -main []
  (print "user=> ")
  (rep)
  (println)
  (flush))
