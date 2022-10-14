package com.abstracts

abstract class  Bikes(a:Int) {
  var b:Int=20
  var c:Int=25
  var d:Double=3.5
  def run()
  def performance(): Unit = {
    println("good performance")
  }

}
class tesla(a:Int) extends Bikes(a) {
  c = 30
  override def run(): Unit = {
    println("motor good")
    println(a,b,c+" + "+d)
  }
}
object abstractClassDetail extends App {
  var h = new tesla(10)
  h.run()
  h.performance()
}