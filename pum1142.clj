(defn imprimir-padrao [n]
  (doall
   (map (fn [i]
          (let [x (* i 4)]
            (println (str (+ x 1) " " (+ x 2) " " (+ x 3) " PUM"))))
        (range n))))
(def n (Integer/parseInt (read-line)))
(imprimir-padrao n)
