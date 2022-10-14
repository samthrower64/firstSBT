package com.oop

//capability to do pattern matching345
trait Storage

case class MetalContainer(a:Int,b:Int) extends Storage
case class WoodenCrate(a:Int) extends Storage
case object CardboardBox extends Storage

object MainCaseClass extends App {
  callCase(MetalContainer(50,25))       //ALL OF THIS HERE
  callCase(WoodenCrate(40))             //INHERITS FROM THE TRAITS
  callCase(WoodenCrate(35))             //BELOW IN callCase
  callCase(CardboardBox)                //f:Storage IS IMPORTANTS FOR
  callCase(MetalContainer(25,12))       //THIS INHERITANCE
  
def callCase(f:Storage) = f match {
  case MetalContainer(f,g)=>println("Clearance = "+f+" up, "+g+" down.")
  case WoodenCrate(f)=>println("Clearance = "+f+" up ")
  case CardboardBox=>println("No Special Requirements")
  }

}
/*trait Storage allows for this to be set as a superclass so
that the classes/objects (Metal/Wooden/Cardboard) will inherit whatever
it can from the trait (extends) from Storage (f:Storage)
 */