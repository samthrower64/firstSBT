package com.oop

class Student {
  var id:Int=199017649;
  var name:String="Samuel Thrower";
}
//needs lowercase o9
object ExecuteClass extends App {
  var s = new Student()
  println(s.id+" -> "+s.name)

}