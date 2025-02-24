(ns projetos-clojure.consumo1014)

(def dist (read))
(def litros (read))
(def consumo (/ dist litros))
(println (format "%.3f" consumo) "km/l")