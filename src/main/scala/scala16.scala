

object scala16 {

  def main(args: Array[String]): Unit = {
    val start = 382
    val end = 582

    // Print alt even numbers
    var count = 0

    for (num <- start to end ) {
      if (num % 2 == 0) {
       // println(num)
      }
      count =count + num
      }
    println(count)
    }
  }

