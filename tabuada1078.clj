(ns projetos-clojure.tabuada1078)

(defn tabuada []
  (let [x (Integer/parseInt (read-line))
        numeros (range 1 11)] 
    (doall (map #(println (str % " x " x " = " (* % x))) numeros)))) 
(tabuada)

