// @SOURCE:/home/dhiresh/blog/conf/routes
// @HASH:a818477e42829e56be8a1a46d1a8dcb792d5ac43
// @DATE:Sun Jul 06 19:11:50 IST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:8
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:12
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def check(): Call = {
   Call("POST", _prefix)
}
                                                

// @LINE:19
def adding(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "add")
}
                                                

// @LINE:17
def add(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "add")
}
                                                

// @LINE:12
def loggedIn(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                                                

// @LINE:21
def logOut(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logOut")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:12
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def check : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.check",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:19
def adding : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adding",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
      }
   """
)
                        

// @LINE:17
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
      }
   """
)
                        

// @LINE:12
def loggedIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loggedIn",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:21
def logOut : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logOut",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logOut"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:12
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def check(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.check(), HandlerDef(this, "controllers.Application", "check", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:19
def adding(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adding(), HandlerDef(this, "controllers.Application", "adding", Seq(), "POST", """""", _prefix + """add""")
)
                      

// @LINE:17
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.add(), HandlerDef(this, "controllers.Application", "add", Seq(), "GET", """""", _prefix + """add""")
)
                      

// @LINE:12
def loggedIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loggedIn(), HandlerDef(this, "controllers.Application", "loggedIn", Seq(), "GET", """""", _prefix + """admin""")
)
                      

// @LINE:21
def logOut(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logOut(), HandlerDef(this, "controllers.Application", "logOut", Seq(), "GET", """""", _prefix + """logOut""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    