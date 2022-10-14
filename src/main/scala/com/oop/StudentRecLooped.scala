package com.oop

class StudentRecLooped (id:Int,name:String){

  def getRecord(): Unit = {
    println("id: " + id + " is Student " + name)
  }
}

object MainObject extends App{
  var count = 0

  while (count < 5 ) {
    var x = scala.io.StdIn.readInt()
    var y = scala.io.StdIn.readLine()
    var student = new StudentRecord(x,y)
    student.getRecord()
    count += 1
  }
}
