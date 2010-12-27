(ns tesujo.game)


(defn make-board [size] (vec (for [_ (range size)] (vec ))))