package com.exceptions

class ExceptionTest3 {
  def divide(a:Int,b:Int): Unit = {
    try {
      a/b
      var array = Array(1,2)
      array(15)
    }
    catch {
      case e:ArithmeticException=> println(e)
      case exp:Exception => print(exp)
      case th:Throwable=> println("Unknown" + th)
    }
    finally {
      println("Finally always gets executed")
    }
    println("Done, Turning OFF")
  }
}
object TestObject3 extends App{
  new ExceptionTest3().divide(100,10)
}
