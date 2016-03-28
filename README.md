# clojure-boids

A Quil sketch designed to visualise [boids](https://en.wikipedia.org/wiki/Boids) behavior.

## Usage

Sublime + Sublime REPL ([sublime repl usage](https://sublimerepl.readthedocs.org/en/latest/), [quil dynamic workflow](https://github.com/quil/quil/wiki/Dynamic-Workflow-(for-REPL))): 

- Open clojure repl **when focus is in project.clj**. This will startup the applet. 
- To reload dynamic.clj run `(use :reload 'clojure-boids.dynamic)` in the repl.

Note that changes to the `setup` function won't be picked up since `setup` only runs once during ... setup.

## Links

### KD Trees

- [KD - trees](https://en.wikipedia.org/wiki/K-d_tree) - Also checkout algorithms 4th (sedgewick) BST (Binary Search Tree)
- [clj-kd-trees](https://github.com/abscondment/clj-kdtree)
- [Sedgewick sheets on geometric search (including boids)](http://algs4.cs.princeton.edu/lectures/99GeometricSearch-2x2.pdf) 

### Flocking examples

- [Flocking Demo using Quil](https://github.com/jsofra/flock)
- [Very lean flocking implementation in clojure](https://github.com/rosejn/flocking)
- [Flocking about with clojure](http://www.fatvat.co.uk/2009/07/flocking-about-with-clojure.html)

### Quil

- [Quil API](http://quil.info/api/)