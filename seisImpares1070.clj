(ns projetos-clojure.seisImpares1070)

(defn impares-seguidos []
  (let [x (Integer/parseInt (read-line))
        inicio (if (odd? x) x (inc x))
        impares (range inicio (+ inicio 12) 2)]
    (doall (map println impares))))

(impares-seguidos)
