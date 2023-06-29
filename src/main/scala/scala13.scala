

object scala13 {

  def main(args: Array[String]): Unit = {
    val start = 20
    val end = 140

    // Print alternative even numbers
    for (num <- start to end by 4) {
      if (num % 2 == 0) {
        println(num)
      } else {
        println(num + 1)
      }
    }
  }

}





