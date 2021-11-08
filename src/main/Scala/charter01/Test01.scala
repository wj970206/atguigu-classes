package charter01

/**
 * @Auther:weijian
 * @Date:2021/9/25-09-25-21:52
 * @Description:charter01
 * @version:1.0
 */
object Test01 {
  def main(args: Array[String]): Unit = {
    println("hello,scala")
    // \t：制表符,类似空格，\n:换行符，\\:一个\，\":一个“
    println("姓名\t年龄")
    println("张\\三丰\nhello,")
    println("正\r一起")

    println("姓名\t年龄\t籍贯\t住址\n")
    println("姓名\t年龄\t籍贯\t住址\n")
    for(i<-1 to 10){

      println(i)
    }

  }
}
