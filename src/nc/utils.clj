(ns nc.utils
  (:require [nc.spec :as nc]))


(defn to-hash
  [{:keys [::nc/document-title
           ::nc/document-published-at
           ::nc/document-url
           ::nc/document-url-to-img
           ::nc/document-source
           ::nc/document-author
           ::nc/document-description]}]
  {:title document-title
   :published-at document-published-at
   :url document-url
   :source document-source
   :author document-author
   :desc document-description})

