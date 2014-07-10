
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
object loggedIn extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Blog],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(blogs: List[Blog]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.21*/(""" 

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Blogs")/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""


<div class = "container">
<div class="navbar-header pull-right">
<a href=""""),_display_(Seq[Any](/*10.11*/routes/*10.17*/.Application.logOut)),format.raw/*10.36*/("""">
<p class="btn-primary btn-warning icon-ok">Log Out</p>
</a>


</div>
</div>

<div class="row dropdown-header" style="text-align:center">
	<h1 style="text-align:center font-size: 50px">Hello Blog</h1>
</div>
</br>
<!-- Example row of columns -->
<div class="row">
	<div class="col-lg-8">
	"""),_display_(Seq[Any](/*25.3*/for(blog <- blogs) yield /*25.21*/ {_display_(Seq[Any](format.raw/*25.23*/("""
	<div class="jumbotron">
		<h2 class="row">"""),_display_(Seq[Any](/*27.20*/blog/*27.24*/.header)),format.raw/*27.31*/("""</h2>
		<h6 style="color:RED">Time: """),_display_(Seq[Any](/*28.32*/blog/*28.36*/.time)),format.raw/*28.41*/(""" Author: """),_display_(Seq[Any](/*28.51*/blog/*28.55*/.author)),format.raw/*28.62*/("""</h6>
		<p style="font-size: 22px">"""),_display_(Seq[Any](/*29.31*/blog/*29.35*/.text)),format.raw/*29.40*/("""</p>
	</div>	
	""")))})),format.raw/*31.3*/("""
	</div>
	<div class="col-lg-4">
	</div>
</div>

<a href=""""),_display_(Seq[Any](/*37.11*/routes/*37.17*/.Application.add)),format.raw/*37.33*/("""">
<button class="btn-success" style="width:10em">Add</button>
</a>


""")))})),format.raw/*42.2*/("""

"""))}
    }
    
    def render(blogs:List[Blog]): play.api.templates.HtmlFormat.Appendable = apply(blogs)
    
    def f:((List[Blog]) => play.api.templates.HtmlFormat.Appendable) = (blogs) => apply(blogs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 10 22:36:45 IST 2014
                    SOURCE: /home/dhiresh/blog/app/views/loggedIn.scala.html
                    HASH: 4271373fab7bba96f635a9298c1c0a45ad30d92d
                    MATRIX: 781->1|910->20|939->40|975->42|996->55|1035->57|1149->135|1164->141|1205->160|1532->452|1566->470|1606->472|1687->517|1700->521|1729->528|1802->565|1815->569|1842->574|1888->584|1901->588|1930->595|2002->631|2015->635|2042->640|2089->656|2184->715|2199->721|2237->737|2339->808
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|38->10|38->10|38->10|53->25|53->25|53->25|55->27|55->27|55->27|56->28|56->28|56->28|56->28|56->28|56->28|57->29|57->29|57->29|59->31|65->37|65->37|65->37|70->42
                    -- GENERATED --
                */
            