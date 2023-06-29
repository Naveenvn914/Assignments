

object scala22 {

  def main(args: Array[String]): Unit = {

    for (i <- 100 to 10000) {
      if (i % 100 == 0) {
        print(s"$i, ")
      }
    }
  }
}