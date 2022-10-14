package com.oop

class CompanionClass {
  def hello(): Unit = {
    println("This is your companion")
  }
}

object CompanionObject extends App {
  new CompanionClass().hello()
  print("Companion Object")


}
/* an object that is declared in the same file as the class
this makes the code more readable
 */