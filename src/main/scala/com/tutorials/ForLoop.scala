package com.tutorials

object ForLoop extends App{
  for(a<-1 to 20){
    println(a)
  }
  for (a<-1 until 50) {
    println(a)
  }
  for (a <- 1 to 10 if a%2==0) {
    println(a)
  }
  for (a <- 1 to 10 if a % 2==1) {
    println(a)
  }
}
