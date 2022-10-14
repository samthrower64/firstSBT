package com.labs

object StringCount {
  def test(str1: String): Boolean = {
    val count_char = str1.count { n => n == 'z' }
    count_char >= 2 && count_char <= 4
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("gazza"))
    println("Result: " + test("Zane"))
    println("Result: " + test("business"))
    println("Result: " + test("False"))
  }
}

