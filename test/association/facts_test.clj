(ns association.facts-test
  (:require [clojure.test :refer [deftest is testing]]
            [clojure.edn :as edn]
            [clojure.string :as str]
            [association.facts :as facts]))

(deftest kcci-has-spec-basis
  (let [sb (facts/spec-basis "kcci")]
    (is (= 15 (count sb)))
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
  (is (= 15 (count (facts/by-topic "kcci" :governance))))
  (is (= 4 (count (facts/by-topic "kcci" :statute))))
  (is (empty? (facts/by-topic "kcci" :labor)))
  (is (empty? (facts/by-topic "ibec" :governance))))

;; ---------------------------------------------------------------------------
;; Every entry is a citation, so the shape a citation has to hold is the
;; invariant worth pinning. A catalog whose entries carry no URL, or carry the
;; same id twice, still answers every query above without complaint.

(def ^:private entries (vec (facts/spec-basis "kcci")))

(deftest every-entry-cites-a-source
  (doseq [[i e] (map-indexed vector entries)]
    (testing (str "entry " i " / " (:association-rule/id e))
      (let [u (:association-rule/url e)]
        (is (string? u))
        (is (str/starts-with? u "https://")
            "a citation is a retrievable address, not a description of one"))
      (is (keyword? (:association-rule/url-provenance e)))
      (is (contains? #{:official-korcham-net :official-law-go-kr}
                     (:association-rule/url-provenance e))
          "provenance names the domain the entry was actually read from")
      (is (seq (:association-rule/topic e)))
      (is (= "2026-09-10" (:association-rule/retrieved-at e))))))

(deftest ids-are-unique
  (let [ids (map :association-rule/id entries)]
    (is (= (count ids) (count (distinct ids))))))

(deftest no-office-holder-is-named
  ;; korcham.net's chronology lists chairman inaugurations by name.
  ;; organization.edn says those are never persisted here; a catalog that
  ;; quietly grew one would still pass every other test in this file.
  (doseq [e entries]
    (is (nil? (re-find #"회장 취임" (:association-rule/title e)))
        (:association-rule/id e))))

(deftest the-derived-tx-file-says-the-same-thing
  ;; data/datascript-tx.edn is documented as derived from this catalog, but
  ;; nothing re-derives it; the two are edited together and can drift apart.
  (let [tx (edn/read-string (slurp "data/datascript-tx.edn"))]
    (is (vector? tx))
    (is (= (count entries) (count tx)))
    (doseq [[e t] (map vector entries tx)]
      (testing (:association-rule/id e)
        (doseq [k [:association-rule/id :association-rule/title
                   :association-rule/url :association-rule/url-provenance
                   :association-rule/established-date :association-rule/kind]]
          (is (= (get e k) (get t k))))
        (is (= (:association-rule/topic e)
               (set (:association-rule/topic t))))))))
