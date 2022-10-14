package com.assignments

object Task3 extends App{

  println("What is your first name? ")
  var fname: String = scala.io.StdIn.readLine()
  println("What is your surname ")
  var sname: String = scala.io.StdIn.readLine()
  println("What is your favourite movie of all time? ")
  var movie: String = scala.io.StdIn.readLine()

  println(s"First Name: $fname\nSurname: $sname\nFavourite Movie: $movie")
}
