package chapter10

import jdk.nashorn.internal.ir.annotations.Immutable

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * @Auther:weijian
 * @Date:2021/10/30-10-30-14:44
 * @Description:chapter10
 * @version:1.0
 */
object queue {
  def main(args: Array[String]): Unit = {
    //创建队列
    val n1=new mutable.Queue[Int]
    println(n1)

    //给队列增加元素
    n1+=9
    n1+=99
    n1+=999
    n1+=9999
    println(n1) //Queue(9, 99, 999, 9999) 先进先出

    //从队列的头部取出元素
    //head 对队列没影响
    println(n1.head)
    println(n1.head)

    //last
    println(n1.last)


    //dequeue 会对队列产生影响
    println(n1.dequeue())
    println(n1)

  }
}
