package chapter07



/**
 * @Auther:weijian
 * @Date:2021/10/10-10-10-22:22
 * @Description:chapter07
 * @version:1.0
 */
object test {
  def main(args: Array[String]): Unit = {
    import chapter07.test01.person
    var p1=new person
    println(p1.age)
    import chapter07.test02.person
    var p2=new chapter07.test02.person
    println(p2.age)
  }
}
class dog{

}
