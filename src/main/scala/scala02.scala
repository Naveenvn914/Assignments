import scala.io.StdIn

object scala02 {
  def main(args: Array[String]): Unit = {
    println("Enter the wt in Degree C :")
    val degC  = StdIn.readInt()
    val OPF= (degC*9/5)+32
    println("output in gms:", OPF);

  }


}
