
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object price_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class price extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Instrument Start Page</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*5.97*/(""""/>
    <style>
    html """),format.raw/*7.10*/("""{"""),format.raw/*7.11*/("""
    """),format.raw/*8.5*/("""background: url("""),_display_(/*8.22*/routes/*8.28*/.Assets.versioned("images/mountain.jpg")),format.raw/*8.68*/(""") no-repeat center center fixed;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
    """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""</style>
    <script language="JavaScript">
      var websocket;
      function init() """),format.raw/*17.23*/("""{"""),format.raw/*17.24*/("""
        """),format.raw/*18.9*/("""try """),format.raw/*18.13*/("""{"""),format.raw/*18.14*/("""
          """),format.raw/*19.11*/("""websocket = new WebSocket('ws://localhost:9000/prices');

          websocket.onopen = function(msg) """),format.raw/*21.44*/("""{"""),format.raw/*21.45*/("""
            """),format.raw/*22.13*/("""socketStatus.innerHTML = 'Connected to: ' + event.currentTarget.url;
            socketStatus.className = 'open';
          """),format.raw/*24.11*/("""}"""),format.raw/*24.12*/(""";

          websocket.onmessage = function(msg) """),format.raw/*26.47*/("""{"""),format.raw/*26.48*/("""
            """),format.raw/*27.13*/("""var message = event.data;
            messagesList.innerHTML += '<li class="received"><span>Received:</span>' + message + '</li>';
          """),format.raw/*29.11*/("""}"""),format.raw/*29.12*/(""";

          websocket.onclose = function(msg) """),format.raw/*31.45*/("""{"""),format.raw/*31.46*/("""
            """),format.raw/*32.13*/("""socketStatus.innerHTML = 'Disconnected - see error log for more information';
          """),format.raw/*33.11*/("""}"""),format.raw/*33.12*/(""";
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""catch(ex)"""),format.raw/*35.18*/("""{"""),format.raw/*35.19*/("""
          """),format.raw/*36.11*/("""console.log(ex);
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""

      """),format.raw/*39.7*/("""}"""),format.raw/*39.8*/("""
      """),format.raw/*40.7*/("""function quit()"""),format.raw/*40.22*/("""{"""),format.raw/*40.23*/("""
        """),format.raw/*41.9*/("""if (websocket != null) """),format.raw/*41.32*/("""{"""),format.raw/*41.33*/("""
          """),format.raw/*42.11*/("""console.log("Closing websocket");
          websocket.close();
          websocket=null;
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/("""
      """),format.raw/*46.7*/("""}"""),format.raw/*46.8*/("""
      """),format.raw/*47.7*/("""function reconnect() """),format.raw/*47.28*/("""{"""),format.raw/*47.29*/("""
        """),format.raw/*48.9*/("""quit();
        init();
      """),format.raw/*50.7*/("""}"""),format.raw/*50.8*/("""

      """),format.raw/*52.7*/("""function sendData() """),format.raw/*52.27*/("""{"""),format.raw/*52.28*/("""
          """),format.raw/*53.11*/("""messagesList.innerHTML = '';
          var instrumentId = document.getElementById("instrumentId").value;
          if (instrumentId != undefined && instrumentId.length > 0) """),format.raw/*55.69*/("""{"""),format.raw/*55.70*/("""
            """),format.raw/*56.13*/("""websocket.send('"""),format.raw/*56.29*/("""{"""),format.raw/*56.30*/(""" """),format.raw/*56.31*/(""""instrument": "' + instrumentId + '" """),format.raw/*56.68*/("""}"""),format.raw/*56.69*/("""');
          """),format.raw/*57.11*/("""}"""),format.raw/*57.12*/("""
      """),format.raw/*58.7*/("""}"""),format.raw/*58.8*/(""";
    </script>
  </head>

  <body onload="init()">
    <div id="price-wrap">
      <h4>Instrument Prices</h4>
      <div id="socketStatus"></div>
      <br>
      <p>
        Instrument:
        <input type="text" id="instrumentId"><input type="submit" value="Get Price" onclick="sendData()">
      </p>
      <div id="messagesList"></div>
    </div>
  </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object price extends price_Scope0.price
              /*
                  -- GENERATED --
                  DATE: Sun Nov 13 23:08:17 NZDT 2016
                  SOURCE: /Users/azizahmed.khan/reactive-instruments-workshop/app/views/price.scala.html
                  HASH: bdcfc56531c1b09682670ba85cfd3b3600770f35
                  MATRIX: 609->0|767->132|781->138|842->179|894->204|922->205|953->210|996->227|1010->233|1070->273|1262->438|1290->439|1322->444|1437->531|1466->532|1502->541|1534->545|1563->546|1602->557|1731->658|1760->659|1801->672|1953->796|1982->797|2059->846|2088->847|2129->860|2298->1001|2327->1002|2402->1049|2431->1050|2472->1063|2588->1151|2617->1152|2654->1162|2683->1163|2719->1172|2756->1181|2785->1182|2824->1193|2876->1218|2905->1219|2940->1227|2968->1228|3002->1235|3045->1250|3074->1251|3110->1260|3161->1283|3190->1284|3229->1295|3353->1392|3382->1393|3416->1400|3444->1401|3478->1408|3527->1429|3556->1430|3592->1439|3649->1469|3677->1470|3712->1478|3760->1498|3789->1499|3828->1510|4029->1683|4058->1684|4099->1697|4143->1713|4172->1714|4201->1715|4266->1752|4295->1753|4337->1767|4366->1768|4400->1775|4428->1776
                  LINES: 25->1|29->5|29->5|29->5|31->7|31->7|32->8|32->8|32->8|32->8|37->13|37->13|38->14|41->17|41->17|42->18|42->18|42->18|43->19|45->21|45->21|46->22|48->24|48->24|50->26|50->26|51->27|53->29|53->29|55->31|55->31|56->32|57->33|57->33|58->34|58->34|59->35|59->35|59->35|60->36|61->37|61->37|63->39|63->39|64->40|64->40|64->40|65->41|65->41|65->41|66->42|69->45|69->45|70->46|70->46|71->47|71->47|71->47|72->48|74->50|74->50|76->52|76->52|76->52|77->53|79->55|79->55|80->56|80->56|80->56|80->56|80->56|80->56|81->57|81->57|82->58|82->58
                  -- GENERATED --
              */
          