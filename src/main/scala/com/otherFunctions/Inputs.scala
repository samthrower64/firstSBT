package com.otherFunctions

object Inputs extends App {

  println("Type Your name: ")
  var a: String = scala.io.StdIn.readLine()

  println("Type Your Age: ")
  var b: Int = scala.io.StdIn.readInt()

  println("Is your name " + a + " who is " + b + " years old ?")
  println(s"Yes!, it is $a who is $b years old")

}

