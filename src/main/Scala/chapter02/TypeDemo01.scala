package chapter02

/**
 * @Auther:weijian
 * @Date:2021/9/27-09-27-22:55
 * @Description:chapter02
 * @version:1.0
 */
object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    var num1: Int = 10
    //因为Int 是一个类，因此他的一个实例，就是可以使用很多方法
    //在scala中，如果一个方法，没有形参，则可以省略()
    println(num1.toDouble + "\t" +num1.toString +"\t" +100.toDouble)


    var isPass = true //
    println(isPass.toString)


    var num=1.2
    var num2=1.7f

    //num2=num error
    num2=num.toFloat

  }
}
