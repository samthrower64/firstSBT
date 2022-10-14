package com.assignmentsThur610

object Activity2 extends App {
  def isPrime(x: Int) : Boolean = {
    if (x <= 1) return false
    for(i <- 2 until x) {
      if (x%i == 0) return false
    }
    true
  }
  print("Enter a number:" )
  val number = scala.io.StdIn.readInt()
  if(isPrime(number)) println("Your number is prime") else (println("Your number isn't prime!"))
}

/*write a scala program to accept the input from the user and check if the input is
a prime number or not
 */