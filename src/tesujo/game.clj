(ns tesujo.game)

(defn make-board [size] (vec (for [_ (range size)] (vec (repeat size 0)))))

(defn is-occupied?
  "Checks if position of board is filled"
  [board x y] (if (= (get-in board [x y]) 0)
		false
		true))

(defn make-move [board color x y]
  "First the most simple thing, play if it is unoccupied"
  (if (is-occupied? board)
    (assoc-in board [x y] color)
    board))