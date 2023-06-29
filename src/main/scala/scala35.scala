

object scala35 {

  def main(args: Array[String]): Unit = {
    val x = 17
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