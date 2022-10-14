package com.functions

object DefaultValFunc {
  def main(args: Array[String]): Unit = {
    val result1=functionExample(14,23)
    val result2=functionExample()
    val result3=functionExample(45)
    val result4=functionExample(_,45)
    val result5=functionExample(_,_)
    println(result1+"\n"+result2+"\n"+result3+"\n"+result4+"\n"+result5)
  }
  def functionExample(a:Int=0,b:Int=0):Int={
    a+b
  }
}
/*
predefining the params values before calling means that when you reference
the function in main, f you only set one param, the other one is filled in to
what you have predefined it as
e.g. result3, 45 is set but b is not -> functionExample(45) so b is set to its
predefined value of 0

Underscore -> _ <- means that you do not return a proper value, hence in
console we see Lambda returned:
"com.functions.DefaultValFunc$$$Lambda$16/0x0000000801006000@7f63425a"
 */
