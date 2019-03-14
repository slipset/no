(ns no.handler
  (:require [compojure.core :refer :all]
            [ring.middleware.defaults :refer [site-defaults wrap-defaults]]))

(defroutes app-routes
  (fn no [request]
    {:status 403
     :headers {"Content-Type" "text/html; charset=utf-8"}
     :body "No"}))

(def app
  (wrap-defaults app-routes site-defaults))
