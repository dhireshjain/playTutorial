
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
	"""),_display_(Seq[Any](/*24.3*/for(blog <- blogs) yield /*24.21*/ {_display_(Seq[Any](format.raw/*24.23*/("""
	<div class="jumbotron">
		<h2 class="row">"""),_display_(Seq[Any](/*26.20*/blog/*26.24*/.header)),format.raw/*26.31*/("""</h2>
		<p style="font-size: 22px">"""),_display_(Seq[Any](/*27.31*/blog/*27.35*/.text)),format.raw/*27.40*/("""</p>
	</div>
	""")))})),format.raw/*29.3*/("""
</div>

<a href=""""),_display_(Seq[Any](/*32.11*/routes/*32.17*/.Application.add)),format.raw/*32.33*/("""">
<button class="btn-success" style="width:10em">Add</button>
</a>


""")))})),format.raw/*37.2*/("""

"""))}
    }
    
    def render(blogs:List[Blog]): play.api.templates.HtmlFormat.Appendable = apply(blogs)
    
    def f:((List[Blog]) => play.api.templates.HtmlFormat.Appendable) = (blogs) => apply(blogs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jul 06 19:14:21 IST 2014
                    SOURCE: /home/dhiresh/blog/app/views/loggedIn.scala.html
                    HASH: ecc8b2e27646d781bee7c37a45eee083924e7291
                    MATRIX: 781->1|910->20|939->40|975->42|996->55|1035->57|1149->135|1164->141|1205->160|1508->428|1542->446|1582->448|1663->493|1676->497|1705->504|1777->540|1790->544|1817->549|1863->564|1918->583|1933->589|1971->605|2073->676
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|38->10|38->10|38->10|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|57->29|60->32|60->32|60->32|65->37
                    -- GENERATED --
                */
            