
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Signup],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Signup]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""


"""),_display_(Seq[Any](/*4.2*/main("SignUp")/*4.16*/ {_display_(Seq[Any](format.raw/*4.18*/("""
<html>
<body style="background-color:#BBBBBB;">
"""),_display_(Seq[Any](/*7.2*/helper/*7.8*/.form(routes.Application.authenticate)/*7.46*/ {_display_(Seq[Any](format.raw/*7.48*/("""
<div class="row" style = "vertical-align:center;">
   <h1 class="text-center">Sign Up</h1>
   <div class="text-center">
   <p>
       <input type="text" name="username" placeholder="Email" value=""""),_display_(Seq[Any](/*12.71*/form("email")/*12.84*/.value)),format.raw/*12.90*/("""">
   </p>
   <p>
       <input type="password" name="password" placeholder="Password">
   </p>
   <p>
  	
       <button class="btn btn-md btn-primary"  type="submit">Signup</button>
   </p>
   </div>
   </div>
""")))})),format.raw/*23.2*/("""

</body>
</html>
""")))})),format.raw/*27.2*/("""
"""))}
    }
    
    def render(form:Form[Application.Signup]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Signup]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 12 00:10:35 IST 2014
                    SOURCE: /home/dhiresh/blog/app/views/signup.scala.html
                    HASH: 5ebf614a3813266f439e3f4ba55c486250313b45
                    MATRIX: 793->1|919->33|957->37|979->51|1018->53|1102->103|1115->109|1161->147|1200->149|1434->347|1456->360|1484->366|1728->579|1778->598
                    LINES: 26->1|29->1|32->4|32->4|32->4|35->7|35->7|35->7|35->7|40->12|40->12|40->12|51->23|55->27
                    -- GENERATED --
                */
            