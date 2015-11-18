package models

import play.api.libs.json.Json

case class Label(id:String, name: String, color: String) {
}

object Label{
  implicit val jf = Json.format[Label]
}
