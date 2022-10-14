package com.method

class maths {
  def add(a: Int, b: Double): Unit = {
    var sum = (a + b) * (a + b)
    println(sum)
  }

  def add(a: Double, b: Int) = {
    var sum = (a + b) * a * b
    println(sum)
  }
}
object MainTemp extends App {
  var a = new maths()
  a.add(5,5.3)
  a.add(5.1,1)
}

/*
dependent on the parameters in the object MainTemp, the relative method "add"
will be used (we can see there are two of the same method, but the correct
one gets used based on the parameters that get matched

method overloading definition:
This means that they may differ in the number of parameters,
data types, or both. This makes for optimized code.
 */