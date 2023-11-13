(defproject ones-on-ones "0.1.0-SNAPSHOT"
  :description "One on ones project"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.github.seancorfield/next.jdbc "1.3.894"]
                 [org.postgresql/postgresql "42.6.0"]
                 [migratus "1.5.3"]
                 [org.slf4j/slf4j-log4j12 "2.0.9" :extension "pom"]
                 [ch.qos.logback/logback-classic "1.4.11"]]
  :plugins [[migratus-lein "0.7.3"]]
  ;; TODO: CHANGE USER AND PASS FOR ENV VARS
  :migratus {:store :database
             :migration-dir "migrations"
             :db {:dbtype "postgres"
                  :host ""
                  :port 26257
                  :dbname "one-on-one"
                  :user ""
                  :password ""}}
  :main ^:skip-aot ones-on-ones.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot      :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
