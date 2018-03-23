package function

class CallMethod {
  /**
    * 函数传递方式
    * 1.传递函数返回值 -- call by value
    * 2.传递函数名 -- call by name
    *
    */
  def call_by_value(m:String) = {
    println("call_by_value:" + m)
  }
  def call_by_name(m: => String) = {
    println("call_by_name")
    println("value:" +m)
    m
  }
  def call_method() = {
    println("call_method")
    "method"
  }
}

object CallMethod{
  def main(args: Array[String]): Unit = {
    val obj = new CallMethod()
    obj.call_by_value(obj.call_method())
    println("------------------------------")
    println("1.按名調用方式1 -- call_method")
    obj.call_by_name(obj.call_method)
    println("------------------------------")
    println("2.按名調用方式2 -- call_method()")
    obj.call_by_name(obj.call_method())
  }
}
