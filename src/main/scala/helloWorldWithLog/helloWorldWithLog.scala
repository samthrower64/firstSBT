package helloWorldWithLog
import com.typesafe.scalalogging.LazyLogging

object helloWorldWithLog extends App with LazyLogging{
  logger.error("Hello !")
  }
