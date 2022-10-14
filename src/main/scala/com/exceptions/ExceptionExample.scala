package com.exceptions

class ExceptionExample {
  def divide(a:Int,b:Int): Unit = {
    try {
    a/b       //exception occurs here when you try to make b=0
    }
    catch {
      case e:ArithmeticException=> println("Oh no! You can't divide by 0")
    }
    println("Don't do that again")
  }

}
object ExceptionExample extends App {
  new ExceptionExample().divide(200,0)

}

/*exceptions handle, errors cause memory collapse, can't do anything else.
you then have:
checked and unchecked exceptions
basically if they're handled at runtime or if they're only handled
when the program finishes
 */