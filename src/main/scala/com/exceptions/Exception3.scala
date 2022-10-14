package com.exceptions

object NewExc extends App {
  new Exception3().divide(200,2)
}
class Exception3 {
  def divide(a:Int,b:Int) : Unit = {
  try {
    a/b
    var arr=Array(1,2)
    arr(10)
  }
  catch {
    case e:ArithmeticException=> println(e)
    case ex:Throwable=> println(s"Can't find this index due to: $ex")
  }
  }
}
