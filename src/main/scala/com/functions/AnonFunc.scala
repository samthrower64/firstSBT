package com.functions

object AnonFunc extends App {
  var result1=(a:Int,b:Int)=>a+b
  println(result1(5,10))      //variable as a function

  var result2=(_:Double)+(_:Int)
  println(result2(20.25,20))

    val c:Char='a'
    val d:Int=5
}
