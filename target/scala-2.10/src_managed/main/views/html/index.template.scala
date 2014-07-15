
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


<div  class="row navbar-collapse collapse">
<div class= "pull-left" style="text-align:center">
<form  action=""""),_display_(Seq[Any](/*10.17*/routes/*10.23*/.Application.signup)),format.raw/*10.42*/("""">
<button class="btn-primary" action = "http:://www.google.com">Sign Up</button>
</form>
</div>
<div class= "pull-right" style="text-align:center">
<form class="col-lg-11" method="post" action=""""),_display_(Seq[Any](/*15.48*/routes/*15.54*/.Application.check)),format.raw/*15.72*/("""">
<ul class="nav navbar-nav">
<li><input type="text" name="username" placeholder="username"/></li>
<li></br></br></li>
<li><input type="password" name="password" placeholder="password" /></li>
<li></br></br></li>
<li><input class = "btn-success"type="submit" value="Login" /><li/></br></br>
</ul>  
</form>
</div>
</div>
"""),_display_(Seq[Any](/*26.2*/if(flash.contains("success"))/*26.31*/ {_display_(Seq[Any](format.raw/*26.33*/("""
    <p class="success text-center" style="color:GREEN">
        """),_display_(Seq[Any](/*28.10*/flash/*28.15*/.get("success"))),format.raw/*28.30*/("""
    </p>
""")))})),format.raw/*30.2*/("""
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
	"""),_display_(Seq[Any](/*44.3*/for(blog <- blogs) yield /*44.21*/ {_display_(Seq[Any](format.raw/*44.23*/("""
	<div class="jumbotron">
		<h2 style="color: GREY">"""),_display_(Seq[Any](/*46.28*/blog/*46.32*/.header)),format.raw/*46.39*/("""</h2>
		<h6 style="color:RED">Time: """),_display_(Seq[Any](/*47.32*/blog/*47.36*/.time)),format.raw/*47.41*/(""" Author: """),_display_(Seq[Any](/*47.51*/blog/*47.55*/.author)),format.raw/*47.62*/("""</h6>
		<blockquote style="font-size: 22px ; color: #2929A6 word-wrap: break-word">"""),_display_(Seq[Any](/*48.79*/blog/*48.83*/.text)),format.raw/*48.88*/("""</blockquote>
	</div>
	""")))})),format.raw/*50.3*/("""
	</div>
	<div class="col-lg-4">
	</div>
</div>
""")))})),format.raw/*55.2*/("""

"""))}
    }
    
    def render(blogs:List[Blog],log:Form[Application.logInCredentials],users:List[Users]): play.api.templates.HtmlFormat.Appendable = apply(blogs,log,users)
    
    def f:((List[Blog],Form[Application.logInCredentials],List[Users]) => play.api.templates.HtmlFormat.Appendable) = (blogs,log,users) => apply(blogs,log,users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 15 22:18:19 IST 2014
                    SOURCE: /home/dhiresh/blog/app/views/index.scala.html
                    HASH: 1daa9e139e8addc5b43051cbdc83a5dede214da7
                    MATRIX: 825->1|1016->82|1045->102|1081->104|1102->117|1141->119|1291->233|1306->239|1347->258|1579->454|1594->460|1634->478|1992->801|2030->830|2070->832|2172->898|2186->903|2223->918|2265->929|2586->1215|2620->1233|2660->1235|2749->1288|2762->1292|2791->1299|2864->1336|2877->1340|2904->1345|2950->1355|2963->1359|2992->1366|3112->1450|3125->1454|3152->1459|3207->1483|3287->1532
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|38->10|38->10|38->10|43->15|43->15|43->15|54->26|54->26|54->26|56->28|56->28|56->28|58->30|72->44|72->44|72->44|74->46|74->46|74->46|75->47|75->47|75->47|75->47|75->47|75->47|76->48|76->48|76->48|78->50|83->55
                    -- GENERATED --
                */
            