package com.functions

object CurvingFunction2 extends App{
  val result=cube(10)
  println(result)
  val addlt=cube(_)
  val result2=addlt(3)
  println(result2)

  def cube(a:Int):Int ={
    a*a*a
  }
  //here is my own version of the function that cubes any number given
  //not sure if this is what is wanted, but it follows similar rules
  //to the original function
}
