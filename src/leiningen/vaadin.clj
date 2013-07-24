(ns leiningen.vaadin)

(defn- gwt-compile
  [project module]
  (com.google.gwt.dev.Compiler/main (into-array [module])))

(defn vaadin
  [project subtask & args]
  (case subtask
    "gwt-compile" (apply gwt-compile project args)))
