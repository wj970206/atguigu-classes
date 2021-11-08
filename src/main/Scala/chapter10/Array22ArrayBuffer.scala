package chapter10

import scala.collection.mutable.ArrayBuffer

/**
 * @Auther:weijian
 * @Date:2021/10/16-10-16-10:53
 * @Description:chapter10
 * @version:1.0
 */
object Array22ArrayBuffer {
  def main(args: Array[String]): Unit = {
    //scala中的ArrayBuffer相当于java中的ArrayList
    //Array数组
    val arr2=ArrayBuffer[Int]()
    arr2.append(1,2,3)
    arr2.append(4,5)
    println(arr2)

    //ArrayBuffer转成Array方法：arr2.toArray
    //arr2本身没有任何变化
    val arr3=arr2.toArray
    println(arr3)

    //Array转成ArrayBuffer
    val arr41=1
    val arr4=Array(1,2,3)
    arr4.toBuffer
    println(arr4.isInstanceOf[Int])



    //
  }
}
