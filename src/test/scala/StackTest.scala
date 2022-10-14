import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite
import unitTesting.Stack

import scala.collection.mutable



class StackTest extends AnyFunSuite with BeforeAndAfter{
  var s = ""
  before {
    val s ="hi"
  }
  //whatever is in before occurs before EVERY test case!
  test("Pop is invoked on a non-empty stack") {
    assert(Stack.result === 31)
    assert(Stack.stack.size === Stack.oldSize-1)

  }
  test("pop is invoked on an empty stack") {
    val emptyStack = new mutable.Stack[Int]
    intercept[NoSuchElementException]{
      emptyStack.pop()
    }
    assert(emptyStack.isEmpty)
  }
  test("testing index is out of bounds") {
    val thrown = intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
  }
  test("same as above but with message") {
    val thrown = intercept[IndexOutOfBoundsException] {
      s.charAt(-1)
    }
    //println(thrown.getMessage)
    assert(thrown.getMessage === "Index -1 out of bounds for length 2")
  }
  after {
    println("You made it!")
  }
}

