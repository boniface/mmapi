package domain.users

import java.time.LocalDateTime

import play.api.libs.json.Json

case class UserImages(org: String,
                      emailId: String,
                      id: String,
                      url: String,
                      description: String,
                      mime: String,
                      size: Option[String],
                      date: LocalDateTime)

object UserImages {
  implicit val companyImagesFmt = Json.format[UserImages]
  def identity: UserImages = UserImages("", "", "", "", "", "", None, LocalDateTime.now())
}
