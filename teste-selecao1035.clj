(ns projetos-clojure.testeSelecao1035)

(require '[clojure.string :as str])

(defn validar-valores [a b c d]
  (if (and (> b c)
           (> d a)
           (> (+ c d) (+ a b))
           (pos? c)
           (pos? d)
           (even? a))
    (println "Valores aceitos")
    (println "Valores nao aceitos")))

(let [inputs (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))]
  (apply validar-valores inputs))
