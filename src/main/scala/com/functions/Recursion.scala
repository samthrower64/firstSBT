package com.functions

object Recursion{

  def main(args: Array[String]): Unit = {
    var result = functionExample(15,4)
    println(result)
    var result2 = functionExample2(7, 3)
    println(result2)
    var result3 = functionExampleFac(4)
    println(result3)
  }
  def functionExample(a:Int,b:Int):Int={
    if (b==0)
      0
    else
      a + functionExample(a,b-1)
  }
  /* This program recurses down so that 4 -> 3 -> 2 -> 1 -> 0
    then recurses back out so that 0 -> 1 -> 2 -> 3 -> 4
    and then returns the total of the bottom of the recursion (0)
    which is 15+15 which is 30, which is returned.
   */

  //above functionExample can also be written like so:
  def functionExample2(a: Int, b: Int): Int = { if (b == 0) 0 else a + functionExample(a, b - 1) }
  //below function is a factorial calculator, using recursion
  def functionExampleFac(a:Int): Int ={
    if (a == 1){
      return 1
    }
    else {
      a*functionExampleFac(a-1)
    }
  }
}
