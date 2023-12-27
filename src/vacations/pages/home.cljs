(ns vacations.pages.home
  (:require
    [helix.core :refer [<>]]
    [helix.dom :as d]
    [vacations.render-util :refer [defnc]]))


(declare home-page)


(defnc home-page
  []
  (<>
    (d/header {:class "header"}
              (<> (d/p {:class "header__welcome"} "Hi Mike,")
                  (d/p {:class "header__welcome-tip"} "let's plan your vacation")))

    (d/main {:class "main"}
            (<>
              (d/div {:class "action"})
              (d/div {:class "actions"})
              (d/input {:type "date" :placeholder "hddd"})
              )
            )
    
    ))
