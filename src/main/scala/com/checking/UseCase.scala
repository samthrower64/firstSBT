package com.checking

class UseCase {
  var b1 = "Samuel Thrower"
  var b2 = "University of Leicester"
  var b3 = "Bank of America"
  var a1 = "Samuel Thrower"

  def show(): Unit = {
    var x = (a1.equals(b1))
    var y = (b1.equals(b2))
    if (x == true) {
      println(s"$a1 and $b1 are the same String")
      if (y == false) {
        println(s"$b1 and $b2 are not the same String")
      }
    }
    else if (x == false) {
      println(s"'$a1' and $b1' are not the same String")
      if (y == true) {
        println(s"'$b1' and '$b2' are the same String")
      }
    }
  }
  def show2(): Unit = {
    var b3a = b3.substring(0,4)
    var b3b = b3.substring(5,7)
    var b3c = b3.substring(8,b3.length)
    println(s"$b3a\n$b3b\n$b3c.")
    var d = b3a.concat(b3b.concat(b3c))
    println(d)
  }
}
object Returner1 extends App {
  new UseCase().show()
  new UseCase().show2()
}