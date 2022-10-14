package com.constructors

class SecondaryConstructor (id:Int,name:String) {
  var age:Int=0
  var temp:Int=15
    def showDetails(): Unit = {
      println(id + "  "+name+"  "+age+"  "+temp)
    }
  def this(id: Int, name: String, age: Int) {
    this(id, name)
    this.age = age
  }
  def this(id:Int,name:String,age:Int,temp:Int) {
    this(id, name)
    this.age = age
    this.temp = temp+4
  }
}

object MainNew extends App {
  var s = new SecondaryConstructor(1,"Sam",21,16)
  s.showDetails()
  var s2 = new SecondaryConstructor(1, "Sam")
  s2.showDetails()
  var s3 = new SecondaryConstructor(1, "Sam", 21)
  s3.showDetails()
}

/*
here you have 3 parameters overall, two of them are shown in the class (id/name)
then the third one is defined within the function "this" further below

This is how secondary constructors work. YOu can see age is defined in the variable
before the functions.

There are multiple constructors here, this is why it is called a
secondary constructor or an AUXILIARY constructor 
 */