package com.overriding

object BankOverridingTask extends App{
  var mb = new MainBank()
  mb.interest
  var nw = new NatWest()
  nw.interest
  var ba = new BofA()
  ba.interest
  ba.savingsInterest
  var lb = new LocalBankBofA()
  lb.savingsInterest
  var hs = new HSBC()
  hs.interest
}
class MainBank {
  var rateOfInt : Double = 0.75
  def interest(): Unit = {
    println(s"The ECB has an interest rate of $rateOfInt %")
  }
}
class NatWest extends MainBank {
  override def interest(): Unit = {
    rateOfInt += (rateOfInt*0.125)
    println(s"NatWest has an interest rate of $rateOfInt %")
  }
}
class BofA extends MainBank {
  override def interest(): Unit = {
    rateOfInt += (rateOfInt*0.125)
    println(s"Bank of America has an interest rate of $rateOfInt %")
  }
  def savingsInterest(): Unit = {
    rateOfInt = (rateOfInt/(rateOfInt/(rateOfInt/6)))
    println(s"Bank of America has an interest rate of $rateOfInt % on savings accounts")
  }
}
class LocalBankBofA extends BofA {
  override def savingsInterest(): Unit = {
    rateOfInt = (rateOfInt/2)
    println(s"The Providence branch of Bank of America has an interest rate of $rateOfInt % on savings accounts")
  }
}
class HSBC extends MainBank {
  val hsbcInt = 0.8
  override def interest: Unit = {
    val newInt = hsbcInt*rateOfInt/3
    print(s"HSBC inherits $rateOfInt and creates its own of $newInt using their set value of $hsbcInt\n")
  }
}
