package unitTesting

import scala.collection.mutable

object Stack {
    var stack = new mutable.Stack[Int]
    stack.push(15)
    stack.push(31)
    val oldSize=stack.size
    val result=stack.pop()
  }
