package com.arrays

object multiDimArray2 {
  def main(args: Array[String])
  {

    // Creating and assigning the values to the array
    var arr= Array(Array(0, 2, 4, 6, 8),
      Array(1, 3, 5, 7, 9))

    for(i<-0 to 1; j<-0 until 5)
    {
      print(i, j)

      //Accessing the elements
      println("=" + arr(i)(j))
    }
  }
}
/*
prints out each cell and its value
 */