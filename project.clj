(defproject jarohen/lein-frodo "0.2.0"
  :description "A Lein plugin to start an HTTP-kit server via configuration in Nomad"
  :url "https://github.com/james-henderson/nomad-ring.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [leinjacker "0.4.1"]
                 [jarohen/nomad "0.5.0"]]

  :eval-in-leiningen true)
