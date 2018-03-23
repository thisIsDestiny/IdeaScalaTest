package function

/**
  * 匿名函數
  */
object AnonymousFunc {

  /**
    * 简化形式
    * @return
    */
  def add1 = (a:Int,b:Int) => a + b

  /**
    * 实际形式
    * new FunctionX[x...,return]
    * param x       可变参数
    * param X       表示参数数量
    * param return  表示返回值
    * @return
    */
  def add2 = new Function2[Int,Int,Int] {
    def apply(a: Int, b: Int): Int = a + b;
  }
    def main(args: Array[String]): Unit = {
      println(add1(1,2))
      println(add2(1,2))
    }
}
