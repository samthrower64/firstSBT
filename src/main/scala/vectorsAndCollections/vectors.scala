package vectorsAndCollections

object vectors extends App {
  val v1 = Vector(4,5,6)    //4,5,6
  val v2 = v1:+7            //4,5,6,7
  val v3 = v2 ++ Seq(8.9)   //4,5,6,7,8,9

  val v4 = 3 +: v3          //3,4,5,6,7,8,9
  val v5 = Seq(1,2) ++: v4  //1,2,3,4,5,6,7,8,9

  var v6 = Vector(5,6,1,43,7,3,2,5,84)
  val list1to100 = (1 to 100).toList
  list1to100.foreach((element: Int) =>print(element+" "))

  var st = v6.sorted
  print("Vector Elements: ")
  st.foreach((element:Int) => print(element+" "))
}
