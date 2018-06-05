package test

object ForDemo {

  def main(args: Array[String]): Unit
  =
  {
    //test1

    test2

  }

  private def test2 = {
    for (i <- 1 to 9; j <- 1 to i; sp = if (i == j) "\n" else "\t") {

      print(i + "+" + j + "=" + j * j + sp)
    }
  }

  private def test1 = {
    for (i <- 1 to 9) {

      for (j <- 1 to i) {

        print(i + "+" + j + "=" + j * j + "\t")
      }
      println()
    }
  }
}
