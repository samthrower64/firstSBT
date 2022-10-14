package collections

//class
object collections extends App{
  var set1 = Set() // empty set
  var set2: Set[Int] =Set(3,5,6,2,9) //different data types
  var set3: Set[Int] =Set() // empty set
  var games: Set[Any] = Set("Rugby", "Football", "Cricket", "Golf",50) // set of games
  //sets remove duplicates already! better than an unfriendly error msg
  println(set1)
  println(set2)
  println(set3)
  print(games)
}
