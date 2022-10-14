package com.assignmentsMon1010

class Task2 {
  def nextPermutation(num: Array[Int]): Unit = {
    var a: Int = num.length-2
    while (a >= 0 & num(a+1) <= num(a)) {
      a-=1
    }
    if (a >= 0) {
      var b: Int = num.length-1
      while (num(b) <= num(a)) {
        b-=1
      }
      swap(num, a, b)
    }
    a += 1
    reverse(num, a)
    num.foreach(println)
  }
  def reverse(num: Array[Int],start:Int): Unit = {
    var a = start
    var b = (num.length-1)
    while (a < b) {
      swap(num, a , b)
      a += 1
      b += 1
    }
    //maybe change c and d to a and b
  }
  def swap(num: Array[Int], i:Int, j:Int): Any = {
    var temp = num(i)
    num(i) = num(j)
    num(j) = temp
  }
}
object Testing extends App {
  var arr : Array[Int] = Array(1,1,4,5)
  new Task2().nextPermutation(arr)
}
