package com.tutorials

import java.lang.Package

object ForEachElemInList extends App {
  var result = for( a<-1 to 10 ) yield a
  for (i<- result) {
    println(i)
  }
  //creates a vector of 10 elements (numbers 1 to 10)
  println("------------------------")
  var list = List("Dave","John","Phil")
  for(i <- list) {
    println(i)
  }
  println("------------------------")
  //above iterating through a list of strings
  //below iterating through a list of integers
  var list2 = List(420,69,300,9000)
  for (i <- list2) {
    println(i)
  }
  println("------------------------")
  list.foreach {
    println // Print each element
  }
  println("------------------------")
  //prints in increments of two
  for (i<-0 to 15 by 2){
    println(i)
  }
  println("------------------------")
}

