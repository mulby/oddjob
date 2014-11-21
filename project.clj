(defproject oddjob "1.1.0"
  :description "Hadoop utilities for MrJob that must run in the JVM"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.json "0.2.2"]
                 [org.clojure/data.csv "0.1.2"]]
  :license {:name "Apache License, Version 2.0 "
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :profiles {:dev 
               {:resource-paths ["test-resources"]
                :dependencies [[org.apache.hadoop/hadoop-streaming "2.3.0"]
                               [org.apache.hadoop/hadoop-common "2.3.0"]
                               [org.apache.hadoop/hadoop-mapreduce-client-core "2.3.0"]]}
             :provided
               {:dependencies [[org.apache.hadoop/hadoop-streaming "2.3.0"]
                               [org.apache.hadoop/hadoop-common "2.3.0"]
                               [org.apache.hadoop/hadoop-mapreduce-client-core "2.3.0"]]}}
  :aot :all)
