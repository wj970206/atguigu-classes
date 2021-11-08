package chapter04

/**
 * @Auther:weijian
 * @Date:2021/10/3-10-03-22:21
 * @Description:chapter04
 * @version:1.0
 */
object doWhile {
  def main(args: Array[String]): Unit = {
    var i=1
    do{
      println(i)
      i+=1
    }while(i<1)
  }
}
