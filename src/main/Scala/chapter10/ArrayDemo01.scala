package chapter10

/**
 * @Auther:weijian
 * @Date:2021/10/28-10-28-21:23
 * @Description:chapter10
 * @version:1.0
 */
object ArrayDemo01 {
  def main(args: Array[String]): Unit = {
    //创建一个array对象，[Int]表示泛型，只能存Int，[Any]表示可以存任何类型的
    //在没有赋值情况下，各个元素为0
    var arr01=new Array[Int](5)
    println(arr01.length)
    arr01(0)=1
    arr01(2)=5
    arr01(3)=6
    arr01(4)=1

    for(i<- arr01){
      println(i)
    }
    println(arr01.length)
  }
}
