
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

"""),_display_(Seq[Any](/*9.2*/form(action = routes.Application.adding, args =  'id -> "variable")/*9.69*/ {_display_(Seq[Any](format.raw/*9.71*/("""

		"""),_display_(Seq[Any](/*11.4*/inputText(
			field = variable("Text")
		))),format.raw/*13.4*/("""
		
		<p class="button btn-default"><input type="submit"></p>

	""")))})),format.raw/*17.3*/("""

""")))})),format.raw/*19.2*/("""
"""))}
    }
    
    def render(variable:Form[Application.Adder]): play.api.templates.HtmlFormat.Appendable = apply(variable)
    
    def f:((Form[Application.Adder]) => play.api.templates.HtmlFormat.Appendable) = (variable) => apply(variable)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 05 21:23:39 IST 2014
                    SOURCE: /home/dhiresh/blog/app/views/add.scala.html
                    HASH: 880f288337e36bff0779b57a169c737a167d1837
                    MATRIX: 789->1|934->36|962->55|998->57|1021->72|1059->73|1122->102|1197->169|1236->171|1276->176|1339->218|1435->283|1469->286
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|39->11|41->13|45->17|47->19
                    -- GENERATED --
                */
            