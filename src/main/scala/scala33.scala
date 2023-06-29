import scala.io.StdIn

object scala33 {

  def main(args: Array[String]): Unit = {
    //given number is palindrome or not?
    //val X = 100//StdIn.readInt()
   // val Y = 200//StdIn.readInt()

    for (i <- 200 to 300){
      var num = i
      var reverse = 0
      var remainder = 0
      if (i < 0) return false // Palindromes cannot be negative

      while (num > 0) {
        remainder = num % 10
        reverse = reverse * 10 + remainder
        num = num / 10
      }
      if (i == reverse) {
       print(i)
      }
    }
  }}