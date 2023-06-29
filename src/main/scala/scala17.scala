

object scala17 {

  def main(args: Array[String]): Unit = {
    val start = 'A'
    val end = 'Z'

    for (alphabets <- start to end) {
      println(alphabets)
    }
  }

}
