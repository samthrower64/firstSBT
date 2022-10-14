package com.assignments

object Task6 extends App {
  println("Please enter your string to be reversed: ")
  var s: String = scala.io.StdIn.readLine()

  def reverse(s: String): Unit = {
    val a : String = (for (i <- s.length - 1 to 0 by -1) yield s(i)).mkString
    println(a)
  }: Unit

  reverse(s)

}
