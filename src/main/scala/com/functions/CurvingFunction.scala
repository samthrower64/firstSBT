package com.functions

object CurvingFunction extends App{
  val result=add(10)(10)
  println(result)
  val addlt=add(10)_
  val result2=addlt(3)
  println(result2)

  def add(a:Int)(b:Int):Int ={
    a+b
  }
}
