package com.abstracts

abstract class Bike {
  def run()
}
class BMW extends Bike {
  override def run(): Unit = {
  println("All good")
}
}
object abstractClass extends App {
  var h = new BMW
  h.run()
}
/*
abstract class def:
cannot support multiple inheritances.
A class can extend only one abstract class. The abstract methods of
abstract class are those methods which do not contain any implementation
 */