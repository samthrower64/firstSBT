package com.inheritance

class vehicle {
  final val speed:Int=60
}
class Boat extends vehicle {
  //override val speed:Int=40
  def show(): Unit = {
    println(speed)
  }

  //OVERRIDE CANNOT WORK ON A FINAL, FINALs VALUES DONT CHANGE
}
object FinalMain extends App {
  var a = new Boat
  a.show()
}
/*
VAR is MUTABLE and CAN BE CHANGED
VAL is IMMUTABLE and CANT BE CHANGED except for OVERRIDE
FINAL VAL is IMMUTABLE and CANT BE CHANGED WHAT SO EVER
 */