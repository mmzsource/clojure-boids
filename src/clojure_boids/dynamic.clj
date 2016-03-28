(ns clojure-boids.dynamic
  (:require [quil.core :as q])) 

(defn setup []
  (q/smooth)
  (q/frame-rate 3)
  (q/background 200))

(defn draw []
  (q/stroke (q/random 255) (q/random 255) (q/random 255))
  (q/stroke-weight (q/random 10))
  (q/fill (q/random 255) (q/random 255) (q/random 255))

; Triangles
; (let [x1   (q/random (q/width))
;        y1   (q/random (q/height))
;        x2   (q/random (q/width))
;        y2   (q/random (q/height))
;        x3   (q/random (q/width))
;        y3   (q/random (q/height))]
;   (q/triangle x1 y1 x2 y2 x3 y3)))

; Circles:
(let [diam (q/random 100)
      x    (q/random (q/width))
      y    (q/random (q/height))]
  (q/ellipse x y diam diam)))