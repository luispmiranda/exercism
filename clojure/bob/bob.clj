(ns bob)

; if bob said nothing
(defn- silence? [phrase]
  (empty? (.trim phrase)))

; if bob is shouting with something that is not silence
; has letters and uppercase
(defn- shouting? [phrase]
  (and
    (and (not (silence? phrase)) (re-find #"[A-Z]" phrase))
    (= (clojure.string/upper-case phrase) phrase)))

; if bob asked a question
(defn- question? [phrase]
  (.endsWith phrase "?"))

(defn response-for [phrase]
  (cond
    (shouting? phrase) "Whoa, chill out!"
    (question? phrase) "Sure."
    (silence? phrase)  "Fine. Be that way!"
    :else              "Whatever."))