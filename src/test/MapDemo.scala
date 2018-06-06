package test

object MapDemo extends ListOperater{

  var m1 : Map[String, String] = Map()

  def main(args: Array[String]): Unit = {

    init()

    add()

    delete()

    update()

    select()
  }

  override def init(): Unit = {

    m1 = Map("k1"->"v1","k2"->"v2")
  }

  override def add(): Unit = {

    m1=m1.+(("k3","v3"),("k4","v4"))
  }

  override def delete(): Unit = {

    m1=m1.-("k1","k2")
  }

  override def update(): Unit = {

    m1=m1.updated("k1","v1")
  }

  override def select(): Unit = {

    m1.foreach(map=>println(map))

  }
}
