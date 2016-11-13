
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/azizahmed.khan/reactive-instruments-workshop/conf/routes
// @DATE:Mon Nov 14 09:18:06 NZDT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
