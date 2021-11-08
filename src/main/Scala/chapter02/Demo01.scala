package chapter02

/**
 * @Auther:weijian
 * @Date:2021/9/27-09-27-22:25
 * @Description:chapter02
 * @version:1.0
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    val n1:Int=10

    //小数默认Double类型，如果想是float类型，得在变量后加上f或者F
    val n2:Float=2.1f

    //有多种类型的数据混合运算时，会向高的类型转换
    var n3:Int=2
    //var n4:Byte=n3//错误
  }
}
