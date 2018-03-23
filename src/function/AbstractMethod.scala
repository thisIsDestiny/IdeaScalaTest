package function

/**
  * 包含抽象方法的类 必须为抽象类
  */
abstract class AbstractMethod {

  //未实现函数体的函数自动转化为抽象函数
  def abstractMethod()
  def implementsMethod() : Unit = {}

  def abstractMethod( str:String) : String
  def implementsMethod(str:String) : String = str
}
