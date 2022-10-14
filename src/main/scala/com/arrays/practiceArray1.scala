package com.arrays

class practiceArray1 {
  var a:Array[Int]= Array(1,2,3,4,5,6,7)
  var a2:Array[String]=new Array[String](4)
  var a3 = Array(0,2,4,6,8,10) //already understands the data type
    def show(): Unit = {
      for (i<-a) {
        println(i)
      }
      a.foreach(println)
   println("Third element is: "+a(2))
    }
  def combineAndSort(): Unit = {
    a = a++a3
    a = a.sorted
    a.foreach(println)
  }
  def arrayString(): Unit = {
    //for (i=0 to a2.length) {
    //  a2() = "Sam"
    }
    a2.foreach(println)
    //}
}
object mainArray extends App {
  var b = new practiceArray1()
  b.show()
  b.combineAndSort()
  b.arrayString()
}
// INDEX IS SHOWN IN () NOT []!
// ++ is concatenation