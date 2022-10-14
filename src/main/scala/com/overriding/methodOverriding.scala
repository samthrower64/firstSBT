package com.overriding

object methodOverriding extends App{
  var b = new Vehicle()
  b.run
  var c = new Bike()
  c.run()
  var d = new Plane()
  d.run()
}

class Vehicle {
  def run: Unit = {
    println("Vehicle is running")
  }
}
class Bike extends Vehicle {
  override def run(): Unit = {
    //println("Bike running")
    super.run                   //super allows what happens in the superclass
  }                             //to happen in this one
}
class Plane extends Vehicle {   //plane can extend Vehicle or Bike here, if you extend
  override def run(): Unit = {  //nothing ,you dont need override but you cant
    println("Plane flying")     //INHERIT anything from the other classes!
  }
}
/*
METHOD IS OVERRIDDEN! two methods of the same name here, override allows them both to run
if you take override away then the secondmost function run wont work
 */