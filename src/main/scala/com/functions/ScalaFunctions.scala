package com.functions

object ScalaFunctions {
  def main(args: Array[String]): Unit = {
    //functionExam //calling the BELOW function UP HERE without brackets!
    //no parameters set
    val result = functionModify()
    println(result)
    functionExample(4,5)  //calls functionExample with the parameters 4,5 as
                          //specified in the function itself below
  }

  def functionExam(): Unit = {
    println("Simple Function!")
  }

  def functionModify(): Int = { //no colon unit needed
    var a = 10
    a += a
    a       //<-----YOU NEED TO RETURN SOMETHING!!!!!!! OTHERWISE : Unit WILL
            //RETURN AND CODE WONT COMPILE!!
  }
  def functionExample(a:Int,b:Int):Unit={
    val c=a+b
    println(c)

  }
}

