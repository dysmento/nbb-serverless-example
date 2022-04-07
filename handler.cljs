(ns example
  (:require [applied-science.js-interop :as j]))

(defn handler [event _ctx]
  (let [body (js/JSON.parse (j/get event :body))
        name (j/get body :name)]
    (js/Promise.resolve
     (clj->js
      {:statusCode 200
       :body       (js/JSON.stringify #js{:result (str "Hello, " name)})}))))

;; exports
#js {:handler handler}
