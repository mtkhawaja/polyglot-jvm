(ns com.muneebkhawaja.polyglotjvm.clojure.lib.ClojureGreetingService
  (:gen-class
   :implements [com.muneebkhawaja.polyglotjvm.common.GreetingService])
  (:import (com.muneebkhawaja.polyglotjvm.common Greeting)))

(def ^:private greeting-from "Clojure")

(defn -greet
  "Implements GreetingService#greet"
  [this]
  (Greeting. "clojure" (str "hello from " greeting-from)))