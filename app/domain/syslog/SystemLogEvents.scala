package domain.syslog

import java.time.LocalDateTime

import play.api.libs.json.Json

/**
  * Created by hashcode on 2016/08/12.
  */
case class SystemLogEvents(siteId: String,
                           id: String,
                           eventName: String,
                           eventType: String,
                           message: String,
                           date: LocalDateTime)

object SystemLogEvents {
  implicit val syseventLog = Json.format[SystemLogEvents]

  def identity:SystemLogEvents = SystemLogEvents("","","","","",LocalDateTime.now)
}
