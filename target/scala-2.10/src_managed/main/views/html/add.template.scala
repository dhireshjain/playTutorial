
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
object add extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Adder],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(variable: Form[Application.Adder]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Post It")/*5.17*/{_display_(Seq[Any](format.raw/*5.18*/("""

<h1>Add a blog post</h1>


<form class="col-lg-11" method="POST" action=""""),_display_(Seq[Any](/*10.48*/routes/*10.54*/.Application.adding)),format.raw/*10.73*/("""">
<textarea name="text" placeholder="Type something..." style="width: 100%;  min-height: 100px;">
</textarea><br/>
<input type="submit" value="Submit" />
</form>

<!--
"""),_display_(Seq[Any](/*17.2*/form(action = routes.Application.adding, args =  'id -> "variable")/*17.69*/ {_display_(Seq[Any](format.raw/*17.71*/("""

		"""),_display_(Seq[Any](/*19.4*/inputText(
			field = variable("Text")
		))),format.raw/*21.4*/("""
		
		<p class="button btn-default"><input type="submit"></p>

	""")))})),format.raw/*25.3*/("""

!-->

""")))})),format.raw/*29.2*/("""



"""))}
    }
    
    def render(variable:Form[Application.Adder]): play.api.templates.HtmlFormat.Appendable = apply(variable)
    
    def f:((Form[Application.Adder]) => play.api.templates.HtmlFormat.Appendable) = (variable) => apply(variable)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 08 20:18:47 IST 2014
                    SOURCE: /home/dhiresh/blog/app/views/add.scala.html
                    HASH: beb75d9e55452fddc5b75444caab85f5a3040521
                    MATRIX: 789->1|934->36|962->55|998->57|1021->72|1059->73|1171->149|1186->155|1227->174|1432->344|1508->411|1548->413|1588->418|1651->460|1747->525|1787->534
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|38->10|38->10|38->10|45->17|45->17|45->17|47->19|49->21|53->25|57->29
                    -- GENERATED --
                */
            