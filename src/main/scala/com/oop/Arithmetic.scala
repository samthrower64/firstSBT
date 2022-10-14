package com.oop

class Arithmetic {
  def magic(a:Int,b:Int) : Unit = {
    var magic = a+b - ((a+b)*a)
    println(s"first number was $a and second was $b")
    println(s"abracadabra, i've turned your numbers into a negative integer: $magic")
  }
}
object MainObjekt extends App {
  new Arithmetic().magic(501,204)
}