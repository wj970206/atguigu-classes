package chapter05

/**
 * @Auther:weijian
 * @Date:2021/10/5-10-05-15:54
 * @Description:chapter05
 * @version:1.0
 */
object FunDemo {
  def main(args: Array[String]): Unit = {
    val a1=10
    val a2=90
    println("res="+getRes(a1,a2,'+'))
    println(sum(1,2))
  }
  //方法加Unit表示方法没有返回值，所以返回为（），
  // 没有规定返回值类型，则会默认返回最后的结果，且不能加return关键字
  def getRes(n1:Int,n2:Int,oper:Char) ={
    if(oper=='+'){
      n1+n2
    }else if(oper=='-'){
      n1-n2
    }else{
      null
    }
  }

  def sum(n1:Int,n2:Int): Int ={
    n1+n2
  }
}
