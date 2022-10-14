package com.operators

object OperatorsPractice extends App{

  var a =40
  var b =10
  var c=true
  var d=false
  var result=0
  //var e = 4
  //var f = 2

  //Arithmetic operator a+b
  println("Addition: "+(a+b))
  println("Subtraction: "+(a-b))

  //relation operator
  if (a == b) {
    println("Values are the same ")
  }
  else {
    println("Values are not the same ")
  }
  //Logical operator
  println("Logical or of a OR b is "+ (c||d))
  //Bitwise AND operator
  result = a&b
  println("Bitwise and: " + result)
  //assignment operator
  println("Addition assignment operator :" + (a+=b))

  /*
  double && used for programs, single & used for bitwise operations
  && only works on boolean


  if (true && false) {
    println("value")
  }
*/
  }

