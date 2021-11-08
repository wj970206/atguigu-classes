package charpter03
import scala.io.StdIn
/**
 * @Auther:weijian
 * @Date:2021/9/28-09-28-21:04
 * @Description:charpter03
 * @version:1.0
 */
object Inputcon {
  def main(args: Array[String]): Unit = {
    /*
    要求：可以从控制台接收用户信息
     */
    println("请输入姓名")
    val name=StdIn.readLine()

    println("请输入年龄")
    val age=StdIn.readInt()

    println("请输入薪水")
    val salary=StdIn.readFloat()

    println(s"该用户叫${name}，他的年龄为${age},他年薪${salary*13},好有米")

  }

}
