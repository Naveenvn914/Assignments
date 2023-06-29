

object scala20 {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 100) {
      if (i % 2 != 0){
        print("A,")
      } else {
        print("B,")
      }
    }
  }
}