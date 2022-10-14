package com.assignmentsThur610

object Activity1 extends App {
  while (true) {
    println("Please enter your number: \n")
    var num: Int = scala.io.StdIn.readInt()

    if (num > 0) {
      println("Your number is positive\n")
    }
    else if (num < 0) {
      println("Your number is negative\n")
    }
    else if (num == 0) {
      println("Your number is neither positive or negative\n")
    }
    else {
      System.err.println("I don't think that's a number!\n")
    }
  }
}
/*
write a scala program to get a number from the user and print
whether it is positive or negative
 */

