(ns projetos-clojure.reajuste1048)

(def x (read))

(cond
  (and (>= x 0.0) (<= x 400.00))
  (do
    (println (format "Novo salario: %.2f" (+ (* x 0.15) x)))
    (println (format "Reajuste ganho: %.2f" (* x 0.15)))
    (println "Em percentual: 15 %"))

  (and (>= x 400.01) (<= x 800.00))
  (do
    (println (format "Novo salario: %.2f" (+ (* x 0.12) x)))
    (println (format "Reajuste ganho: %.2f" (* x 0.12)))
    (println "Em percentual: 12 %"))

  (and (>=  x 800.01) (<= x 1200.00))
  (do
    (println (format "Novo salario: %.2f" (+ (* x 0.10) x)))
    (println (format "Reajuste ganho: %.2f" (* x 0.10)))
    (println "Em percentual: 10 %"))

  (and (>= x 1200.01) (<= x 2000.00))
  (do
    (println (format "Novo salario: %.2f" (+ (* x 0.07) x)))
    (println (format "Reajuste ganho: %.2f" (* x 0.07)))
    (println "Em percentual: 7 %"))

  (> x 2000.0)
  (do
    (println (format "Novo salario: %.2f" (+ (* x 0.04) x)))
    (println (format "Reajuste ganho: %.2f" (* x 0.04)))
    (println "Em percentual: 4 %")))
