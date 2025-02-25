
(ns projetos-clojure.sequenciaLogica1145
   (:require [clojure.string :as str]))
 (def entrada (str/split (read-line) #" "))
 (def x (Integer/parseInt (first entrada)))
 (def y (Integer/parseInt (second entrada)))

 (defn imprimir-sequencia [x y]
   (doall
    (map-indexed
     (fn [idx num]
       (if (= (mod (inc idx) x) 0)  
         (println num) 
         (print (str num " "))))   
     (range 1 (inc y)))))
 

(imprimir-sequencia x y)
