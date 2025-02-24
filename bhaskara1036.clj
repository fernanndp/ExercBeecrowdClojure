(ns projetos-clojure.bhaskara1036)

(require '[clojure.string :as str])

(defn formula [a b c]
  (let [delta (- (* b b) (* 4 a c))]
    (if (or (zero? a) (neg? delta))
      (println "Impossivel calcular")
      (let [r1 (/ (+ (- b) (Math/sqrt delta)) (* 2 a))
            r2 (/ (- (- b) (Math/sqrt delta)) (* 2 a))]
        (printf "R1 = %.5f\n" r1)
        (printf "R2 = %.5f\n" r2)))))

(let [inputs (map #(Double/parseDouble %) (str/split (read-line) #"\s+"))]
  (apply formula inputs))
