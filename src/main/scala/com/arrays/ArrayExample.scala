package com.arrays

class ArrayExample {
  var a1 = Array(Array(1,2,3),Array(4,5,6))
  var a2 = Array(Array(3,2,1),Array(6,5,4))
  var a3 = Array.ofDim[Int](2,3)
  def addAndShow(): Unit = {
    for(i<-0 to 1) {
      for(j<-0 to  2) {
        a3(i)(j)=a1(i)(j)+a2(i)(j)
        print(" " + a3(i)(j))
      }
      println()
    }
  }
}

object ArrayExample extends App{
new ArrayExample().addAndShow()
}
