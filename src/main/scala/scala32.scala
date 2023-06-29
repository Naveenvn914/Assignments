import scala.io.StdIn

object scala32 {

  def main(args: Array[String]): Unit = {
    //given number is palindrome or not?
    val number = 100001

    if (number < 0) return false // Palindromes cannot be negative

    var num = number
    var reverse = 0
    var remainder = 0

    while (num > 0) {
      remainder = num % 10
      reverse = reverse * 10 + remainder
      num = num / 10
    }
    if (number == reverse)(
      print("num is pali")
    )else{
      print("num is not pali")
    }
  }
  }