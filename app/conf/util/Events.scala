package conf.util

import javax.inject.Singleton

/**
  * Created by hashcode on 6/6/17.
  */
@Singleton
object Events {
  def VALIDATED = "VALIDATED"
  def LOGGEDIN = "LOGGEDIN"
  def LOGGEOUT = "LOGGEDOUT"
  def TOKENCREATED = "TOKEN_CREATED"
  def TOKENFAILED = "TOKEN_FAILED"
  def TOKENSUCCESSMESSAGE="Token Successfully Created "
  def TOKENFAILMESSAGE="Token  Creation Failed "
  def TOKENVALID = "TOKEN_VALID"
  def TOKENINVALID = "TOKEN_INVALID"


}
