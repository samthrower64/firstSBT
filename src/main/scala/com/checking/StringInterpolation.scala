package com.checking

class StringInterpolation {
  var s1 = "Scala String"
  var version = 2.13
  def show(): Unit = {
    println(f"var s1 = '$s1%s' using scala version $version%2.2f")
  }
}
object Returner extends App {
  new StringInterpolation().show()
}