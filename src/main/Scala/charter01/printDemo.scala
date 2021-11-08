package charter01

/**
 * @Auther:weijian
 * @Date:2021/9/27-09-27-22:14
 * @Description:charter01
 * @version:1.0
 */
object printDemo {
  def main(args: Array[String]): Unit = {
    var a=4
    println(s"${a+111}")

    val str1="hello"
    val str2:String="world"

    println(str1+str2)
    println(str1+"\t"+str2)

    var name="dengweijian"
    var long="18"
    var age=18
    var like="pingpong"
    println("名字="+name,"年龄="+age)
    println(s"个人信息如下：\n 名字=$name \n 年龄=$age")
  }
}
