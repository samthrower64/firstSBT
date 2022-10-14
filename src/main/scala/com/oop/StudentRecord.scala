package com.oop

class StudentRecord (id:Int,name:String) {

  def getRecord(): Unit = {
    println("id: " + id + " is Student " + name)
  }
}   //HERE

  object MainObject1 extends App{
    println("What is your id?")
    var id: Int = scala.io.StdIn.readInt()
    println("What is your name?")

    var name: String = scala.io.StdIn.readLine()
    var student1 = new StudentRecord(MainObject1.id, MainObject1.name)
    student1.getRecord()
  }

// if you put the } from HERE (above) down here, the program will not run
// this is due to encapsulation errors!
// the object class is the main entry point for the program, if it is encapsulated
// within the class, it wont be seen and the program wont have anywhere to run
// from!