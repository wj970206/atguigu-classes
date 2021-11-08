package charter01

/**
 * @Auther:weijian
 * @Date:2021/9/25-09-25-22:24
 * @Description:charter01
 * @version:1.0
 */
object ScalaVariable {
  def main(args: Array[String]): Unit = {
    //程序中加号的使用
    var b=2+"hello"
    var c=2+3
    println(b) //2hello
    println(c)  //35

    //数据类型
    var num1=10
    println(num1.toDouble+"\t"+num1.toString+"\t")
  }
}
