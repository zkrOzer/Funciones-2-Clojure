(ns plf03.core)

(defn función-comp-1
  []
  (let [f (fn [x] (inc x))
        g (fn [f] (+ f 3))

        z (comp f g)]
    (z 5)))

(defn función-comp-2
  []
  (let [f (fn [x] (inc x))
        g (fn [x] (* 3 x))
        z (comp f g)]
    (z 50)))

(defn función-comp-3
  []
  (let [f (fn [x] (str x))
        g (fn [x] (+ 2 x))
        z (comp f g)]
    (z 21)))

(defn función-comp-4
  []
  (let [f (fn [x] (true? x))
        z (comp f)]
    (z 65)))

(defn función-comp-5
  []
  (let [f (fn [x] (char? x))
        g (fn [x] (inc x))
        z (comp f g)]
    (z 100)))

(defn función-comp-6
  []
  (let [f (fn [x] (inc x))
        g (fn [x] (+ 3 x))
        z (comp f g)]
    (z 91)))

(defn función-comp-7
  []
  (let [f (fn [x] (char? x))
        g (fn [x] (str x))
        z (comp f g)]
    (z 32)))

(defn función-comp-8
  []
  (let [f (fn [x] (dec x))
        g (fn [x] (- 3 x))
        z (comp f g)]
    (z 55)))

(defn función-comp-9
  []
  (let [f (fn [x] (rational? x))
        g (fn [x] (/ x 3))
        z (comp f g)]
    (z 2)))

(defn función-comp-10
  []
  (let [f (fn [x] (take 8 x))
        g (fn [x] (str x))
        z (comp f g)]
    (z 51577848754)))

(defn función-comp-11
  []
  (let [f (fn [x] (seqable? x))
        g (fn [x] (+ 5 x))
        z (comp f g)]
    (z 50)))

(defn función-comp-12
  []
  (let [f (fn [x] (reverse x))
        z (comp f)]
    (z "practicas")))

(defn función-comp-13
  []
  (let [f (fn [x] (sequential? x))
        g (fn [x] (list x))
        z (comp f g)]
    (z 164)))

(defn función-comp-14
  []
  (let [f (fn [x] (float? x))
        g (fn [x] (+ 5 x))
        z (comp f g)]
    (z 81.0)))

(defn función-comp-15
  []
  (let [f (fn [x] (sequential? x))
        g (fn [x] (str x))
        z (comp f g)]
    (z 194)))

(defn función-comp-16
  []
  (let [f (fn [x] (integer? x))
        g (fn [x] (* 2 x))
        z (comp f g)]
    (z 12)))

(defn función-comp-17
  []
  (let [f (fn [x] (even? x))
        g (fn [x] (+ 1 x))
        z (comp f g)]
    (z 174)))

(defn función-comp-18
  []
  (let [f (fn [x] (concat x "tardesssssssssssss"))
        z (comp f)]
    (z "buenassss")))

(defn función-comp-19
  []
  (let [f (fn [x] (repeat 2 x))
        z (comp f)]
    (z 23)))

(defn función-comp-20
  []
  (let [f (fn [x] (int? x))
        z (comp f)]
    (z 18)))

(función-comp-1)
(función-comp-2)
(función-comp-3)
(función-comp-4)
(función-comp-5)
(función-comp-6)
(función-comp-7)
(función-comp-8)
(función-comp-9)
(función-comp-10)
(función-comp-11)
(función-comp-12)
(función-comp-13)
(función-comp-14)
(función-comp-15)
(función-comp-16)
(función-comp-17)
(función-comp-18)
(función-comp-19)
(función-comp-20)

(defn función-complement-1
  []
  (let [f (fn [x] (string? x))
        z (complement f)]
    (z "JOSUE YSAI MARTINEZ MORALES")))

(defn función-complement-2
  []
  (let [f (fn [x] (true? x))
        z (complement f)]
    (z false)))

(defn función-complement-3
  []
  (let [f (fn [x] (empty? x))
        z (complement f)]
    (z {})))

(defn función-complement-4
  []
  (let [f (fn [x] (string? x))
        z (complement f)]
    (z 789)))

(defn función-complement-5
  []
  (let [f (fn [x] (char? x))
        z (complement f)]
    (z "hola")))

(defn función-complement-6
  []
  (let [f (fn [x] (char? x))
        z (complement f)]
    (z {:edad 23})))

(defn función-complement-7
  []
  (let [f (fn [x] (false? x))
        z (complement f)]
    (z false)))

(defn función-complement-8
  []
  (let [f (fn [x] (true? x))
        z (complement f)]
    (z true)))

(defn función-complement-9
  []
  (let [f (fn [x] (map? x))
        z (complement f)]
    (z {:nombre "Josue"})))

(defn función-complement-10
  []
  (let [f (fn [x] (map? x))
        z (complement f)]
    (z "jeje")))

(defn función-complement-11
  []
  (let [f (fn [x] (empty? x))
        z (complement f)]
    (z [165 26 98])))

(defn función-complement-12
  []
  (let [f (fn [x] (seqable? x))
        z (complement f)]
    (z 5)))

(defn función-complement-13
  []
  (let [f (fn [x] (sequential? x))
        z (complement f)]
    (z [1 2 3 4])))

(defn función-complement-14
  []
  (let [f (fn [x] (sequential? x))
        z (complement f)]
    (z 1)))

(defn función-complement-15
  []
  (let [f (fn [x] (int? x))
        z (complement f)]
    (z 1.0)))

(defn función-complement-16
  []
  (let [f (fn [x] (even? x))
        z (complement f)]
    (z 2)))

(defn función-complement-17
  []
  (let [f (fn [x] (float? x))
        z (complement f)]
    (z 1.0)))

(defn función-complement-18
  []
  (let [f (fn [x] (even? x))
        z (complement f)]
    (z 1)))

(defn función-complement-19
  []
  (let [f (fn [x] (int? x))
        z (complement f)]
    (z 1)))

(defn función-complement-20
  []
  (let [f (fn [x] (false? x))
        z (complement f)]
    (z true)))

(función-complement-1)
(función-complement-2)
(función-complement-3)
(función-complement-4)
(función-complement-5)
(función-complement-6)
(función-complement-7)
(función-complement-8)
(función-complement-9)
(función-complement-10)
(función-complement-11)
(función-complement-12)
(función-complement-13)
(función-complement-14)
(función-complement-15)
(función-complement-16)
(función-complement-17)
(función-complement-18)
(función-complement-19)
(función-complement-20)

(defn función-constantly-1
  []
  (let [f (fn [x] (/ 2 x))
        z (constantly f)]
    ((z) 74)))

(defn función-constantly-2
  []
  (let [f (fn [x] (empty? x))
        z (constantly f)]
    ((z) nil)))

(defn función-constantly-3
  []
  (let [f (fn [x] (* 2 x))
        z (constantly f)]
    ((z) 156)))

(defn función-constantly-4
  []
  (let [f (fn [x] (int? x))
        z (constantly f)]
    ((z) 54.0)))

(defn función-constantly-5
  []
  (let [f (fn [x] (map? x))
        z (constantly f)]
    ((z) {:nombre "Josue" :edad 23 :ciudad "Oaxaca"})))

(defn función-constantly-6
  []
  (let [f (fn [x] (+ 2 x))
        z (constantly f)]
    ((z) 154)))

(defn función-constantly-7
  []
  (let [f (fn [x] (map? x))
        z (constantly f)]
    ((z) 852)))

(defn función-constantly-8
  []
  (let [f (fn [x] (true? x))
        z (constantly f)]
    ((z) true)))

(defn función-constantly-9
  []
  (let [f (fn [x] (- 2 x))
        z (constantly f)]
    ((z) 154)))

(defn función-constantly-10
  []
  (let [f (fn [x] (true? x))
        z (constantly f)]
    ((z) false)))

(defn función-constantly-11
  []
  (let [f (fn [x] (empty? x))
        z (constantly f)]
    ((z) [5 65 981 15])))

(defn función-constantly-12
  []
  (let [f (fn [x] (false? x))
        z (constantly f)]
    ((z) true)))

(defn función-constantly-13
  []
  (let [f (fn [x] (false? x))
        z (constantly f)]
    ((z) false)))

(defn función-constantly-14
  []
  (let [f (fn [x] (+ 3 x))
        z (constantly f)]
    ((z) 3871)))

(defn función-constantly-15
  []
  (let [f (fn [x] (sequential? x))
        z (constantly f)]
    ((z) [9 8 7 6 5 4])))

(defn función-constantly-16
  []
  (let [f (fn [x] (sequential? x))
        z (constantly f)]
    ((z) [4 5 6 7 8 9])))

(defn función-constantly-17
  []
  (let [f (fn [x] (even? x))
        z (constantly f)]
    ((z) 98)))

(defn función-constantly-18
  []
  (let [f (fn [x] (seqable? x))
        z (constantly f)]
    ((z) 48)))

(defn función-constantly-19
  []
  (let [f (fn [x] (even? x))
        z (constantly f)]
    ((z) 92)))

(defn función-constantly-20
  []
  (let [f (fn [x] (int? x))
        z (constantly f)]
    ((z) 15)))

(función-constantly-1)
(función-constantly-2)
(función-constantly-3)
(función-constantly-4)
(función-constantly-6)
(función-constantly-5)
(función-constantly-7)
(función-constantly-8)
(función-constantly-9)
(función-constantly-10)
(función-constantly-11)
(función-constantly-12)
(función-constantly-13)
(función-constantly-14)
(función-constantly-15)
(función-constantly-16)
(función-constantly-17)
(función-constantly-18)
(función-constantly-19)
(función-constantly-20)

(defn función-every-pred-1
  []
  (let [f (fn [x] (empty? x))
        g (fn [x] (vector? x))
        z (every-pred f g)]
    (z [])))

(defn función-every-pred-2
  []
  (let [f (fn [x] (empty? x))
        g (fn [x] (nil? x))
        z (every-pred f g)]
    (z nil)))

(defn función-every-pred-3
  []
  (let [f (fn [x] (string? x))
        g (fn [x] (char? x))
        z (every-pred f g)]
    (z \a)))

(defn función-every-pred-4
  []
  (let [f (fn [x] (int? x))
        g (fn [x] (odd? x))
        z (every-pred f g)]
    (z 54)))

(defn función-every-pred-5
  []
  (let [f (fn [x] (map? x))
        g (fn [x] (empty? x))
        z (every-pred f g)]
    (z {:nombre "Josue" :edad 23 :ciudad "Oaxaca"})))

(defn función-every-pred-6
  []
  (let [f (fn [x] (char? x))
        g (fn [x] (keyword? x))
        z (every-pred f g)]
    (z :a)))

(defn función-every-pred-7
  []
  (let [f (fn [x] (map? x))
        g (fn [x] (list x))
        z (every-pred f g)]
    (z #{5 98 2 4})))

(defn función-every-pred-8
  []
  (let [f (fn [x] (true? x))
        g (fn [x] (false? x))
        z (every-pred f g)]
    (z true)))

(defn función-every-pred-9
  []
  (let [f (fn [x] (map-entry? x))
        g (fn [x] (vector? x))
        z (every-pred f g)]
    (z [65 89 15 32])))

(defn función-every-pred-10
  []
  (let [f (fn [x] (true? x))
        g (fn [x] (nil? x))
        z (every-pred f g)]
    (z false)))

(defn función-every-pred-11
  []
  (let [f (fn [x] (empty? x))
        g (fn [x] (keys x))
        z (every-pred f g)]
    (z [5 65 981 15])))

(defn función-every-pred-12
  []
  (let [f (fn [x] (false? x))
        g (fn [x] (string? x))
        z (every-pred f g)]
    (z true)))

(defn función-every-pred-13
  []
  (let [f (fn [x] (false? x))
        g (fn [x] (odd? x))
        z (every-pred f g)]
    (z 2)))

(defn función-every-pred-14
  []
  (let [f (fn [x] (keyword? x))
        g (fn [x] (set? x))
        z (every-pred f g)]
    (z :a)))

(defn función-every-pred-15
  []
  (let [f (fn [x] (sequential? x))
        g (fn [x] (some? x))
        z (every-pred f g)]
    (z [9 8 7 6 5 4])))

(defn función-every-pred-16
  []
  (let [f (fn [x] (sequential? x))
        g (fn [x] (pos-int? x))
        z (every-pred f g)]
    (z [4 5 6 7 8 9])))

(defn función-every-pred-17
  []
  (let [f (fn [x] (even? x))
        g (fn [x] (symbol? x))
        z (every-pred f g)]
    (z 98)))

(defn función-every-pred-18
  []
  (let [f (fn [x] (seqable? x))
        g (fn [x] (char? x))
        z (every-pred f g)]
    (z \a)))

(defn función-every-pred-19
  []
  (let [f (fn [x] (even? x))
        g (fn [x] (integer? x))
        z (every-pred f g)]
    (z 92)))

(defn función-every-pred-20
  []
  (let [f (fn [x] (int? x))
        g (fn [x] (even? x))
        z (every-pred f g)]
    (z 54)))

(función-every-pred-1)
(función-every-pred-2)
(función-every-pred-3)
(función-every-pred-4)
(función-every-pred-6)
(función-every-pred-5)
(función-every-pred-7)
(función-every-pred-8)
(función-every-pred-9)
(función-every-pred-10)
(función-every-pred-11)
(función-every-pred-12)
(función-every-pred-13)
(función-every-pred-14)
(función-every-pred-15)
(función-every-pred-16)
(función-every-pred-17)
(función-every-pred-18)
(función-every-pred-19)
(función-every-pred-20)

(defn función-fnil-1
  []
  (let [f (fn [a b c] (str "Nombre completo: " a " " b " " c))
        z (fnil f "Josue" "Martinez" "Morales")]
    (z nil "Ysai" nil)))

(defn función-fnil-2
  []
  (let [f (fn [x] (str "Hola " x))
        g (fnil f "Buenas Tardes")
        h (fnil f "Buenas Noches")]
    [(g "Josue") (h "Ysai")]))

(defn función-fnil-3
  []
  (let [f (fn [x y] (+ x y))
        z (fnil f nil nil)]
    (z 18 87)))

(defn función-fnil-4
  []
  (let [f (fn [x] (str "Hello " x))
        z (fnil f "A todos")]
    (z nil)))

(defn función-fnil-5
  []
  (let [f (fn [x] (map true? x))
        z (fnil f (map true? [true false true false]))]
    (z ["true" true true nil])))

(defn función-fnil-6
  []
  (let [f (fn [x y] (str "Dos nombres: " x " y " y))
        z (fnil f "Josue" "Ysai")]
    (z "Olaf" "Eli")))

(defn función-fnil-7
  []
  (let [f (fn [x] (take 5 x))
        z (fnil f (take 5 (range 10 20)))]
    (z nil)))

(defn función-fnil-8
  []
  (let [f (fn [x] (take-last 3 x))
        z (fnil f (take 2 (range 10)))]
    (z [\h \o \l \a \p \r \o \f \e])))

(defn función-fnil-9
  []
  (let [f (fn [x] (nil? x))
        z (fnil f (nil? nil))]
    (z nil)))

(defn función-fnil-10
  []
  (let [f (fn [w x y] (replace [\a \b \c \d \e \f \g \h \i \j \k \l \m \n \ñ] [w x y]))
        z (fnil f 3 7 11)]
    (z nil 14 nil)))

(defn función-fnil-11
  []
  (let [f (fn [x] (take-last 10 x))
        z (fnil f (take-last 10 (range 50 100)))]
    (z '(54 4878 15 6 89 5 1 3 9 12 98 123 98 15 89))))

(defn función-fnil-12
  []
  (let [f (fn [x] (take-last 10 x))
        y (fnil f (take-nth 100 (range 100 500)))
        z (fnil f (take-last 10 (range 50 100)))]
    [(y nil) (z nil)]))

(defn función-fnil-13
  []
  (let [f (fn [x] (map boolean? x))
        z (fnil f "vacio")]
    (z #{true false})))

(defn función-fnil-14
  []
  (let [f (fn [x] (str "Mi perro se llama: " x))
        z (fnil f "Syndra")]
    (z "Evelin")))

(defn función-fnil-15
  []
  (let [f (fn [x] (boolean? x))
        z (fnil f "vacio")]
    (z nil)))

(defn función-fnil-16
  []
  (let [f (fn [x] (inc x))
        g (fn [x y] (* x y))
        h (fn [x y z] (+ x y z))
        a (fnil f 110)
        b (fnil g 1/2 1/8)
        c (fnil h 98 12 897)]
    [(a nil) (b 6 nil) (c 8/5 nil 3/4)]))

(defn función-fnil-17
  []
  (let [f (fn [x] (empty? x))
        g (fn [x] (first x))
        y (fnil f nil)
        z (fnil g nil)]
    [(y [4 5 6 7 8 9]) (z [9 8 7 6 5 4])]))

(defn función-fnil-18
  []
  (let [f (fn [x] (str "Mi perro se llama " x))
        z (fnil f "Syndra :)")]
    (z nil)))

(defn función-fnil-19
  []
  (let [f (fn [x] (reverse x))
        z (fnil f (+ 2 3))]
    (z "murcielago")))

(defn función-fnil-20
  []
  (let [f (fn [w x y] (replace [:hola :buenas :noches :profe :como :esta] [w x y]))
        z (fnil f 1 1 1)]
    (z nil nil nil)))

(función-fnil-1)
(función-fnil-2)
(función-fnil-3)
(función-fnil-4)
(función-fnil-5)
(función-fnil-6)
(función-fnil-7)
(función-fnil-8)
(función-fnil-9)
(función-fnil-10)
(función-fnil-11)
(función-fnil-12)
(función-fnil-13)
(función-fnil-14)
(función-fnil-15)
(función-fnil-16)
(función-fnil-17)
(función-fnil-18)
(función-fnil-19)
(función-fnil-20)

(defn función-juxt-1
  []
  (let [f (fn [x] (inc x))
        g (fn [g] (dec g))
        z (juxt f g)]
    (z 5)))

(defn función-juxt-2
  []
  (let [f (fn [x] (string? x))
        g (fn [x] (last x))
        z (juxt f g)]
    (z "HOLA")))

(defn función-juxt-3
  []
  (let [f (fn [x] (keys x))
        z (juxt :name f)]
    (z {:name "Josue" :edad 23})))

(defn función-juxt-4
  []
  (let [f (fn [x] (string? x))
        g (fn [x] (count x))
        z (juxt f g)]
    (z "PROGRAMACION LOGICA Y FUNCIONAL")))

(defn función-juxt-5
  []
  (let [f (fn [x y] (split-at x y))
        z (juxt f)]
    (z 1 [54 98 12 897 123 9 65 98 12 78])))

(defn función-juxt-6
  []
  (let [f (fn [x] (map? x))
        z (juxt :b f)]
    (z {:a 54 :b 65 :c 45 :d 98 :e 21 :f 12 :g 35})))

(defn función-juxt-7
  []
  (let [f (fn [x] (vector x))
        g (fn [x] (seq? x))
        z (juxt f g)]
    (z "PRUEBAS")))

(defn función-juxt-8
  []
  (let [f (fn [x y] (every? x y))
        g (fn [x y] (conj x y))
        z (juxt f g)]
    (z #{1 87} [:a :b :c :d])))

(defn función-juxt-9
  []
  (let [f (fn [x] (reverse x))
        z (juxt :a :b f)]
    (z {:a "aa" :b "asd" :c "asdf" :d "qwerwtry" :e "Hola Mundo" :f "Buenas"})))

(defn función-juxt-10
  []
  (let [f (fn [x] (str x))
        g (fn [x] (count x))
        z (juxt f g)]
    (z [[:a "asd"] [:b "hola"] [:c "buenass"]])))

(defn función-juxt-11
  []
  (let [f (fn [x] (reverse x))
        g (fn [x] (nil? x))
        z (juxt f g)]
    (z "PRUEBAS")))

(defn función-juxt-12
  []
  (let [f (fn [x y] (mapv + x y))
        z (juxt f)]
    (z [1 2 3 4 5] [6 7 8 9 10])))

(defn función-juxt-13
  []
  (let [f (fn [x y] (find x y))
        z (juxt :c :d f)]
    (z  {:a 8 :b 6 :c 65 :d 98} :c)))

(defn función-juxt-14
  []
  (let [f (fn [x] (vector x))
        g (fn [x] (first x))
        z (juxt f g)]
    (z {21 98 6 5})))

(defn función-juxt-15
  []
  (let [f (fn [x] (into [] x))
        z (juxt :a :c f)]
    (z {:a 12 :b 98 :c 15 :d 21})))

(defn función-juxt-16
  []
  (let [f (fn [x] (indexed? x))
        z (juxt f)]
    (z "PRUEBAS")))

(defn función-juxt-17
  []
  (let [f (fn [x] (shuffle x))
        z (juxt f)]
    (z '(-55 6 9 21 89))))

(defn función-juxt-18
  []
  (let [f (fn [x] (take-last 3 x))
        z (juxt :c f)]
    (z {:a 12 :b 87 :c 15 :d 32})))

(defn función-juxt-19
  []
  (let [f (fn [x] (vector x))
        z (juxt :a :b f)]
    (z {:a 1 :b 2 :c 3})))

(defn función-juxt-20
  []
  (let [f (fn [x] (take 3 x))
        g (fn [x] (drop 3 x))
        z (juxt :a f g)]
    (z {:a 1 :b 2 :c 3 :d 4 :e 5 :f 6})))

(función-juxt-1)
(función-juxt-2)
(función-juxt-3)
(función-juxt-4)
(función-juxt-5)
(función-juxt-6)
(función-juxt-7)
(función-juxt-8)
(función-juxt-9)
(función-juxt-11)
(función-juxt-10)
(función-juxt-12)
(función-juxt-13)
(función-juxt-14)
(función-juxt-15)
(función-juxt-16)
(función-juxt-17)
(función-juxt-18)
(función-juxt-19)
(función-juxt-20)

(defn función-partial-1
  []
  (let [f (fn [u v w x y] (u v w x y))
        z (partial f +)]
    (z 54 12 98 123)))

(defn función-partial-2
  []
  (let [f (fn [w x y] (w x y))
        z (partial f -)]
    (z 15 65)))

(defn función-partial-3
  []
  (let [f (fn [u v w x y] (vector u v w x y))
        z (partial f 100)]
    (z 10 20 30 40)))

(defn función-partial-4
  []
  (let [f (fn [v w x y] (v w x y))
        z (partial f *)]
    (z 50 98 98)))

(defn función-partial-5
  []
  (let [f (fn [u v w x y] (hash-map :a u :b v :c w :d x :e y))
        z (partial f "hola")]
    (z "auto" "comprar" "doler" "esquina")))

(defn función-partial-6
  []
  (let [f (fn [x y] (range x y))
        z (partial f 100)]
    (z 84)))

(defn función-partial-7
  []
  (let [f (fn [x y] (drop-while x y))
        z (partial f neg?)]
    (z [54 87 -64 -1 6 -12 5 12 8 26])))

(defn función-partial-8
  []
  (let [f (fn [x y] (every? x y))
        z (partial f string?)]
    (z #{"brincar" "saltar" "perro" "syndra" "josue" "sueño"})))

(defn función-partial-9
  []
  (let [f (fn [w x y] (w x y))
        z (partial f /)]
    (z 51 12)))

(defn función-partial-10
  []
  (let [f (fn [x y] (take-nth x y))
        z (partial f 5)]
    (z (range 20))))

(defn función-partial-11
  []
  (let [f (fn [x y] (not-any? x y))
        z (partial f odd?)]
    (z '(2 4 6 8 10 12 14 16 18 20))))

(defn función-partial-12
  []
  (let [f (fn [x y] (group-by x y))
        z (partial f count)]
    (z ["sueño" "mimir" "comer" "levantarse" "no" "soñar" "aburrido"])))

(defn función-partial-13
  []
  (let [f (fn [x y] (merge x y))
        z (partial f {:b 9 :d 4})]
    (z {:a 123 :b 356 :c 976})))

(defn función-partial-14
  []
  (let [f (fn [x y] (partition-by x y))
        z (partial f even?)]
    (z [1 1 7 2 4])))

(defn función-partial-15
  []
  (let [f (fn [x y] (select-keys x y))
        z (partial f [:i])]
    (z {:a "primero" :e "segundo" :i "tercero" :o "cuarto" :u "quinto"})))

(defn función-partial-16
  []
  (let [f (fn [x y] (into x y))
        z (partial f [])]
    (z {:a "amarillo" :e "azul" :i "verde" :o "negro" :u "morado"})))

(defn función-partial-17
  []
  (let [f (fn [x y] (partition-all x y))
        z (partial f 4)]
    (z [0 1 2 3 4 5 6 7 8 9])))

(defn función-partial-18
  []
  (let [f (fn [x y] (remove x y))
        z (partial f neg?)]
    (z (vector 549 9 123 97 -65 -2 -98 -1))))

(defn función-partial-19
  []
  (let [f (fn [v w x y] (merge-with v w x y))
        z (partial f +)]
    (z {:a 8} {:a 1} {:a 9})))

(defn función-partial-20
  []
  (let [f (fn [x y] (zipmap x y))
        z (partial f [:a :b :c :d :e])]
    (z ["josue" "ysai" "martinez" "morales" "23"])))


(función-partial-1)
(función-partial-2)
(función-partial-3)
(función-partial-4)
(función-partial-5)
(función-partial-6)
(función-partial-7)
(función-partial-8)
(función-partial-9)
(función-partial-10)
(función-partial-11)
(función-partial-12)
(función-partial-13)
(función-partial-14)
(función-partial-15)
(función-partial-16)
(función-partial-17)
(función-partial-18)
(función-partial-19)
(función-partial-20)

(defn función-some-fn-1
  []
  (let [f (fn [x] (string? x))
        g (fn [x] (nil? x))
        z (some-fn f g)]
    (z [])))

(defn función-some-fn-2
  []
  (let [f (fn [x] (nil? x))
        g (fn [x] (char? x))
        z (some-fn f g)]
    (z nil)))

(defn función-some-fn-3
  []
  (let [f (fn [x] (char? x))
        g (fn [x] (symbol? x))
        z (some-fn f g)]
    (z \a)))

(defn función-some-fn-4
  []
  (let [f (fn [x] (odd? x))
        g (fn [x] (sequential? x))
        z (some-fn f g)]
    (z 54)))

(defn función-some-fn-5
  []
  (let [f (fn [x] (empty? x))
        g (fn [x] (map? x))
        z (some-fn f g)]
    (z {:nombre "Josue" :edad 23 :ciudad "Oaxaca"})))

(defn función-some-fn-6
  []
  (let [f (fn [x] (keyword? x))
        g (fn [x] (char? x))
        z (some-fn f g)]
    (z :a)))

(defn función-some-fn-7
  []
  (let [f (fn [x] (empty? x))
        g (fn [x] (map? x))
        z (some-fn f g)]
    (z #{5 98 2 4})))

(defn función-some-fn-8
  []
  (let [f (fn [x] (true? x))
        g (fn [x] (false? x))
        z (some-fn f g)]
    (z true)))

(defn función-some-fn-9
  []
  (let [f (fn [x] (vector? x))
        g (fn [x] (not-any? x))
        z (some-fn f g)]
    (z [65 89 15 32])))

(defn función-some-fn-10
  []
  (let [f (fn [x] (true? x))
        g (fn [x] (nil? x))
        z (some-fn f g)]
    (z false)))

(defn función-some-fn-11
  []
  (let [f (fn [x] (map? x))
        g (fn [x] (keyword? x))
        z (some-fn f g)]
    (z [5 65 981 15])))

(defn función-some-fn-12
  []
  (let [f (fn [x] (true? x))
        g (fn [x] (string? x))
        z (some-fn f g)]
    (z true)))

(defn función-some-fn-13
  []
  (let [f (fn [x] (int? x))
        g (fn [x] (odd? x))
        z (some-fn f g)]
    (z 2)))

(defn función-some-fn-14
  []
  (let [f (fn [x] (keyword? x))
        g (fn [x] (set? x))
        z (some-fn f g)]
    (z :a)))

(defn función-some-fn-15
  []
  (let [f (fn [x] (vector? x))
        g (fn [x] (int? x))
        z (some-fn f g)]
    (z [9 8 7 6 5 4])))

(defn función-some-fn-16
  []
  (let [f (fn [x] (sequential? x))
        g (fn [x] (pos-int? x))
        z (some-fn f g)]
    (z [4 5 6 7 8 9])))

(defn función-some-fn-17
  []
  (let [f (fn [x] (string? x))
        g (fn [x] (symbol? x))
        z (some-fn f g)]
    (z :keyword)))

(defn función-some-fn-18
  []
  (let [f (fn [x] (seqable? x))
        g (fn [x] (char? x))
        z (some-fn f g)]
    (z \a)))

(defn función-some-fn-19
  []
  (let [f (fn [x] (char? x))
        g (fn [x] (even? x))
        z (some-fn f g)]
    (z 14)))

(defn función-some-fn-20
  []
  (let [f (fn [x] (boolean? x))
        g (fn [x] (double? x))
        z (some-fn f g)]
    (z "hola")))

(función-some-fn-1)
(función-some-fn-2)
(función-some-fn-3)
(función-some-fn-4)
(función-some-fn-6)
(función-some-fn-5)
(función-some-fn-7)
(función-some-fn-8)
(función-some-fn-9)
(función-some-fn-10)
(función-some-fn-11)
(función-some-fn-12)
(función-some-fn-13)
(función-some-fn-14)
(función-some-fn-15)
(función-some-fn-16)
(función-some-fn-17)
(función-some-fn-18)
(función-some-fn-19)
(función-some-fn-20)