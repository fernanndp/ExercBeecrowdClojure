(ns projetos-clojure.diferenca1007)

(def a (read))
(def b (read))
(def c (read))
(def d (read))
(def prod1 (* a b))
(def prod2 (* c d))
(def dif (- prod1 prod2))

(println "DIFERENCA =" dif )