(ns nc.spec
  (:require [clojure.spec.alpha :as s]))

(s/def ::document-type #{:email
                         :article
                         :template})

(s/def ::document-title string?)
(s/def ::document-published-at inst?)
(s/def ::document-url string?)
(s/def ::document-url-to-img string?)
(s/def ::document-source string?)
(s/def ::document-author string?)
(s/def ::document-description string?)

(s/def ::document
  (s/keys :req [::document-title ::document-url ::document-published-at]
          :opt [::document-author ::document-description ::document-source ::document-url-to-img]))

