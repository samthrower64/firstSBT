package com.oop

object Class2 extends App {
  var s = new Student1(id = 199017649, name = "Sam Thrower", age = 21)
  s.show()
}

class Student1(id:Int, name:String, age:Int) {
  def show(): Unit = {
    println(s"$id->$name->$age")
  }
}

//here is a parameterised class, ignore filename warning at the start
