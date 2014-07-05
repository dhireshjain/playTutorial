// @SOURCE:/home/dhiresh/blog/conf/routes
// @HASH:f930b787309cab6b33e95bc9a8d26bcb74afb8da
// @DATE:Sat Jul 05 20:48:26 IST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:13
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:13
def adding(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "adding")
}
                                                

// @LINE:11
def add(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "add")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:13
def adding : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adding",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adding"})
      }
   """
)
                        

// @LINE:11
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
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
        


// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:13
def adding(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adding(), HandlerDef(this, "controllers.Application", "adding", Seq(), "GET", """""", _prefix + """adding""")
)
                      

// @LINE:11
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.add(), HandlerDef(this, "controllers.Application", "add", Seq(), "GET", """""", _prefix + """add""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    