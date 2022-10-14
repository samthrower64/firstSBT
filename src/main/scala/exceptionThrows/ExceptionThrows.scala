package exceptionThrows

class ExceptionThrows {
  @throws(classOf[NumberFormatException])
  def validate(): Int = {
    "abc".toInt
  }
}
object ExceptionExampleTest extends App {
  var a = new ExceptionThrows()
  try {
    a.validate()

  }
  catch {
    case ex:NumberFormatException=> println("Number cannot be formatted")
  }
  println("All good!")
}
