import scala.io.StdIn

object new01 {
  def main(args: Array[String]): Unit = {
    println("Enter the wt in kg :")
    val wt  = StdIn.readInt()
    val op = wt*1000
    println("output in gms:", op);

  }


}
