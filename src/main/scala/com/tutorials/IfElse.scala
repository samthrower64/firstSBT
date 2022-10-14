package com.tutorials

object IfElse extends App{
  println("What was your score out of 100? : ")
  var score = scala.io.StdIn.readInt()
    if(score>=0 && score<50){
      print("Fail, See me after class...")}
    else if(score>= 50 && score<60){
      print("You got a D, Revise Harder!")}
    else if (score >= 60 && score < 70) {
      print("You got a C, Better Luck Next Time!")}
    else if (score >= 70 && score < 80) {
      print("You got a B, Keep Pushing!")}
    else if (score >= 80 && score < 90) {
      print("You got an A, Good Work!")}
    else if (score >= 90 && score < 100) {
      print("You got an A*, Amazing!")
    }
}
