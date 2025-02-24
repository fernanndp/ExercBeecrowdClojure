(defn calcular-media [n1 n2 n3 n4]
  (/ (+ (* n1 2) (* n2 3) (* n3 4) (* n4 1)) 10))

(defn avaliar-aluno [media]
  (cond
    (>= media 7.0) "Aluno aprovado."
    (< media 5.0) "Aluno reprovado."
    :else "Aluno em exame."))

(defn calcular-media-final [media exame]
  (/ (+ media exame) 2))

(defn formatar-numero [numero]
  (format "%.1f" numero))

(let [n1 (read)
      n2 (read)
      n3 (read)
      n4 (read)]
  (let [media (calcular-media n1 n2 n3 n4)]
    (println (str "Media: " (formatar-numero media)))
    (let [situacao (avaliar-aluno media)]
      (println situacao)
      (if (= situacao "Aluno em exame.")
        (let [exame (read)]
          (println (str "Nota do exame: " (formatar-numero exame)))
          (let [media-final (calcular-media-final media exame)]
            (if (>= media-final 5.0)
              (do
                (println "Aluno aprovado.")
                (println (str "Media final: " (formatar-numero media-final))))
              (do
                (println "Aluno reprovado.")
                (println (str "Media final: " (formatar-numero media-final)))))))))))