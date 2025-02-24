(ns projetos-clojure.sequenciaLogica1144)

(def n (Integer/parseInt (read-line)))

(defn imprimir [n]
  (doall
   (map (fn [x]
          (println x (* x x) (* x x x))
          (println x (+ 1 (* x x) ) (+ 1 (* x x x))))
        (range 1 (inc n)))))
(imprimir n)
