import scala.io.StdIn

object scala39 {

  def main(args: Array[String]): Unit = {
    print("Enter first num ")
    val a = StdIn.readInt()
    print("Enter second num ")
    val b = StdIn.readInt()
    print("Enter third num ")
    val c = StdIn.readInt()

    if (a > b && a > c)
      print("The highest num is", a)
    else if (b > a && b > c)
      print("The highest num is", b)
    else
      print("The highest num is", c)

  }

}