package domain.security

import play.api.libs.json.Json

/**
  * Created by hashcode on 2017/03/04.
  */
case class Credential(email:String, password:String)

object Credential {

  implicit val credentialFmt = Json.format[Credential]
  def identity:Credential = Credential("","")

}
