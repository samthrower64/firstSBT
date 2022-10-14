package collections

object collections2 extends App{

  var set1=Set()
  var set2: Set[String] =Set("Sam","Joe","Dave","Oh")

  println(set2.head)  //returns first element in set
  println(set2.tail)  //everything after the tail
  println(set1.isEmpty)
  println(set2.isEmpty)
  println(set2.contains("Sam"))

}
