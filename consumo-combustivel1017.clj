(ns projetos-clojure.consumoCombustivel1017)

(def tempo (read))
(def veloc (read))
(def dist (* tempo veloc))
(def litros (/ dist 12.0))
(println (format "%.3f" litros))
