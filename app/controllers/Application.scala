package controllers

import play.api._
import play.api.mvc._

import com.squareup.okhttp.{OkHttpClient, Request}
import play.api.libs.json.{JsSuccess, JsError, Json}

import models._

class Application extends Controller {

  def index = Action {

    val url = "https://api.trello.com/1/boards/ab4OdKy0/lists?cards=open&card_fields=name,desc,labels&fields=name"

    val data = Json.parse(getRequest(url)).validate[List[Submission]]

    data map { parsedJson =>

      Ok(views.html.index(parsedJson))

    } getOrElse InternalServerError("Fail")
  }

  val client = new OkHttpClient()

  def getRequest(url: String) = {
    val request = new Request.Builder()
      .url(url)
      .build()


    val response = client.newCall(request).execute()
    response.body().string()
  }

}


