package com.tutorials

object MixedObjects {
  def main(args:Array[String]): Unit={
    var result =search()
    //println(result)
  }
  //Any - means that ANY type can be handled by this (great!)
    def search(a:Any):Any=a match {
      case 1 => println("One"); 1
      case "two" => println("Two"); 2
      case "hello" => println("hello"); 3
      case 3.14159 => println("Mmmm... I love Pi!"); 4
      case _ => println("Nothing selected"); 5
    }
}
/*println(result) will return whatever is within search() plus ()

 */
