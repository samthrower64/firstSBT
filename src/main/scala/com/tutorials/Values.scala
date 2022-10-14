package com.tutorials

object Values {
  def main(args: Array[String]): Unit = {
    val data = Map("Dave"->32, "Steve"->40, "Phil"->66, "John"->70)
    println(data.mkString(" / "))
    val tuple:(String, Int)=("Sam", 21)

    case class Person(name:String , isRetiring:Boolean)
    //case class where you mention the attribute

    val createPerson:(String,Int)=> Person = (name,age) => Person(name,age>65)
    val users=data.map(createPerson.tupled)
    println(users)
  }
}
/*
takes values from the map above and gives it conditionals to return in users println
section based on the "isRetiring:Boolean" that is situated in the case class.
 */
