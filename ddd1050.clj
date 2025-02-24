(ns projetos-clojure.ddd1050)
(def x (read))
(cond
  (= x 61) (println "Brasilia")
  (= x 71) (println "Salvador")
  (= x 11) (println "Sao Paulo")
  (= x 21) (println "Rio de Janeiro")
  (= x 32) (println "Juiz de Fora")
  (= x 19) (println "Campinas")
  (= x 27) (println "Vitoria")
  (= x 31) (println "Belo Horizonte")
  :else 
  (println "DDD nao cadastrado")
  )