(ns lib-1.core
  (:require [clj-commons.digest :as digest]))

(defn nice-hash
  "Creates a nice hash"
  [s]
  {:md5 (digest/md5 s)
   :sha1 (digest/sha1 s)})
