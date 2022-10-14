package com.inheritance

object BasicInheritance extends App {
  new BusinessMan
  println("_________")
  new Programmer
}
class Employee {
  var salary:Double = 25000

}
class Programmer extends Employee {
  var bonus:Int=750
  salary+=(salary*1.125)
  println(salary)
  println(bonus)
}
class BusinessMan extends Employee {
  var bonus:Int=1250
  println(salary)
  println(bonus)
}
