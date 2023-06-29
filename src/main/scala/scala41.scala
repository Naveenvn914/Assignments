import scala.io.StdIn

object scala41 {

  def main(args: Array[String]): Unit = {
    print("Array Size:  ")
    val size = StdIn.readInt()

    val arr = new Array[Int](size)

    for (index <- 0 until size) {
      println(s"Enter element $index ")
      arr(index) = StdIn.readInt()
    }

    for (i <- 0 until size) {
      if (i % 2 == 1) {
        println(s"Element of index $i is", arr(i))
      }
    }
  }

}