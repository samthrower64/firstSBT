package com.checking

class StringExample {
  var a = "String Example"
  var b = "Hi Scala!"
  var c = "Hi Scala!"

  var d = "Hi Scala!"
  var e = "Hi" + " Scala!"

  def show(): Unit = {
    println(a.equals(b))
    println(b.equals(c))
      //checking if one string is equal to another
    println(d.equals(e))
  }
}
object Returns extends App {
  new StringExample().show()
}
