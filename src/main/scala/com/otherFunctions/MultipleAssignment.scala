package com.otherFunctions

object MultipleAssignment extends App {
    val b=23423434L
    println(b)        //L isnt included as it doesnt count as part of an int
    val c= '\u0041'
    println(c)        //unicode conversion for the letter A


    println("This is a\ntest, able to use a\bbackspace, some horizontal\t tab")
    println("Also, i don't know what a \n line feed")
    println("Or what a \fform feed and a \rcarriage return is")
    println("The only way to \" find out \'  is to use the slide")
    println("material given \\")

    println("\f Still not sure of how Form Feed works \f")
    val life = 1
    if (life == 0) {
      System.err.println("Oh no! You died!")
    }
    else {
      println("You're Alive... for now!")
    }

  //shows up in the console if there is an error that occurs
}

/*Carriage return means to return to the beginning of the current line without
advancing downward. The name comes from a printer's carriage, as monitors were
rare when the name was coined. This is commonly escaped as "\r", abbreviated CR,
and has ASCII value 13 or 0xD.

Linefeed means to advance downward to the next line; however, it has been
repurposed and renamed. Used as "newline", it terminates lines
(commonly confused with separating lines). This is commonly escaped as "\n",
abbreviated LF or NL, and has ASCII value 10 or 0xA. CRLF (but not CRNL) is
used for the pair "\r\n".

Form feed means advance downward to the next "page". It was commonly used as
page separators, but now is also used as section separators. Text editors can
use this character when you "insert a page break". This is commonly escaped as
"\f", abbreviated FF, and has ASCII value 12 or 0xC.
 */
