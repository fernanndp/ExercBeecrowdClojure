
  (let [segundos (read)
        horas (int (/ segundos 3600))
        minutos (int (/ (mod segundos 3600) 60))
        segundos-restantes (int (mod segundos 60))]
    (println (format "%d:%d:%d" horas minutos segundos-restantes)))
