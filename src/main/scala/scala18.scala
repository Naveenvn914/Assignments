

object scala18 {

  def main(args: Array[String]): Unit = {
    val start = 24
    val end = 100
    val step = 2

    var sum = 0
    var count = 0

    // Calculate the sum and count of numbers
    for (num <- start to end by step) {
      sum += num
      count += 1
    }
    val average = sum / count

    println("The average of the series from 24,26,28...98,100 is:" + average)

  }

}
