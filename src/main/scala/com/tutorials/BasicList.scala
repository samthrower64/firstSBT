package com.tutorials

object BasicList extends App {
  var ListOfNumbers = List(1, 2, 3)
  BasicList.ListOfNumbers.foreach {
    println
  }
  ListOfNumbers.foreach(print)
  println
  ListOfNumbers.foreach((element: Int) => print(element + " "))
}
