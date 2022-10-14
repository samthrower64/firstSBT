package com.assignmentsMon1010

class Inheriting {
    var first_Name: String = ""
    var second_Name: String = ""
    var age: Int = 0

    def this(first_Name: String) {
      this()
      this.first_Name = first_Name
    }

    def this(first_Name: String, second_Name: String) {
      this()
      this.first_Name = first_Name
      this.second_Name = second_Name
    }

    def this(first_Name: String, second_Name: String, age: Int) {
      this()
      this.first_Name = first_Name
      this.second_Name = second_Name
      this.age = age
    }

    def show(): Unit = {
      println(first_Name + ", " + second_Name + ", " + age)
    }
  }

  object testingblock extends App {
    var obj1 = new Inheriting("Samuel", "Thrower", 21)
    obj1.show()

}
