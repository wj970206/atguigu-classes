package chapter06.method

/**
 * @Auther:weijian
 * @Date:2021/10/8-10-08-21:41
 * @Description:chapter06.method
 * @version:1.0
 */
object MethodDemo02 {
  def main(args: Array[String]): Unit = {
    var a1=new MethodExec
    a1.width=2.3
    a1.len=3.4
    var are:scala.Double=a1.area()
    println(are)
  }
}

class MethodExec{
  //属性
  var len=0.0
  var width=0.0

  //计算面积的方法
  def area():Double= {
    (this.len*this.width).formatted("%.2f").toDouble
  }
}
