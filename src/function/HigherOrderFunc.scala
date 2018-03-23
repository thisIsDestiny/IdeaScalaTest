package function

/**
  * 高階函數
  * 可以使用函數作為參數
  * 或者把其他函數作為返回值
  *     把其他函數的返回值作為返回值
  */
object HigherOrderFunc {

  def main(args: Array[String]): Unit = {

    println("返回傳入函數的返回值"+returnValue(sqr,2))
    println("返回傳入的函數"+returnFunc(sqr)(2))
  }
  def sqr(a:Int) = ""+a * 2

  def returnValue(m:Int => String,a:Int) = m(a)

  def returnFunc(m:Int => String) :Int => String = m
}
