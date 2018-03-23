package basic

/**
  * 数据类型
  *
  */
class DataTypeDemo {

  def toInt : String = {
    return """
        0
        035
        21
        oxFFFFFFFFF
        0777L
      """
  }
  def toFloat : String = {
    return """
           0.0
           1e30f
           3.1415926
           1.0e100
           .1
      """
  }
  def toBoolean : String = {
    return "true false"
  }
  def toSymbol : String = '我是.toString()+scala.Symbol("符号字面量")

  override def toString: String =
    "整形字面量："+toInt+'\n'+"浮点型字面量："+toFloat+'\n'+"布尔型字面量："+toBoolean+'\n'+"符号字面量："+toSymbol
}

final case class Symbol private (name:String){
  override def toString: String = "'" + name;
}

import basic.DataTypeDemo
object DataTypeDemo{
  def main(args: Array[String]): Unit = {
    def model = new DataTypeDemo()
    println(model)
  }
}