package models

import org.pegdown.PegDownProcessor
import play.api.libs.json.Json

case class Card(id:String, name: String, desc: String, labels: Option[List[Label]]) {
  val pg = new PegDownProcessor()
  val htmlDesc = pg.markdownToHtml(desc)

}

object Card{
  implicit val jf = Json.format[Card]
}
