(ns cljc-ci-experiment_public.core-test
  (:require
   [cljc-ci-experiment-public.core :refer [hello]]
   [clojure.test :refer [deftest testing is]]))

(deftest hello-test
  (is (= "Hello World from Public!" (hello))))