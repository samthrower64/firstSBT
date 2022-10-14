package com.method

object LazyEvaluation extends App {

  def someFunc(doIt: Boolean, test: => String) {
    lazy val x = test
    if (doIt) {
      println(x)
      println("Wow, that was " + x.length + " characters long!")
    }
  }
  someFunc(true, "My name is Jeff")
}
/*
if you initialise a val/variable as lazy, as above it wont return whats
given to it but if you remove lazy then the output "Sam" will be given

def:
A lazy val is most easily understood as a "memoized (no-arg) def".

Like a def, a lazy val is not evaluated until it is invoked. But the result is
saved so that subsequent invocations return the saved value.
The memoized result takes up space in your data structure, like a val.
 */