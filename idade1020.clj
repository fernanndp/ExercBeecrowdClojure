(ns projetos-clojure.idade1020)
  (let [dias (read)
        anos (int (/ dias 365))
        meses (int (/ (mod dias 365) 30))
        dias-restantes (int (mod (mod dias 365) 30))]
    (println anos "ano(s)")
    (println meses "mes(es)")
    (println dias-restantes "dia(s)"))

 
    
