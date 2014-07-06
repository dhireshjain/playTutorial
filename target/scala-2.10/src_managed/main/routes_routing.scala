// @SOURCE:/home/dhiresh/blog/conf/routes
// @HASH:a818477e42829e56be8a1a46d1a8dcb792d5ac43
// @DATE:Sun Jul 06 19:11:50 IST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_check1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:12
private[this] lazy val controllers_Application_loggedIn2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
        

// @LINE:15
private[this] lazy val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:17
private[this] lazy val controllers_Application_add4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add"))))
        

// @LINE:19
private[this] lazy val controllers_Application_adding5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add"))))
        

// @LINE:21
private[this] lazy val controllers_Application_logOut6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logOut"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix,"""controllers.Application.check()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Application.loggedIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add""","""controllers.Application.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add""","""controllers.Application.adding()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logOut""","""controllers.Application.logOut()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_check1(params) => {
   call { 
        invokeHandler(controllers.Application.check(), HandlerDef(this, "controllers.Application", "check", Nil,"POST", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:12
case controllers_Application_loggedIn2(params) => {
   call { 
        invokeHandler(controllers.Application.loggedIn(), HandlerDef(this, "controllers.Application", "loggedIn", Nil,"GET", """""", Routes.prefix + """admin"""))
   }
}
        

// @LINE:15
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:17
case controllers_Application_add4(params) => {
   call { 
        invokeHandler(controllers.Application.add(), HandlerDef(this, "controllers.Application", "add", Nil,"GET", """""", Routes.prefix + """add"""))
   }
}
        

// @LINE:19
case controllers_Application_adding5(params) => {
   call { 
        invokeHandler(controllers.Application.adding(), HandlerDef(this, "controllers.Application", "adding", Nil,"POST", """""", Routes.prefix + """add"""))
   }
}
        

// @LINE:21
case controllers_Application_logOut6(params) => {
   call { 
        invokeHandler(controllers.Application.logOut(), HandlerDef(this, "controllers.Application", "logOut", Nil,"GET", """""", Routes.prefix + """logOut"""))
   }
}
        
}

}
     