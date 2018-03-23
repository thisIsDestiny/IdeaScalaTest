package function

object DefaultParamValue {

  def main(args: Array[String]): Unit = {

    method()
    method(1,2)
    method(1)
    method(b=1)
  }

  def method(a:Int = 3,b:Int =7) = {
    println(a+b)
  }
}
