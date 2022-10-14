package com.arrays

object multiDimArray3 extends App {
  var a = new MultiArrayClass
  a.show()
}
  class MultiArrayClass {
    val a: Array[Array[Int]] = Array(Array(6, 3, 8, 2, 15),
      Array(2, 4, 6, 8, 1),Array(21,5,7,2,1),Array(5,8,2,11,4))


    def show() {
      for (i <- 0 until 4) {
        for (j <- 0 until a(1).length) {
          // Accessing the values
          print(" " + a(i)(j))
        }
        println()
      }
      println(a(0).length)
      println(a(1).length)
      //only prints the end of the list
    }
  }
/*
var arr=Array.ofDim[Int](3,5)
sets an empty array of 3x5
values can then be assigned to each individual cell by
arr(0)(1) =  45
will set the first column, second row to 45

ArrName ++= Array(Array(5,6))
 */
