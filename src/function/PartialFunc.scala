package function
import java.util._
/**
  * 偏应用函数
  */
object PartialFunc {

  def main(args: Array[String]): Unit = {

    def date = new Date()

    //函数索引
    /**
      * 1.绑定1个参数
      * 2.下划线替换缺失参数
      * 3.把这个新的函数索引给予变量
      *
      * 优化：
      *     解决函数参数列表
      *       重复传入相同参数
      */
    def logWithoutDate = log(date,_:String)

    Thread.sleep(1000)
    logWithoutDate("1")

    Thread.sleep(1000)
    logWithoutDate("2")

    Thread.sleep(1000)
    logWithoutDate("2")
  }

  def log(date:Date,message:String) = {
    println(date + message)
  }
}
