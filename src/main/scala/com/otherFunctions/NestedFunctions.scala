package com.otherFunctions

object NestedFunctions extends App {
  def add(a:Int,b:Int,c:Int): Int ={
    def add2(x:Int,y:Int): Int ={
      x+y
    }
    add2(a,add2(b,c))
  }
  var result = add(10, 10, 10)
  println(result)
}

/*recursive and nested function
10,10,10 goes into a,b,c in function add
next goes to complete the first function, which is
calling the second function "add2" to use a, itself, (b and c)
a is first parameter and the recursive of add2(b,c) is the second
add2(b,c) -> x+y -> b+c -> 10+10 = 20
then we have add2(a,20), we know a is 10 from above, so it is 10+20
which is 30;
this is returned in the result.
 */