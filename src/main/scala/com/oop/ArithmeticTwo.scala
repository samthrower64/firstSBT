package com.oop

class ArithmeticTwo {
  def magic(a:Int,b:Int) : Unit = {
    var x = a*(a-b)
    var y = b*(b - a)
    if (x < y) {
    println(s"randomly picked $a")
  }
    else if (x > y) {
      println(s"randomly picked $b")
    }
    else {
      println(s"randomly picked both of your numbers $a $b")
    }
  }
}
object MainObjekt2 extends App {
  new ArithmeticTwo().magic(15,8)
}


//object names in classes must be unique, otherwise other objects will
//be referenced from other classes