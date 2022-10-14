package com.inheritance

class A {
  var worth=2995
  var seats=5

}
class B extends A {
  var manCost=1550
}
class C extends B{
  def show(): Unit = {
    println("Car1: "+worth+ " with "+seats+" seats, taking "+manCost+" to produce")
    println("Car2: is free with "+seats+" seats, taking "+manCost+" to produce")
  }
}
object MultiLevelInheritance extends App {

  var c = new C
  c.show()

}
/*
here we can see how inheritance works on more than one level
if you change class A to trait A, you can extend both A and B on C, using
"class C extends B with A"
 */