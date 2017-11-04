package domain.security

import play.api.libs.json.Json

/**
  * Created by hashcode on 2017/02/18.
  */
case class LogInStatus(status:String)

object LogInStatus{

  implicit val logInStatusFmt = Json.format[LogInStatus]
}
