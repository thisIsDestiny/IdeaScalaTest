package test

class FuncDemo {

  def add1(n1:Int,n2:Int):Int={return n1+n2}
  def add2(n1:Int,n2:Int):Int={n1+n2}
  def add3(n1:Int,n2:Int)={n1+n2}
  (n1:Int,n2:Int)=>{n1+n2}
  (n1:Int,n2:Int)=>n1+n2
}


object FuncDemo{

  def return_func():()=>Int={
    return ()=>2
  }

  def main(args: Array[String]): Unit = {

//    println(new FuncDemo().add1(1,2))
//    println(new FuncDemo().add2(1,2))
//    println(new FuncDemo().add3(1,2))

//    println(return_func())
//    print(return_func()())

    hjif(1)({2*_},{println(_)})

    //HJ_if(1>2){println()}{println()}
  }

  def hjif(a1:Int)(z:(Int)=>Int,f:(Int)=>Unit){

    f(z(a1))
  }

  def HJ_if(condition:Boolean)(true_body:()=>Unit)(false_body:()=>Unit){

    if(condition){
      true_body()
    }
    else{
      false_body()
    }
  }

}