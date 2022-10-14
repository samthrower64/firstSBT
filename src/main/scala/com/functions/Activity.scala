package com.functions

object Activity {
  def test(x:Int) : Boolean  =
  {
    Math.abs(100 - x) <= 20 || Math.abs(300 - x) <= 20
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(81))
    println("Result: " + test(80))
    println("Result: " + test(79))
    println("Result: " + test(121))
    println("Result: " + test(280))
    println("Result: " + test(320))
    println("Result: " + test(330))
    println("Result: " + test(279))
  }
}
