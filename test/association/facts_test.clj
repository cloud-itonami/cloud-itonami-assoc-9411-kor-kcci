(ns association.facts-test
  (:require [clojure.test :refer [deftest is]]
            [association.facts :as facts]))

(deftest kcci-has-spec-basis
  (let [sb (facts/spec-basis "kcci")]
    (is (= 2 (count sb)))
    (is (every? #(= "9411" (:association-rule/isic %)) sb))
    (is (every? #(= "KOR" (:association-rule/country %)) sb))))

(deftest unknown-association-has-no-spec-basis
  (is (nil? (facts/spec-basis "ibec")))
  (is (nil? (facts/spec-basis "zzz"))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["kcci" "ibec"])]
    (is (= 2 (:requested c)))
    (is (= 1 (:covered c)))
    (is (= ["ibec"] (:missing-associations c)))))

(deftest by-topic-filters
  (is (= 2 (count (facts/by-topic "kcci" :governance))))
  (is (empty? (facts/by-topic "kcci" :labor)))
  (is (empty? (facts/by-topic "ibec" :governance))))
