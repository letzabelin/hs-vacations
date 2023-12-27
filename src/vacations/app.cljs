(ns vacations.app
  (:require
    ["react-dom/client" :refer [createRoot] :rename {createRoot create-root}]
    [helix.core :refer [$]]
    [vacations.pages.home :refer [home-page]]
    [vacations.render-util :refer [defnc]]))


(declare app)


(defnc app []
  (home-page $))


(defonce root (create-root (js/document.getElementById "root")))


(defn ^:dev/after-load mount-ui
  []
  (.render root ($ app)))


(defn ^:export init
  []
  (mount-ui))
