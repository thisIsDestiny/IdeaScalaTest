package function

/**
  * 函数的柯里化
  *
  * 将参数列表长度为2的函数拆分为2个函数
  * 每个函数的参数为原函数对应下标的参数类型
  * 最后一个参数的函数返回结果【原函数的返回值】
  * 第一个函数返回值为下一个指定函数
  */
object FunctionCurrying {

  def add(a:Int,b:Int) = a+b

  //Int => Int 返回一个函数（参数为整形：返回为整形）
  def add(a:Int) :Int => Int = {
    add(a,_:Int)
  }

  def main(args: Array[String]): Unit = {

    println(add(1,2))

    println(add(1)(2))
  }
}
