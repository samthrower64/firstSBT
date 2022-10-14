package com.checking

class StringConcat {

  var a = "Hi, "
  var b = "How are you?"
  var c = " Good Bye"
  var d = a.concat(b)
  var e = d.concat(c)

  def show(): Unit = {
  println(d)
  println(e)
  }
}
object Concats extends App {
  new StringConcat().show()
}
