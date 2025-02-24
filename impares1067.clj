(ns projetos-clojure.impares1067)
(def x (read))
(defn pares-entre-1-e-x []
  (doall (map println (range 1 (+ 1 x) 2))))

(pares-entre-1-e-x)
