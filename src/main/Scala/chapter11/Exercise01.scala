package chapter11

/**
 * @Auther:weijian
 * @Date:2021/10/30-10-30-17:24
 * @Description:chapter11
 * @version:1.0
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    val names=List("Alice","Bob","Nick")
    val names2=names.map(upper)
    println(names2)
  }
  def upper(st:String):String={
    st.toUpperCase
  }
}
