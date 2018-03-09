(ns nc.utils-test
  (:require [clojure.test :refer :all]
            [clojure.spec.alpha :as s]
            [clojure.spec.gen.alpha :as g]
            [nc.utils :as nc-utils]
            [nc.spec :as nc]))

(deftest nc-utils
  (testing "generating hashes from spec'd nc-documents"
    (let [document-keys [:title :published-at :url :source :author :desc]
          test-document (g/generate (s/gen ::nc/document))]
      (is (= document-keys
             (keys (nc-utils/to-hash test-document)))))))
