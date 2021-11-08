package chapter10

import scala.collection.mutable.ArrayBuffer

/**
 * @Auther:weijian
 * @Date:2021/10/28-10-28-21:12
 * @Description:chapter10
 * @version:1.0
 */
object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {
    //创建ArrayBuffer
    val arr01=ArrayBuffer[Any](1,2,3,"hello")

    //访问和查询集合
    //通过下标访问元素
    println("arr01[2]="+arr01(2))
    println(arr01.length)

    //遍历
    for(i<- arr01){
      println(i)
    }

    println(arr01.hashCode())
    println(arr01(2).hashCode())

    //修改值，动态增加值
    //使用append追加数据，append支持可变参数
    arr01.append(4)
    arr01.append(5)
    arr01.append(5)
    println(arr01.length)
    for(i<-arr01){
      println(i)
    }

    arr01.distinct
    arr01(2)=99
    for(i<-arr01){
      println(i)
    }


    //删除元素
    arr01.remove(2)
    println(arr01(2))

  }
}
