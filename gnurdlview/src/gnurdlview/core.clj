(ns gnurdlview.core
  (:require [clojure.java.io :as cjio])
  (:gen-class))

(defn read-test-file
  []
  (with-open [fd (cjio/reader "resources/test1.data")]
    (doall (line-seq fd))))

(comment 
  (count (read-test-file))
  )


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
