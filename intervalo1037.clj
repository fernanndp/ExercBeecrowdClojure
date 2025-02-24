(ns projetos-clojure.intervalo1037)

(def x (read))

(cond
  (and (> x 0) (<= x 25))  (println "Intervalo (0, 25]")
  (and (> x 25) (<= x 50)) (println "Intervalo (25, 50]")
  (and (> x 50) (<= x 75)) (println "Intervalo (50, 75]")
  (and (> x 75) (<= x 100)) (println "Intervalo (75, 100]")
  :else (println "Fora de intervalo"))
