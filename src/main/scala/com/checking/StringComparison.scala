package com.checking

object CompareString extends App {
  new StringComparison().show()
}
class StringComparison {
  var string1 = "Scala Hello"
  var string2 = "Hello Scala"
  var string3 = "Hello Scala"
  def show(): Unit = {
    val b:Int = string1.compareTo(string2)
    println(b)
    //look at compareTo function syntax to understand further
    val c: Int = string2.compareTo(string3)
    println(c)

    println(string1.substring(0,5))
    println(string1.substring(0,(string1.length/2)))
  }
}
//unicode character of whitespace U+0020
//unicode character of H U+0048
/*
11,0 returned normally, whitespace at beginning of string 2 returns
51,-40
if first string is shorter than second, negative number
if first string is longer than second, positive number
if they're the same, 0
 */