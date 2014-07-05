
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Blog],Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(blogs: List[Blog], flag : Boolean):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/(""" 

"""),_display_(Seq[Any](/*3.2*/main("Blogs")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""

<div  class=" row navbar-form pull-center" style="text-align:center">
<form class="col-lg-11">
	<input class="span2" type="text" placeholder="Email"> <input
		class="span2" type="password" placeholder="Password">
	<button type="submit" class="btn">Sign in</button>
</form>
"""),_display_(Seq[Any](/*11.2*/if(flag)/*11.10*/{_display_(Seq[Any](format.raw/*11.11*/("""
<button type ="button" class="btn-primary col-lg-.75">Add</button>
""")))})),format.raw/*13.2*/("""
</div>

<br>
<div class="row dropdown-header" style="text-align:center">
	<h1 style="text-align:center font-size: 50px">Hello Blog</h1>
</div>
</br>
<!-- Example row of columns -->
<div class="row">
	"""),_display_(Seq[Any](/*23.3*/for(blog <- blogs) yield /*23.21*/ {_display_(Seq[Any](format.raw/*23.23*/("""
	<div class="jumbotron">
		<h3 class="row">"""),_display_(Seq[Any](/*25.20*/blog/*25.24*/.header)),format.raw/*25.31*/("""</h3>
		<p style="font-size: 22px">"""),_display_(Seq[Any](/*26.31*/blog/*26.35*/.text)),format.raw/*26.40*/("""</p>
	</div>
	""")))})),format.raw/*28.3*/("""
</div>
""")))})),format.raw/*30.2*/("""
"""))}
    }
    
    def render(blogs:List[Blog],flag:Boolean): play.api.templates.HtmlFormat.Appendable = apply(blogs,flag)
    
    def f:((List[Blog],Boolean) => play.api.templates.HtmlFormat.Appendable) = (blogs,flag) => apply(blogs,flag)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 05 22:33:24 IST 2014
                    SOURCE: /home/dhiresh/blog/app/views/index.scala.html
                    HASH: c5c28fc36942795064a89d159a87d8d105494efc
                    MATRIX: 786->1|915->36|953->40|974->53|1013->55|1324->331|1341->339|1380->340|1480->409|1717->611|1751->629|1791->631|1872->676|1885->680|1914->687|1986->723|1999->727|2026->732|2072->747|2112->756
                    LINES: 26->1|29->1|31->3|31->3|31->3|39->11|39->11|39->11|41->13|51->23|51->23|51->23|53->25|53->25|53->25|54->26|54->26|54->26|56->28|58->30
                    -- GENERATED --
                */
            