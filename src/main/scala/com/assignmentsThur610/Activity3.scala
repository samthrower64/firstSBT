package com.assignmentsThur610

object Activity3 extends App {
  println("Please enter your number to be reversed: ")
  var s: String = scala.io.StdIn.readLine()

  def reverse(s: String): Unit = {
    val a: String = (for (i <- s.length - 1 to 0 by -1) yield s(i)).mkString
    val b = a.toInt
    println("Your number backwards is: " + b)
  }: Unit

  reverse(s)
}
