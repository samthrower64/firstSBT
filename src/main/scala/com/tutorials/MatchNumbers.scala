package com.tutorials

case object MatchNumbers extends App{
  println("Type Your Number: ")
  var a: Int = scala.io.StdIn.readInt
  a = a%2
  //find remainder of users input divided by two, set as new variable
  a match {
    case 0=>println(s"Your number is divisible by 2, giving remainder $a")
    case 1=>println(s"Your number is not divisible by 2, giving remainder $a")
    case 2=>println(s"Your number is not divisible by 2, giving remainder $a")
    case 3=>println(s"Your number is not divisible by 2, giving remainder $a")
  }
}

