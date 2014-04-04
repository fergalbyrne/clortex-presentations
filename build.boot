#!/usr/bin/env boot

#tailrecursion.boot.core/version "2.2.1"

(set-env!
  :project
  'hoplon-reveal-js
  :version
  "0.2.0-SNAPSHOT"
  :dependencies
  [['tailrecursion/boot.core "2.2.1"]
   ['tailrecursion/boot.task "2.1.1"]
   ['tailrecursion/hoplon "5.5.1"]
   ['org.clojure/clojurescript "0.0-2127"]]
  :src-paths
  #{"src/cljs"}
  :out-path
  "resources/public")

(add-sync! (get-env :out-path) #{"resources/assets"})

(require
  ['tailrecursion.hoplon.boot :refer :all]
  ['tailrecursion.boot.task :refer :all])
