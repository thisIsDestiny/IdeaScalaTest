package basic

object FormatString {

  def main(args: Array[String]): Unit = {

    var str = printf("%d\n%f\n%c\n%s",1,0.1,'1',"01")

    println(str)
  }
}
