
object scala05 {

  def main(args: Array[String]): Unit = {
    val num01 = 95

    if (num01 >= 0 && num01 <=100) {
      if (num01 >= 90 && num01 <= 100) {
        println("Super smart")
      } else if (num01 >= 80 && num01 < 90) {
        println("Smart")
      } else if (num01 >= 70 && num01 < 80) {
        println("Smart enough")
      } else if (num01 >= 60 && num01 < 70) {
        println("Just smart")
      } else {
        println("No smart")
      }
    } else {
      println("invalid input")
    }

}}
