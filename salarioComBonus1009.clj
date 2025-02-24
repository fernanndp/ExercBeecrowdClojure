(ns projetos-clojure.salarioComBonus1009)

(def nome (read))
(def salario (read))
(def vendas (read))
(def comissao (* 0.15 vendas))
(println (format "TOTAL = R$ %.2f" (+ salario comissao)))