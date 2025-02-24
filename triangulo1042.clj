(ns projetos-clojure.triangulo1042)

(require '[clojure.string :as str])

(defn eh-triangulo [a b c]
  (cond
    (and (> (+ a b) c) (> (+ a c) b) (> (+ b c) a))
    (println "Perimetro =" (+ a b c))

    :else
    (println (format "Area = %.1f" (* (/ (+ a b) 2) c)))))

(let [inputs (map #(Double/parseDouble %) (str/split (read-line) #"\s+"))]
  (apply eh-triangulo inputs))
