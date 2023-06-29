import scala.io.StdIn

object scala33_01 {

  def main(args: Array[String]): Unit = {
    //given number is palindrome or not?
    println("X:")
    val X = StdIn.readInt()
    println("Y:")
   val Y = StdIn.readInt()

    for (i <- X to Y){
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
       println(i)
      }
    }
  }}