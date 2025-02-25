(ns projetos-clojure.parOuImpar1074)

(defn classificar-numero [x]
  (cond
    (= x 0) "NULL"
    (and (even? x) (pos? x)) "EVEN POSITIVE"
    (and (even? x) (neg? x)) "EVEN NEGATIVE"
    (and (odd? x) (pos? x)) "ODD POSITIVE"
    (and (odd? x) (neg? x)) "ODD NEGATIVE"))

(defn processar-numeros []
  (let [n (Integer/parseInt (read-line))  
        numeros (vec (repeatedly n #(Integer/parseInt (read-line))))]
    (doall (map #(println (classificar-numero %)) numeros))))
(processar-numeros)
