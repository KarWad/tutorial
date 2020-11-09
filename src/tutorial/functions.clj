(ns tutorial.functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My name is Karolina")
  (println "loving Clojure so far")
  (+ 2 5))

#(println "Hello" %)

(def increment (fn [x] (+ x 1)))
(defn increment_set
  [x]
  (map increment x))

(defn DataTypes []
  (def a 1)
  (def b 1.25)

  (println a)
  (println b)
  )
(DataTypes)

