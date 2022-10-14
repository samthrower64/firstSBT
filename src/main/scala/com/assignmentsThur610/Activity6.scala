package com.assignmentsThur610

object Activity6 {
  def printPerm(str:String, ans:String): Unit = {
    if (str.isEmpty) {
      println(ans + "")
      return
    }
    //var count = 0
    for (i <- 0 until str.length) {
      val ch = str.charAt(i)
      val ros = str.substring(0, i) + str.substring(i+1)
      printPerm(ros,ans + ch)
      //count = count+1
    }
    //print(count)
  }
  def main(args: Array[String]) : Unit = {
  val s = "Samuel"
  printPerm(s,"")

  }
}
/*
Name rearranger
 */