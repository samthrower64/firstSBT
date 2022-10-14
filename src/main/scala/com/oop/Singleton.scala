package com.oop

object Singleton {
  def main(args: Array[String]): Unit = {
    SingletonObject.hello()
    SingletonObject.hello()
    SingletonObject.hello()
    SingletonObject.hello()
  }
}
object SingletonObject {
  var a = 5   // this variable is only initialised once
  def hello(): Unit = {
    println("Hello")
    a=(a*a)
    println(a)
  }
}
/* very important concept
used for running in parallel alongside a big program
e.g. checking users online at one time for a website

google def:
A singleton is a class that allows only a single
instance of itself to be created and gives access to that created instance.

It contains static variables that can accommodate unique and private
instances of itself. It is used in scenarios when a user wants to
restrict instantiation of a class to only one object.

USED TO DEFINE A GLOBAL VARIABLE
*/