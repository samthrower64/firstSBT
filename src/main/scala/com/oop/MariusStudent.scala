package com.oop

import scala.io.StdIn.{readInt, readLine}
class MariusStudent(id:Int, name:String) {
  def show(): Unit = {
    println(s"$id --> $name")
  }
}

object execSecondStudent extends App{
  print("How many students: ")
  var num = readInt()
  var students = List[MariusStudent]()

  for (x <- 1 to num) {
    print("Enter student name: ")
    val name = readLine()
    students = students :+ new MariusStudent(x, name)
  }

  showStudents()

  def showStudents(): Unit = {
    for (student <- students) {
      student.show()
    }
  }
}
//marius' example for oop, very good idea