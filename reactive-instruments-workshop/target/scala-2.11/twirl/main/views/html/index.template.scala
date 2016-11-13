
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Reactive Instruments Workshop</title>
		<link rel="stylesheet" media="screen" href=""""),_display_(/*7.48*/routes/*7.54*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.95*/(""""/>
		<style>
			html """),format.raw/*9.9*/("""{"""),format.raw/*9.10*/("""
				"""),format.raw/*10.5*/("""background: url("""),_display_(/*10.22*/routes/*10.28*/.Assets.versioned("images/mountain.jpg")),format.raw/*10.68*/(""") no-repeat center center fixed;
				-webkit-background-size: cover;
				-moz-background-size: cover;
				-o-background-size: cover;
				background-size: cover;
			"""),format.raw/*15.4*/("""}"""),format.raw/*15.5*/("""
		"""),format.raw/*16.3*/("""</style>
	</head>
	<body>
		<div id="welcome-wrap">
			Welcome, """),_display_(/*20.14*/name),format.raw/*20.18*/(""", to the Reactive Instruments Workshop
		</div>
	</body>
</html>"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Nov 13 23:08:17 NZDT 2016
                  SOURCE: /Users/azizahmed.khan/reactive-instruments-workshop/app/views/index.scala.html
                  HASH: 7cf5d974bf086597705ecc056cb66e4c78db594c
                  MATRIX: 527->1|636->15|664->17|825->152|839->158|900->199|948->221|976->222|1008->227|1052->244|1067->250|1128->290|1319->454|1347->455|1377->458|1469->523|1494->527
                  LINES: 20->1|25->1|27->3|31->7|31->7|31->7|33->9|33->9|34->10|34->10|34->10|34->10|39->15|39->15|40->16|44->20|44->20
                  -- GENERATED --
              */
          