package test

class ArrayDemo {

}

object ArrayDemo{

  def main(args: Array[String]): Unit = {

    val a4 = Array.iterate(0,10)(_+100)
    a4.foreach(println(_))
  }


}
