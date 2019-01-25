(ns cljc-ci-experiment-public.core
  #?(:clj (:gen-class)))

(defn hello
  []
  "Hello World from Public!")

(defn -main [& args]
  (println (hello)))

#?(:cljs (set! *main-cli-fn* -main))