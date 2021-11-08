package chapter06.method

/**
 * @Auther:weijian
 * @Date:2021/10/8-10-08-21:35
 * @Description:chapter06.method
 * @version:1.0
 */
object MethodDemo01 {
  def main(args: Array[String]): Unit = {
    var dog=new Dog
    var sum=dog.cal(10,21)
    println(sum)
  }
}
class Dog{
  private var sal:Double=_
  var food:String=_
  //方法
  def cal(n1:Int,n2:Int)={
    n1+n2
  }
}