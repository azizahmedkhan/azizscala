package controllers

import play.api.mvc.{Action, Controller}
import play.twirl.api.Html

/**
  * Created by azizahmed.khan on 14/11/16.
  */
object AzizController extends Controller {

  def hello = Action {
    Ok (Html("This is test for aziz "))

  }

}
