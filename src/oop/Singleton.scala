package oop

/**
  * scala 通过伴生对象实现单例
  * class的companion object 是object
  * objectde companion class 是class
  * 规则：
  * 1.必须在同一个文件
  * 2.类私有化构造函数
  * 3.伴生对象与类同名
  *   可以互相访问私有属性及方法
  */

class Singleton private(){//私有化构造方法

  private var value = ""

  def call_object_method() = {
    method()
  }
}

//与类名相同
object Singleton{

  private def method() = {}

  def call_class_property() = {
    println(value)
  }
}
