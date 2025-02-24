(ns projetos-clojure.multiplos1044)

(require '[clojure.string :as str])

(defn eh-multiplo [a b]
  (if (or (= (mod a b) 0) (= (mod b a) 0))
    (println "Sao Multiplos")
    (println "Nao sao Multiplos")))

(let [inputs (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))]
  (apply eh-multiplo inputs))

