package com.overriding

class Employee {
  val wage:Double = 9.50
  val bonus:Int = 2
  def show(): Unit = {
    println(f"Assistant Managers at McDonalds earn £$wage%1.2f per hour, with a £$bonus bonus on bank holidays")
  }
}
class AssistantManager extends Employee {
  override val wage = 13.50
  override def show(): Unit = {
    println(f"Assistant Managers at McDonalds earn £$wage%1.2f per hour")
  }
}
class BranchManager extends Employee {
  override val wage = 22.50
  override def show(): Unit = {
    println(f"Branch Managers at McDonalds earn £$wage%1.2f per hour" )
  }
}

object FieldOverriding extends App {
  var a = new Employee
  a.show()
  var b = new AssistantManager
  b.show()
  var c = new BranchManager
  c.show()
}
/*
this may look confusing when i come back to it, but it must be understood
this is useful for KEEPING THE SAME FUNCTION NAMES as well as THE SAME
VARIABLE NAMES, OVERRIDING them without hard coding any changes or having lots
of different variables i.e. wage1,wage2,wage3 etc...
 */