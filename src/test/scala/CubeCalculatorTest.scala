import org.scalatest.funsuite.AnyFunSuite
import unitTesting.CubeCalculator

class CubeCalculator extends AnyFunSuite {
  test("CubeCalculator.cube"){
    assert(CubeCalculator.cube(3) === 27)
  }
}
