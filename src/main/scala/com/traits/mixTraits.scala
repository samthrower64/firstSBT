package com.traits

trait Print {
  def print()
}
abstract class PrintA4{
  def printA4()
}
class A6 extends PrintA4 with Print {
  override def print(): Unit = {
    println("Print Sheet of A6")
  }
  override def printA4(): Unit = {
    println("Print Sheet of A4")
  }
}
object mixTraits extends App{
  var a = new A6
  a.print()
}
