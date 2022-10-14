package com.tutorials

object ValVar extends App {
  //val is immutable, once you set it you can't change it
  //var is mutable, you can change it once you set it
  var data = 100
  data = 101
  println(data)

  var datestamp:Int=101

  println("Type Your Number: ")
  var input:Int = scala.io.StdIn.readInt
  //scala.io.StdIn.readInt allows the user to input their number
  //to be saved within the variable "input"
  if(input % 2 == 0){
    println("Even")}
  else{
    println("Odd")
  }
}
