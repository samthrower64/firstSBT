package com.accessmodifiers

class Access2 {
  protected var a:Int=10    //can only be accessed if another class extends to this
}
class tempClass extends Access2{
  def display(): Unit = {
    println(a)
  }

}
object AccessExample2 {

}
