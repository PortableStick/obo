package com.github.dunmatt.obo.core

import com.github.dunmatt.obo.core.serial.SerialPortFactory
import java.util.UUID
import org.slf4j.LoggerFactory
import scala.concurrent.Future

trait Component {
  val log = new OboLogger(LoggerFactory.getLogger(getClass))
  final val instanceId = UUID.randomUUID
  final val shortId = instanceId.getLeastSignificantBits.toInt
  var connectionFactory: ConnectionFactory = null  // this is populated by the runner
  var serialPortFactory: SerialPortFactory = null  // this is populated by the runner

  def onHalt: Unit = Unit

  def handleMessage(m: Message[_]): Option[Message[_]]

  def name: String = getClass.getName  // TODO: consider changing this to only the classname and final namespace chunk

  def onStart: Unit = Unit
}
