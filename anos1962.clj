(ns projetos-clojure.anos1962)

(defn periodo [x]
  (cond (>= x 2015)
        (let [anos (- x 2014)]
          (println anos "A.C.")) 
        :else
          (let [anos (- 2015 x)]
            (println anos "D.C."))))

(defn processar-anos []
  (let [n (Integer/parseInt (read-line))
        numeros (vec (repeatedly n #(Integer/parseInt (read-line))))]
    (doall (map #(periodo %) numeros))))
(processar-anos)