package charter01

/**
 * @Auther:weijian
 * @Date:2021/9/25-09-25-22:06
 * @Description:charter01
 * @version:1.0
 */
object ScalaPutOutWay {
  def main(args: Array[String]): Unit = {
    //使用加号
    var name:String="tom"
    var sallay=1.2
    println("hello"+name+sallay)
    println("hello"+name+s"${sallay+1}")


    //使用$引用的方式，输出变量
    println(s"第三种方式 name=$name sallay=${sallay+1}")
  }
}
