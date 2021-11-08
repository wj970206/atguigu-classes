package chapter02

/**
 * @Auther:weijian
 * @Date:2021/9/27-09-27-22:32
 * @Description:chapter02
 * @version:1.0
 */
object Demo2 {
  def main(args: Array[String]): Unit = {
    var num1:Int=10*3.2.toInt+6 //36   //执行顺序为3.2先执行方法再乘10
    var num2:Int=(10*3.5+7*1.5).toInt

    println(num1)

    var num3:Int=12.5.toInt
    println(num3)

    val s4="12.5"

    //println(s4.toInt) 错误，因为不是讲小数点后的数据进行截取，而是会抛出异常
    println(s4.toDouble)

    var s5=12.5
    println(s5.toInt)
  }
}
