(ns projetos-clojure.quadradosCubos1143)

(def n (Integer/parseInt (read-line)))

(defn imprimir [n]
  (doall
   (map (fn [x]  
          (println x (* x x) (* x x x)))
        (range 1 (inc n)))))  
(imprimir n)

