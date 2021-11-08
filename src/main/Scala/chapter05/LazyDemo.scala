package chapter05

/**
 * @Auther:weijian
 * @Date:2021/10/5-10-05-23:00
 * @Description:chapter05
 * @version:1.0
 */
object LazyDemo {
  def main(args: Array[String]): Unit = {
    //lazy修饰的变量必须用val修饰
    lazy val res=sum(19,29,55)
    println("------------")
    println("res="+res)

  }

  def sum(i:Int*)={
    var sum=0
    for(i1<-i){
      sum+=i1
    }
    println("-------执行了")
    sum
  }



}
