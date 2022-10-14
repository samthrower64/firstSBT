package com.functions

object CallFromOther extends App {

  def functionExample(a:Int,f:Int=>AnyVal):Unit ={
    println(f(a))     //passing the function in as a parameter, taking the argument
    //for the second function (below) then calling it
  }
  def multiplyBy2(a:Int):Int={
    a*2
  }
}
