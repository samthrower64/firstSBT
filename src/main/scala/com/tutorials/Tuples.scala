package com.tutorials

object Tuples {
  //def add(x:Int, y:Int) = x + y;
  def main(args: Array[String]): Unit = {
    val tuple:(String, Int)=("Sam", 21)
    val stillAtuple= "Sam" -> 342001
    val tuple4:(String,Int,String)=("Sam",21,"Male")

    //Type in Scala is defined using a colon//

    println(tuple)
    println(stillAtuple)
    println(tuple4)

    val name = tuple._1     //._x makes the new val (name/name2) set to the
    val name2 = tuple4._3   //index of x within the referenced tuple
    println(name)           //here it is "tuple" and also "tuple4"
    println(name2)

    val (myName,myDateOfBirth)=stillAtuple
    println("I am born on " + myDateOfBirth + " and my name is " + myName)
    //referencing new values from already existing ones further up
  }
}