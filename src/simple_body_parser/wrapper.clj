(ns simple-body-parser.wrapper
  (:require [clojure.string :as str]
            [ring.util.request :refer [body-string]]))

(defn- bodys-assoc [origin bodyStr]
  (reduce #(let [[key val] (str/split %2 #"=")]
             (assoc-in %1 [:bodys (keyword key)] val)) 
          origin 
          ;(str/split (body-string request) #"&")
          (str/split bodyStr #"&")))

(defn wrap-bodys
  [handler]
  (fn [request]
    (-> request
        (bodys-assoc (body-string request))
        (handler))))