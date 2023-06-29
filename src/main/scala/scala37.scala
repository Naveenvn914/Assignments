import scala.io.StdIn

object scala37 {

  def main(args: Array[String]): Unit = {
    print("Range From:")
    val X = StdIn.readInt()
    print("Range to:")
    val Y = StdIn.readInt()
    print("position:")
    val p = StdIn.readInt()
    var position = 0

    for (i <- X to Y) {
        val num = i
      var count = 0

        for (i <- 2 to num-1 ) {
          if (num % i == 0) {
            count = count + 1
          }
        }
        if (count == 0) {
          position += 1
          if (position == p)
            println("Prime number", num, position)
        }
        /*else {
          print("Its not Prime number")
        }*/
          }
        }
    }