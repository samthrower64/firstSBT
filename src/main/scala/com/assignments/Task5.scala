package com.assignments

object Task5 extends App {
  println("Please enter your string: ")
  var string:String = scala.io.StdIn.readLine()
  println("What character do you want to search for? ")
  var char:Char = scala.io.StdIn.readChar()
  var occur : Int = string.count(_==char)
  println(s"The character $char appears $occur times in your string")

}
