package com.otherFunctions

object VariableLengthParam extends App {

  def add(args: Int*): Int = { //args set as ALL integers (using *)
    var sum = 0 //in list (below), set sum as 0
    for (a <- args) sum += a //for all a in args (args can be anything)
    sum //return statement
  }

  var sum = add(1, 10, 100, 1000, 10000)
  print(sum)
}


  /*this program iterates over all elements of a list and
adds all of the elements together

setting the function parameters to * or Int* allows any amount of
parameters to be put into it,
iterating over it using a for loop of all items (a) within


  def player(args: Array[String]*) {
    var avgAge = 0
    for (a <- args ) avgAge
  }
  val colors = Map("Dave" -> 15, "Steve" -> 19, "Alexander" -> 27)
}
*/
