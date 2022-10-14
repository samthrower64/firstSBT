package creatingException

class InvalidAgeException (s:String) extends Exception{
  override def toString: String = super.toString+"----------"+s
}

class ExceptionExample2 {
  @throws(classOf[InvalidAgeException])
  def validate(age:Int): Unit = {
    if (age<18) {
      throw new InvalidAgeException("not eligible")
    }
    else {
      println("You are eligible")
    }
  }
}

object createException extends App {
  var e = new ExceptionExample2()
  try {
    e.validate(4)
  }
  catch {
    case e:InvalidAgeException=>println(s"Exception occurred: '$e'")
  }
}