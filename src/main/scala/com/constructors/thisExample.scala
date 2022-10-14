package com.constructors

class thisExample (name:String) {
  var id:Int = 0
  //var name:String=""
  def this(name:String,id:Int){                  //name then id in the params like below
    this(name)  //have to initialise this this way here as it is in params in class line
    this.id=id

  }
  def show(): Unit = {
    println(id + "  " +name)
  }
}
object T extends App {
  var t = new thisExample("hello",91) //name then id in the params
  t.id = 23
  t.show()
}