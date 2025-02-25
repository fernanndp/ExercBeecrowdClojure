(def h1 (read))
(def m1 (read))
(def h2 (read))
(def m2 (read))

(if (and (<= h2 h1) (<= m2 m1))
  (do
    (def h2 (+ h2 23))
    (def m2 (+ m2 60)))
  (if (<= m2 m1)
    (do
      (def h2 (- h2 1))
      (def m2 (+ m2 60)))))

(def s1 (+ (* h1 3600) (* m1 60)))
(def s2 (+ (* h2 3600) (* m2 60)))
(def tempo (- s2 s1))
(def hr (quot tempo 3600))
(def mi (quot (- tempo (* hr 3600)) 60))

(println (format "O JOGO DUROU %d HORA(S) E %d MINUTO(S)" hr mi))
