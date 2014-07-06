
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

<input class="textarea1" type="text2" role="textbox" contenteditable="true" data-role="editable" name="text"></p>

<p class="button btn-default"><input type="submit"></p>
</form>

<!--
"""),_display_(Seq[Any](/*18.2*/form(action = routes.Application.adding, args =  'id -> "variable")/*18.69*/ {_display_(Seq[Any](format.raw/*18.71*/("""

		"""),_display_(Seq[Any](/*20.4*/inputText(
			field = variable("Text")
		))),format.raw/*22.4*/("""
		
		<p class="button btn-default"><input type="submit"></p>

	""")))})),format.raw/*26.3*/("""

!-->

""")))})),format.raw/*30.2*/("""



"""))}
    }
    
    def render(variable:Form[Application.Adder]): play.api.templates.HtmlFormat.Appendable = apply(variable)
    
    def f:((Form[Application.Adder]) => play.api.templates.HtmlFormat.Appendable) = (variable) => apply(variable)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jul 06 19:11:50 IST 2014
                    SOURCE: /home/dhiresh/blog/app/views/add.scala.html
                    HASH: c623c118973e40fb2e35e735cba58788666d0e4b
                    MATRIX: 789->1|934->36|962->55|998->57|1021->72|1059->73|1171->149|1186->155|1227->174|1452->364|1528->431|1568->433|1608->438|1671->480|1767->545|1807->554
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|38->10|38->10|38->10|46->18|46->18|46->18|48->20|50->22|54->26|58->30
                    -- GENERATED --
                */
            