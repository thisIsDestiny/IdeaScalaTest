package function

object VariableParams {

  def main(args: Array[String]): Unit = {

    method(1,"123","45","上山打老虎！！！","678","90","老虎沒打到，老鼠在吱吱~~")
  }

  def method(int :Int,strs:String*)={

    for(str <- strs){
      println(str)
    }
  }
}
