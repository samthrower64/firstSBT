package com.traits

trait Printable {
  def Print()
}
class A4 extends Printable {
  override def Print(): Unit = {
    println("Size = A4")
  }
}
object traits extends App{

  var a:Printable = new A4()
  a.Print()

}
