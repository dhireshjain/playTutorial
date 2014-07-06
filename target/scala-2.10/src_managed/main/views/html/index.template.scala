
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Blog],Form[Application.logInCredentials],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(blogs: List[Blog], log : Form[Application.logInCredentials]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.63*/(""" 

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
	<h1 class="jumbotron" style="background-color: #D23F20 text-align:center font-size: 50px">Hello Blog</h1>
</div>
</br>
<!-- Example row of columns -->
<div class="row">
	"""),_display_(Seq[Any](/*28.3*/for(blog <- blogs) yield /*28.21*/ {_display_(Seq[Any](format.raw/*28.23*/("""
	<div class="jumbotron">
		<h2 class="row">"""),_display_(Seq[Any](/*30.20*/blog/*30.24*/.header)),format.raw/*30.31*/("""</h2>
		<p style="font-size: 22px">"""),_display_(Seq[Any](/*31.31*/blog/*31.35*/.text)),format.raw/*31.40*/("""</p>
	</div>
	""")))})),format.raw/*33.3*/("""
</div>
""")))})),format.raw/*35.2*/("""

"""))}
    }
    
    def render(blogs:List[Blog],log:Form[Application.logInCredentials]): play.api.templates.HtmlFormat.Appendable = apply(blogs,log)
    
    def f:((List[Blog],Form[Application.logInCredentials]) => play.api.templates.HtmlFormat.Appendable) = (blogs,log) => apply(blogs,log)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jul 06 19:29:25 IST 2014
                    SOURCE: /home/dhiresh/blog/app/views/index.scala.html
                    HASH: 73847b32ce5fb86ab7cfc3a0283d4758efef0587
                    MATRIX: 813->1|984->62|1013->82|1049->84|1070->97|1109->99|1275->230|1289->236|1328->254|1912->803|1946->821|1986->823|2067->868|2080->872|2109->879|2181->915|2194->919|2221->924|2267->939|2307->948
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|56->28|56->28|56->28|58->30|58->30|58->30|59->31|59->31|59->31|61->33|63->35
                    -- GENERATED --
                */
            