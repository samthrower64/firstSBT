package com.assignmentsMon1010

class IntArrayRemoveDuplicates {
  var nums: Array[Int] = Array(7,2,4,4,2,9,8,7,2,3)

  var k: Int = removeDuplicates(nums)

  def removeDuplicates(in: Array[Int]): Int = {
    var n: Array[Int] = new Array[Int](in.length)
    var c: Int = 0
    var nilCheck: Boolean = false

    println(n.mkString(", "))

    for(a <- in){
      if(a==0 && !nilCheck){
        n(c) = a
        nilCheck = true
        c += 1
      }
      if(n.contains(a)){
      }else{
        n(c) = a
        c += 1
      }
    }

    println(n.mkString(", "))
    return n.length
  }
}

object ThisTask1 extends App{
  new IntArrayRemoveDuplicates
}