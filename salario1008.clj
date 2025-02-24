(ns projetos-clojure.salario1008)

(def numero (read))
(def horas (read))
(def valor (read))
(def salario(* horas valor))
(println "NUMBER =" numero)
(println (format "SALARY = U$ %.2f" salario))