package com.tutorials

object TernaryOperators {
  def main(args:Array[String]): Unit={
    val result=check(-10) //check function
    println(result)
  }
  def check(a:Int): Int =if(a>=0) 1 else -1
  //replaced by this after compilation, this function goes above
  //if value above (-10) known as a is >= 0, return 1 else return -1 (as is done)
}
