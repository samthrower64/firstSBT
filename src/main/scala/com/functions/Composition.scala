package com.functions

object Composition {
  def main(args: Array[String]): Unit = {
    val result=multiplyBy2(add(2))
    println(result)
    val result2 =multiplyBy2(subtract(2))
    println(result2)
    val result3 = add(com.functions.HighOrder.multiplyBy2(2)) //here we are referencing a function from another class
    println(result3)
  }
  def add(a:Int):Int={
    a+2
  }
  def multiplyBy2(a:Int):Int={
    a*2
  }
  def subtract(a:Int):Int={
    a-2
  }
  def findRemainder(a:Int):Int={
    a%2
  }
}
