package chapter10

/**
 * @Auther:weijian
 * @Date:2021/10/30-10-30-15:18
 * @Description:chapter10
 * @version:1.0
 */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    //创建
    //说明： 1.tuple 就是一个Tuple 类型是Tuple5
    // 为了高效的操作元组，编译器会根据元素个数的不同，对应不同的元组类型

    val t1=(1,2,3,"hello",2.3)
    println(t1._1)
    //访问元组，是从1开始的
    //如果想从0开始，则用方法productElement
    println(t1.productElement(0))


    //遍历元组
    //遍历元组, 元组的遍历需要使用到迭代器
    println("遍历元组======================")
    for(i<-t1.productIterator){
      println(i)
    }

  }
}
