import scala.io.StdIn

object scala35_1 {

  def main(args: Array[String]): Unit = {
    print("input value to check:")
    val x = StdIn.readInt()
    var count = 0
    //find a given number is prime or not
      if (x == 1) false
      else
      {
        for (i <- 2 to x-1 ) {
          if (x % i == 0) {
            count = count + 1
          }
        }
        if (count == 0) {
          println("Yes, Prime number", x)
        }
        else {
          print("Its not Prime number")
        }
          }
        }
    }