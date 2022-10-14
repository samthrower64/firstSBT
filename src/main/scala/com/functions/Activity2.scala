package com.functions

object Activity2 extends App{
  val nameAndAge = Seq( "James", 7,
    "Andy", 8,
    "Tommy", 10,
    "Bob", 13,
    "Sam", 10 )
  val ageSeq = nameAndAge.collect {
    case age: Int => age
  }
  println(s"Combined sequence of names to ages = ${nameAndAge.mkString(",")}")
  println(s"Sum of ages = ${ageSeq.sum}")
}
