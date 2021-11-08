package charter01

/**
 * @Auther:weijian
 * @Date:2021/9/27-09-27-22:10
 * @Description:charter01
 * @version:1.0
 */
object Comment {
  def main(args: Array[String]): Unit = {
    println("hello,world")
    println(sum(2, 3))
    println(-10/3)
  }
//ctrl+alt+l 对代码进行格式化的快捷键
  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

}
