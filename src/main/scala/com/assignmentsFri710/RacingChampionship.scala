package com.assignmentsFri710

trait Vehicle {
  def specDesc():Unit = {
    println("Stock Vehicle")
  }

}

class Car extends Vehicle {
  override def specDesc(): Unit = {
    println("4WD DTM Classification conversion")
    //var w:Int = 4
  }
}
class Audi extends Car {
  val weight = 1110
  var engineSize: Double = 3.6
  var aero: Int = 4
  def spec(): Unit = {
    val overall = (engineSize/aero)*10
    println(s"Porsche 1.0 (races 1-10): \nWeight: $weight kilograms\nEngine Size: $engineSize L\nAero Spec: $aero\n") //"$wheels?")
    println(s"Overall Capability: $overall")
    println("___________________________")
  }

}
class AudiDevSpec extends Audi {
  override val weight = 1105
  override def spec(): Unit = {
    engineSize = engineSize+0.2
    val overall = (engineSize/aero)*10
    println(s"Porsche 2.0 (races 11-16): \nWeight: $weight kilograms\nEngine Size: $engineSize L\nAero Spec: $aero\n")
    println(s"Overall Capability: $overall")
    println("___________________________")
  }
}
class Ferrari extends Car {
  val weight = 1113
  var engineSize: Double = 3.7
  var aero: Int = 4
  def spec(): Unit = {
    val overall = (engineSize/aero)*10
    println(s"Ferrari 1.0 (races 1-10): \nWeight: $weight kilograms\nEngine Size: $engineSize L\nAero Spec: $aero\n")
    println(s"Overall Capability: $overall")
    println("___________________________")
  }
}
class FerrariDevSpec extends Ferrari {
  override val weight = 1105
  override def spec(): Unit = {
    engineSize = engineSize+0.3
    val overall = (engineSize/aero)*10
    println(s"Ferrari 2.0 (races 11-16): \nWeight: $weight kilograms\nEngine Size: $engineSize L\nAero Spec: $aero\n")
    println(s"Overall Capability: $overall")
    println("___________________________")
  }
}
object RacingChampionship extends App{
  var au:Audi = new Audi()
  au.specDesc()
  au.spec()
  var auds:AudiDevSpec = new AudiDevSpec()
  auds.specDesc()
  auds.spec()
  var fe: Ferrari = new Ferrari()
  fe.specDesc()
  fe.spec()
  var feds: FerrariDevSpec = new FerrariDevSpec()
  feds.specDesc()
  feds.spec()
}
/*
this program uses override for values, override for methods/functions
inheritance is used also
 */