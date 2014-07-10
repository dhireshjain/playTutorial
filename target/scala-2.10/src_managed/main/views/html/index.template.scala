
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Blog],Form[Application.logInCredentials],List[Users],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(blogs: List[Blog], log : Form[Application.logInCredentials], users: List[Users]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.83*/(""" 

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Blogs")/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""


<div  class="row navbar-collapse collapse pull-right" style="text-align:center">
<form class="col-lg-11" method="post" action=""""),_display_(Seq[Any](/*9.48*/routes/*9.54*/.Application.check)),format.raw/*9.72*/("""">
<ul class="nav navbar-nav">
<li><input type="text" name="username" placeholder="username"/></li>
<li></br></br></li>
<li><input type="password" name="password" placeholder="password" /></li>
<li></br></br></li>
<li><input class = "btn-success"type="submit" value="Login" /><li/></br></br>
</ul>  
</form>

</div>

</br></br></br>
<div class="row" style="text-align:center">
	<h1 class="jumbotron" style="background-color: GREY; text-align:center font-size: 50px">Hello Blog</h1>
</div>
</br>
<!-- Example row of columns -->

<div class="row">
	
</div>	

<div class="row" >
	<div class="col-lg-8">
	"""),_display_(Seq[Any](/*34.3*/for(blog <- blogs) yield /*34.21*/ {_display_(Seq[Any](format.raw/*34.23*/("""
	<div class="jumbotron">
		<h2 style="color: GREY">"""),_display_(Seq[Any](/*36.28*/blog/*36.32*/.header)),format.raw/*36.39*/("""</h2>
		<h6 style="color:RED">Time: """),_display_(Seq[Any](/*37.32*/blog/*37.36*/.time)),format.raw/*37.41*/(""" Author: """),_display_(Seq[Any](/*37.51*/blog/*37.55*/.author)),format.raw/*37.62*/("""</h6>
		<blockquote style="font-size: 22px ; color: #2929A6 word-wrap: break-word">"""),_display_(Seq[Any](/*38.79*/blog/*38.83*/.text)),format.raw/*38.88*/("""</blockquote>
	</div>
	""")))})),format.raw/*40.3*/("""
	</div>
	<div class="col-lg-4">
	</div>
</div>
""")))})),format.raw/*45.2*/("""

"""))}
    }
    
    def render(blogs:List[Blog],log:Form[Application.logInCredentials],users:List[Users]): play.api.templates.HtmlFormat.Appendable = apply(blogs,log,users)
    
    def f:((List[Blog],Form[Application.logInCredentials],List[Users]) => play.api.templates.HtmlFormat.Appendable) = (blogs,log,users) => apply(blogs,log,users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 10 22:37:26 IST 2014
                    SOURCE: /home/dhiresh/blog/app/views/index.scala.html
                    HASH: e70e8a19d6fc16f2fc1a0485dfabb21b10de322d
                    MATRIX: 825->1|1016->82|1045->102|1081->104|1102->117|1141->119|1307->250|1321->256|1360->274|1997->876|2031->894|2071->896|2160->949|2173->953|2202->960|2275->997|2288->1001|2315->1006|2361->1016|2374->1020|2403->1027|2523->1111|2536->1115|2563->1120|2618->1144|2698->1193
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|62->34|62->34|62->34|64->36|64->36|64->36|65->37|65->37|65->37|65->37|65->37|65->37|66->38|66->38|66->38|68->40|73->45
                    -- GENERATED --
                */
            