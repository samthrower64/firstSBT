package com.tutorials

object NewRepo {
  def main(args: Array[String]): Unit = {
    var greet: String = "Hello"
    println(greet.length())
    //5
    println(greet.concat("Scala"))
    //Hello Scala
    println(greet.charAt(1))
    //e
    println(greet.toUpperCase())
    //HELLO
  }
}
