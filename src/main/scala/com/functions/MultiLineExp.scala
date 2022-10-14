package com.functions

object MultiLineExp extends App{
  println(add1(10,20))
  def add1(i: Int, i1: Int): Int={
    i+
    i1
  }
//compiler allows this
  //known as a multi line expression
  //i
  //+i1   <- + is ignored, so is "i" above, only i1's value is returned
}
