package basic

/**
  * 变量
  */
class VariableDemo {

}

object VariableDemo{

  def main(args: Array[String]): Unit = {

    //0.需要在声明一个变量的同时给予初始值
    var str : String = "123"
    println(str)

    //1.对个变量同时声明
    var int1,int2 = 100
    println(int1 +":"+int2)

    //2.声明元组
    var turple = (10,"10")
    println(turple)
  }
}
