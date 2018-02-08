# simple-body-parser

A Clojure library designed to parse body for POST request.Based on ring.

## Usage

> This repository is developing,so you can't refer it from clojar now.But you can deploy it to local repository by leiningen.

1. Fix this repository source code:  `project.clj` -> `:deploy-repositories` -> `url` to desired local path
2. use command `lein deploy local` deploy this library
3. In your `project.clj`, add repository, e.g. `:repositories [["local" "file:///E:/repositories/clojar"]]`
4. `(require '[simple-body-parser.wrapper :refer [wrap-bodys]])`
5. `(def app (-> handler (wrap-bodys)))`
6. Now you can use `(:bodys request)` in your handler

## License

Copyright © 2018 kobako

Distributed under the MIT License.