package BankingApp

import Console.{BOLD, RESET, UNDERLINED}
import io.AnsiColor._
import scala.collection.mutable.ListBuffer
import scala.io.StdIn.{readDouble, readInt, readLine}

class InvalidDepositException (s:String) extends Exception{
  override def toString: String = super.toString+"Invalid Deposit amount, exception caused: "+s
}
class InvalidSelectionException(s:String) extends Exception {
  override def toString: String = super.toString + "User's selection was invalid, exception caused: "
}
class InvalidACNException (s:String) extends Exception {
  override def toString: String = super.toString+"That ACN doesn't exist, exception caused: "+s
}
class InvalidPasswordException (s:String) extends Exception {
  override def toString: String = super.toString+"You don't work here!, exception caused: "+s
}
class Account {
  var name: ListBuffer[String] = new ListBuffer[String]()
  name += ("Sam", "Joe")
  var accType: ListBuffer[String] = new ListBuffer[String]()
  accType += ("Standard Account", "Savings Account")
  var accNum: ListBuffer[Int] = new ListBuffer[Int]()
  accNum += (7782, 7783)
  var bal: ListBuffer[Double] = new ListBuffer[Double]()
  bal += (2500.00, 4750.00)
  var interest: ListBuffer[Double] = new ListBuffer[Double]()
  interest += (0.75,1.15)

  var adminPwd:String = "123abc"
  var chequesCashed = 0
  var totalCustomers = name.length
  var increment:Int = accNum((accNum.length)-1)
  //variable allows us to generate new account numbers incrementally

  // FIRST CHOICE OF ACCOUNT
  def userDetails(): Unit = {
    println("Please enter your account number")
    val accNum1: Int = readInt()
    if (accNum1.toString.length == 8) {
      val i1 = accNum.indexOf(accNum1)
      println("Hello " + name(i1) + ". Your " + accType(i1) + "\nof number: " + accNum(i1) + " contains: £" + bal(i1) + "running at" + interest(i1) +"% interest.")
    }
    else {
      println("Invalid Account Number")
    }
  }

  // SECOND CHOICE OF ACCOUNT
  @throws(classOf[InvalidACNException])
  def addFundsLogin(): Unit = {
    println("Please enter your account number")
    val accNum2 = readInt()
    if (accNum2.toString.length == 8) {
      addFunds(accNum2)
    } else {
      println("Invalid Account Number")
    }
  }

  @throws(classOf[InvalidDepositException])
  def addFunds(aNum: Int): Unit = {
    val i2 = accNum.indexOf(aNum)
    //above takes user account number to locate specific account
    //this code could be ineff here lines REMOVE THIS BEFORE SUBMIT
    println("How much would you like to deposit today? (format pounds.pence also, even if 00): ")
    var funds1a = readDouble() //reads user input
    //if statement decides if this is a valid number to input, exception thrown otherwise
    //this is an example of an exception being used in an IF/ELSE statement
    if (funds1a > 5000.00 || aNum < 0.00) {
      throw new InvalidDepositException("You must deposit between £0 and £5000 at any one time.")
    }
    else {
      println("Deposit request meets requirements for single deposit")
      bal(i2) += funds1a
    }
    var x = "%1.2f".format(bal(i2))
    println(s"Your funds have been added to your account successfully!\nYour new balance is ${BOLD}£$x${RESET}\n\nHave a Great Day! ")
  }

  def withdrawFundsLogin(): Unit = {
    println("Please enter your account number")
    val accNum2 = readInt()
    if (accNum2.toString.length == 8) {
      withdrawFunds(accNum2)
    } else {
      println("Invalid Account Number")
    }
  }

  def withdrawFunds(aNum: Int): Unit = {
    val i3 = accNum.indexOf(aNum)
    //above takes user account number to locate specific account
    //this code could be ineff here lines REMOVE THIS BEFORE SUBMIT
    println("How much would you like to withdraw today? (format pounds.pence also, even if 00): ")
    var funds2a = readDouble() //reads user input
    //if statement decides if this is a valid number to input, exception thrown otherwise
    //this is an example of an exception being used in an IF/ELSE statement
    if (funds2a > 5000.00 || aNum < 0.00) {
      throw new InvalidDepositException("You can only withdraw between £0 and £250 at any one time.")
    }
    else {
      println("Deposit request meets requirements for single deposit")
      bal(i3) -= funds2a
    }
    val x = "%1.2f".format(bal(i3))
    /*HERE i would potentially add code which updates the values held in ListBuffer
    above, but as these are hard coded, they will re-instantiate on each
    run of the program.
     */
    println(s"Your funds have been added to your account successfully!\nYour new balance is ${BOLD}£$x${RESET}\n\nHave a Great Day! ")
  }
  def accCreation(): Unit = {
    val increment1:Int = increment + 1
    val newAccName = readLine("Enter your First Name: ")
    name += newAccName
    println("Enter your opening balance: ")
    val newBal = readDouble()
    bal += newBal
    accNum += (increment1)
    val whatAcc = readLine("Which type of account would you like to open with us?: \nPress 1 for Standard Account\nPress 2 for Savings Account")
    if (whatAcc == 1) {
      accType += ("Standard Account")
      interest += 0.75
      println(s"You will receive $interest % interest each year with this account")
       //for these two i could use case class. As of first commit, I'm unsure how to go about this.
      // further commit may contain case class usage for this.
    } else if (whatAcc == 2) {
      accType += ("Savings Account")
      interest += 1.15
      println(s"You will receive $interest % interest each year with this account")

    }
    println("Account added successfully")
  }
  def accDeletion(): Unit = {
    println("Enter the account number of the account you wish to delete")
    val accNum6 = readInt()
    val i4 = accNum.indexOf(accNum6)
    name -= name(i4)
    accNum -= accNum(i4)
    accType -= accType(i4)
    bal -= bal(i4)
    interest -= interest(i4)
    println("Account has been deleted successfully")
  }
}

  class CreditCard extends Account {
    override def userDetails(): Unit = {
      println("Please enter your account number")
      val accNum4 = readInt()
      if (accNum4.toString.length == 8) {
        newCard(accNum4)
      } else {
        println("Invalid Account Number")
      }
    }
    def newCard(aNum: Int): Unit = {
      println("Printing this new card will freeze your existing one.\nWould you like to go ahead with this? (Y/N)")
      var x = readLine()
      if (x == "Y") {
        println("A new card will be sent over 3-5 business days. Your current card has now been frozen")
      } else if (x == "N") {
        userDetails()
      }
      else {
        throw new InvalidSelectionException("Sorry, I didn't quite understand that seletion.")
      }
    }
  }

class Cheque extends Account{
    override def userDetails(): Unit = {
      println("Please enter your account number")
      val accNum5 = readInt()
      if (accNum5.toString.length == 8) {
        addCheque(accNum5)
      } else {
        println("Invalid Account Number")
      }
    }
    def addCheque(aNum: Int): Unit = {
      println(s"Which Bank is this cheque from? Our accepted banks are ${BOLD}Natwest, Barclays, HSBC and Bank of America${RESET}")
      val checkCheque1 = readLine()
      if (checkCheque1 == "Natwest" || checkCheque1 == "Barclays" || checkCheque1 == "HSBC" || checkCheque1 == "Bank of America") {
        println(s"How much will you be depositing with this cheque? Our limit is £10,000,000.00")
        val checkCheque2:Double = readDouble()
        if (checkCheque2 > 0.00 && checkCheque2 < 10000000.00) {
          println(s"Please enter the Cheque number below: ")
          val checkCheque3:Int = readInt()
          if (checkCheque3.toString.length == 12) {
            println("This information CHEQUES out, it will be processed by the next working day")
            chequesCashed += 1
          }
          else {
            throw new InvalidSelectionException("Invalid Cheque Number!")
          }
        }
        else {
          throw new InvalidDepositException("Can't deposit that amount!")
        }
      }
      throw new InvalidSelectionException("This Bank's cheques are not accepted here!")
    }
  }

class SystemChecker extends Account {
  def overview(): Unit = {
    println("Enter Administrator Password")
    var x = readLine()
    if (x == adminPwd) {
      println("Good to see you again, Mr CEO.")
      }
    else{
      throw new InvalidPasswordException("You don't work here! Get out!!")
    }
  }
  def viewCheques(): Unit = {
    print(s"Customers have deposited a total of: $chequesCashed cheques")
  }
  def viewCustomers(): Unit = {
    print(s"We have a total of: $totalCustomers currently registered with our bank")
  }
  def viewAll(): Unit = {
    println("Customers: " + name.foreach(println))
    println("Account Numbers: " + accNum.foreach(println))
    println("Their Account Types: " + accType.foreach(println))
    println("Their Current Balances are: " + name.foreach(println))
  }
}
  object Bank {
    def main(args: Array[String]): Unit = {
      val acc = new Account()
      val crd = new CreditCard()
      val che = new Cheque
      val sys = new SystemChecker
      println(s"Welcome to ${BOLD}The Bank${RESET}. Please select from the choices below:")
      println(s"${BOLD}1)${RESET} ${UNDERLINED}Account Details${RESET} \n${BOLD}2)${RESET} ${UNDERLINED}Credit Card Enquiries${RESET} \n${BOLD}3)${RESET} ${UNDERLINED}Deposit Cheque${RESET} \n${BOLD}4)${RESET} ${UNDERLINED}Admin Login${RESET}")

      var selection: Int = readInt()
      if (selection == 1) {
        println(s"${BOLD}Account Details${RESET}\nPress 1 to View Your account\nPress 2 to Add Money to your Account\nPress 3 to withdraw funds\nPress 4 for Admin settings")
        selection = readInt()
        if (selection == 1) {
          acc.userDetails()
        } else if (selection == 2) {
          acc.addFundsLogin()
        } else if (selection == 3) {
          acc.withdrawFundsLogin()
        } else {
          System.err.println("Invalid selection")
        }
      } else if (selection == 2) {
        crd.userDetails()
      } else if (selection == 3) {
        che.userDetails()
      } else if (selection == 4) {
        sys.overview()
        println(s"Choose your option:\n1)View all cheques cashed to date\n2)View our total number of customers\n3)View details of all customers")
        selection = readInt()
        if (selection == 1) {
          sys.viewCheques()
        } else if (selection == 2) {
          sys.viewCustomers()
        } else if (selection == 3) {
          sys.viewAll()
        } else {
          System.err.println("Invalid selection")
        }
      } else {
        System.err.println("Invalid selection")
      }
    }
  }


