import org.scalatest.flatspec.AnyFlatSpec

class setSpecsTest extends AnyFlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size === 0)
  }
  //basically the lines 5 and 9 define the sort of test function then what the line describes is written out in code within the method.
  //it must contain SHOULD and then IN
  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException]{
      Set.empty.head
    }
  }
}
