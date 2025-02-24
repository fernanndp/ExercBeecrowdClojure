(ns projetos-clojure.lanche1038)

(require '[clojure.string :as str])

(defn combo [a b]
  (cond
    (= a 1) (println (format "Total: R$ %.2f" (* 4.00 b)))
    (= a 2) (println (format "Total: R$ %.2f" (* 4.50 b)))
    (= a 3) (println (format "Total: R$ %.2f" (* 5.00 b)))
    (= a 4) (println (format "Total: R$ %.2f" (* 2.00 b)))
    (= a 5) (println (format "Total: R$ %.2f" (* 1.50 b)))
  ))

  (let [inputs (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))]
    (apply combo inputs))
