(ns projetos-clojure.quadradoPares1073)

(defn quadrados []
  (let [x (Integer/parseInt (read-line))   
        numeros (range 2 (inc x) 2)]       
    (doall (map #(println (str % "^2 = " (* % %))) numeros))))  

(quadrados)

