(ns projetos-clojure.tipotriangulo1045
  (:require
   [clojure.string :as str]))

(defn ordenar [a b c]
  (reverse (sort [a b c]))) 

(let [inputs (map #(Double/parseDouble %) (str/split (read-line) #"\s+"))
      [a b c] (apply ordenar inputs)] 
  (cond
    (>= a (+ b c)) (println "NAO FORMA TRIANGULO") 
    (= (* a a) (+ (* b b) (* c c))) (println "TRIANGULO RETANGULO")
    (> (* a a) (+ (* b b) (* c c))) (println "TRIANGULO OBTUSANGULO")
    (< (* a a) (+ (* b b) (* c c))) (println "TRIANGULO ACUTANGULO"))

  (cond
    (= a b c) (println "TRIANGULO EQUILATERO")
    (or (= a b) (= a c) (= b c)) (println "TRIANGULO ISOSCELES")))
