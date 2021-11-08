package charpter03

/**
 * @Auther:weijian
 * @Date:2021/9/28-09-28-20:54
 * @Description:charpter03
 * @version:1.0
 */
object Exercises01 {
  def main(args: Array[String]): Unit = {
    //假如还有97天放假，问：xx个星期零几天
    val days=97
    val week=days/7
    val day=days%7
    println(s"还有${week}星期零${day}天放假")


    //有两个变量，a和b，不使用中间变量交换值
    var a=20
    var b=30
    a=a+b
    b=a-b
    a=a-b


  }
//  def change(a:Int,b:Int):Unit={
//    a=a+b
//    b=a-b
//    a=a-b
//    return(a,b)
//  }
}
