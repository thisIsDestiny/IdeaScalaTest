package function

/**
  * 調用函數時，可以通過制定參數名來改變參數傳遞順序
  */
class ParamEvaluate {

  def method(a:Int,b:Int)={
    println("a:"+a+",b:"+b)
  }
}

object ParamEvaluate{
  def main(args: Array[String]): Unit = {

    new ParamEvaluate().method(b = 1,a=2);
  }
}
