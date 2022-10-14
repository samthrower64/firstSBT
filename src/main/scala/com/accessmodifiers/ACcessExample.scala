package com.accessmodifiers

class Access {
  private var a:Int=10
  def show(): Unit = {
    println(a)
  }
  def set(a1:Int):Unit = {
    a=a1
  }
}
object ACcessExample extends App {
  var p = new Access
  p.set(98)
  p.show()

}