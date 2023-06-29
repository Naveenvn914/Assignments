

object scala21 {

  def main(args: Array[String]): Unit = {

    for (i <- 10 to -5 by -1) {
      val c = i - 1
      println(s"$i@$c")
    }
  }

}