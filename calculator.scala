object calculator {
  def main(args: Array[String]): Unit ={
    var number1:Double = 0.0
    var number2:Double = 0.0
    var option:Char = '+'
    var selection:Int = 0
    do{
      println("1.Calculate\n2.Exit")
      print("Select your option: ")
      selection = scala.io.StdIn.readInt()
      selection match{
        case 1 =>
          print("Enter the first number: ")
          number1 = scala.io.StdIn.readDouble()
          print("Enter the second number: ")
          number2 = scala.io.StdIn.readDouble()
          println("Enter the operation:\n(+ - * / %): ")
          option = scala.io.StdIn.readChar()

          option match {
            case '+' => println(number1 + " + " + number2 + " = " + (number1 + number2))
            case '-' => println(number1 + " - " + number2 + " = " + (number1 - number2))
            case '*' => println(number1 + " * " + number2 + " = " + (number1 * number2))
            case '/' => println(number1 + " / " + number2 + " = " + (number1 / number2))
            case '%' => println(number1 + " % " + number2 + " = " + (number1 % number2))
            case _ => println("Unidentified operation")
          }
        case 2 => println("Bye!")
        case _ => println("ERROR: Invalid Selection")
      }
    }while(selection!=2)

  }


}
