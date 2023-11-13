(ns ones-on-ones.use-cases.organization
  (:gen-class))

(defrecord Organization [name])

(defn create-organization [name]
  (->Organization name))

(defn get-organization [id])

(defn disable-organization [id])

(defn update-organization [id name])



