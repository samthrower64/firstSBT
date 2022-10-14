package com.tutorials

object While extends App{
  var a = 10
  while(a<20) {
    println(a)
    a=a+2
  }
//loop broken out of here when number <20 is reached, a is reassigned to 11 and next loop goes
  a=11
  do {
    println(a)
    a+=2
  }while(a<=20)
}
