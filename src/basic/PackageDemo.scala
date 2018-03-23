package basic{

  /**
    * 包装类
    */
  class PackageDemo {
    override def toString: String = {

      return "package"
    }
  }
}


object PackageDemo{

  def main(args: Array[String]): Unit = {

    //0.导入包中除去非指定类外的全部类
    import basic.{PackageDemo => _,_}
    //println(new PackageDemo())

    //1.导入包中指定类，可以多个
    import basic.{PackageDemo}

    //2.导入包中全部直接类
    import basic._

    //3.导入包中指定类
    import basic.PackageDemo
    println(new PackageDemo())

    //4.导入包中指定类并重命名
    import basic.{PackageDemo => Package}
    println(new Package())
  }
}

