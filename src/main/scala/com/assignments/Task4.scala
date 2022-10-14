package com.assignments

object Task4 extends App{

  println("Please enter your 1st string: ")
  var first = scala.io.StdIn.readLine()
  println("Please enter your 2nd string: ")
  var second = scala.io.StdIn.readLine()
  var concatenated = first.concat(second)
  println(concatenated)

}
