package creatingException

package creatingException

class IsNotPrime (s:String) extends Exception{
  override def toString: String = super.toString+"' was the exception found. \n"+s
}

class ExceptionExample5 {
  @throws(classOf[IsNotPrime])
  def isPrime(x: Int): Boolean = {
    if (x <= 1) return false
    for (i <- 2 until x) {
      if (x % i == 0) return false
    }
    true
  }
  def validateNum(number:Int): Unit = {

    if (isPrime(createException.a)) {
      throw new IsNotPrime("Your number isn't prime")
    }
    else {
      println("Your number is prime")
    }
  }
}

object createException extends App {
  println(" What number do you want to test? " )
  var a = scala.io.StdIn.readInt()
  var e = new ExceptionExample5()
  try {
    e.validateNum(a)
  }
  catch {
    case e:IsNotPrime=>println(s"Exception occurred: '$e ")
  }
}