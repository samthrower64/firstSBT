package com.assignmentsFri710

import Console.{BOLD,UNDERLINED,RESET}

object Task1 extends App{
  println(s"What is your ${BOLD}name? ")
  var name: String = scala.io.StdIn.readLine()
  println(s"What is your ${BOLD}age? ")
  var age: Int = scala.io.StdIn.readInt()

  println(s"${BOLD}Name: ${UNDERLINED}$name${RESET}")
  println(s"${BOLD}Age: $age${RESET}")
}
