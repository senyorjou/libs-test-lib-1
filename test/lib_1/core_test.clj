(ns lib-1.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [lib-1.core :refer [nice-hash]]))

(deftest nice-hash-test
  (testing "nice-hash should return a nice hash."
    (let [result (nice-hash "123")
          md5 (:md5 result)
          sha1 (:sha1 result)]
      (is (= (keys result) [:md5 :sha1]))
      (is (= (re-find #"^[0-9a-f]{32}$" md5) md5))
      (is (= (re-find #"^[0-9a-f]{40}$" sha1) sha1)))))
