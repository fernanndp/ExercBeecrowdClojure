(def tipo (str (read)))

(println (cond (= tipo "vertebrado") 
               (do (def tipo2 (str (read))) 
                   (cond 
                     (= tipo2 "ave") 
                     (do (def tipo3 (str (read))) 
                         (cond 
                           (= tipo3 "carnivoro") "aguia" 
                           (= tipo3 "onivoro") "pomba")) 
                     (= tipo2 "mamifero") 
                     (do (def tipo3 (str (read))) 
                         (cond 
                           (= tipo3 "herbivoro") "vaca" 
                           (= tipo3 "onivoro") "homem"))))

               (= tipo "invertebrado") 
               (do (def tipo2 (str (read))) 
                   (cond 
                     (= tipo2 "inseto")
                     (do (def tipo3 (str (read))) 
                         (cond 
                           (= tipo3 "hematofago") "pulga" 
                           (= tipo3 "herbivoro") "lagarta")) 
                     (= tipo2 "anelideo") 
                     (do (def tipo3 (str (read))) 
                         (cond 
                           (= tipo3 "hematofago") "sanguessuga" 
                           (= tipo3 "onivoro") "minhoca"))))))
                                                   
