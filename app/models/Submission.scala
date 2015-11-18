package models

import play.api.libs.json.Json

case class Submission(id:String, name: String, cards: List[Card])

object Submission{
  implicit val jf = Json.format[Submission]
}