package charpter03

/**
 * @Auther:weijian
 * @Date:2021/9/28-09-28-20:37
 * @Description:charpter03
 * @version:1.0
 */
//charpter3为运算符的使用
object Demo01 {
  def main(args: Array[String]): Unit = {
    // /的使用
    var r1:Int=10/3
    println("r1="+r1)

    var r2:Double=10/3
    println("r2="+r2)  //3.0
    //整数除整数，得整数
    //小数除整数，如果输出类型为Double，结果为小数
    var r3:Double=10.0/3 //3.3333
    var l:Int=(10.3/3).toInt
    //var r4:Int=10.0/3  错误，Double结果不能这样转Int
    var r4:Int=(10.0/3).toInt  //除非调用toInt方法

    // %的使用
    // %的运算法则： a%b=a-a/b*b
    println(10%3) //1
    println(10%3.0) //1.0
    println(-10%3) //-1
    println(10 % -3) //

    //scala没有++，--
    //++用+=1代替，--用-=1代替

    // scala没有三元表达式
    val num=if(10>9) 10 else 9
    println()
  }
}
