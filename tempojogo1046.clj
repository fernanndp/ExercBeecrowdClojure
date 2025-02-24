(ns projetos-clojure.tempojogo1046)

(require '[clojure.string :as str])

(defn calcular-tempo [a b] 
  (cond
    (> a b) (println "O JOGO DUROU" (- (+ b 24) a) "HORA(S)")
    (= a b) (println "O JOGO DUROU 24 HORA(S)")
    (< a b) (println "O JOGO DUROU" (- b a) "HORA(S)")
    )
  )

(let [inputs (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))]
  (apply calcular-tempo inputs))