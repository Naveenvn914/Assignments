import scala.io.StdIn
object scala06 {

  def main(args: Array[String]): Unit = {
    println("Enter the first number:")
    val num1 = StdIn.readDouble()

    println("Enter the second number:")
    val num2 = StdIn.readDouble()

    println("Enter the operation (+, -, *, /):")
    val operation = StdIn.readLine()

    val result = operation match {
      case "+" => num1 + num2
      case "-" => num1 - num2
      case "*" => num1 * num2
      case "/" => num1 / num2
      case _ => throw new IllegalArgumentException("Invalid operation")
    }
    println("Result: " + result)
  }
5
}