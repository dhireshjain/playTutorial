
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
"""),_display_(Seq[Any](/*20.2*/if(flash.contains("success"))/*20.31*/ {_display_(Seq[Any](format.raw/*20.33*/("""
    <p class="success text-center" style="color:GREEN">
        """),_display_(Seq[Any](/*22.10*/flash/*22.15*/.get("success"))),format.raw/*22.30*/("""
    </p>
""")))})),format.raw/*24.2*/("""
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
	"""),_display_(Seq[Any](/*38.3*/for(blog <- blogs) yield /*38.21*/ {_display_(Seq[Any](format.raw/*38.23*/("""
	<div class="jumbotron">
		<h2 style="color: GREY">"""),_display_(Seq[Any](/*40.28*/blog/*40.32*/.header)),format.raw/*40.39*/("""</h2>
		<h6 style="color:RED">Time: """),_display_(Seq[Any](/*41.32*/blog/*41.36*/.time)),format.raw/*41.41*/(""" Author: """),_display_(Seq[Any](/*41.51*/blog/*41.55*/.author)),format.raw/*41.62*/("""</h6>
		<blockquote style="font-size: 22px ; color: #2929A6 word-wrap: break-word">"""),_display_(Seq[Any](/*42.79*/blog/*42.83*/.text)),format.raw/*42.88*/("""</blockquote>
	</div>
	""")))})),format.raw/*44.3*/("""
	</div>
	<div class="col-lg-4">
	</div>
</div>
""")))})),format.raw/*49.2*/("""

"""))}
    }
    
    def render(blogs:List[Blog],log:Form[Application.logInCredentials],users:List[Users]): play.api.templates.HtmlFormat.Appendable = apply(blogs,log,users)
    
    def f:((List[Blog],Form[Application.logInCredentials],List[Users]) => play.api.templates.HtmlFormat.Appendable) = (blogs,log,users) => apply(blogs,log,users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 12 00:11:39 IST 2014
                    SOURCE: /home/dhiresh/blog/app/views/index.scala.html
                    HASH: b9785dda0db66c4ca4af822c8957edbc1f435764
                    MATRIX: 825->1|1016->82|1045->102|1081->104|1102->117|1141->119|1307->250|1321->256|1360->274|1712->591|1750->620|1790->622|1892->688|1906->693|1943->708|1985->719|2306->1005|2340->1023|2380->1025|2469->1078|2482->1082|2511->1089|2584->1126|2597->1130|2624->1135|2670->1145|2683->1149|2712->1156|2832->1240|2845->1244|2872->1249|2927->1273|3007->1322
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|48->20|48->20|48->20|50->22|50->22|50->22|52->24|66->38|66->38|66->38|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|69->41|70->42|70->42|70->42|72->44|77->49
                    -- GENERATED --
                */
            