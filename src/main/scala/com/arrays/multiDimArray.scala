package com.arrays

object multiDimArray {
  def main(args: Array[String]) {
    // Creating and assigning the values
    // to the array
    var arr = Array(Array(0, 2, 4, 6, 8),
      Array(1, 3, 5, 7, 9))

    for (i <- 0 to 1) {
      for (j <- 0 to 4) {
        // Accessing the values
        print(" " + arr(i)(j))
      }
      println()
    }
  }
}
/*
var arr=Array.ofDim[Int](3,5)
sets an empty array of 3x5
values can then be assigned to each individual cell by
arr(0)(1) =  45
will set the first column, second row to 45
 */
