package chapter10

/**
 * @Auther:weijian
 * @Date:2021/10/30-10-30-15:14
 * @Description:chapter10
 * @version:1.0
 */
object SetDemo {
  def main(args: Array[String]): Unit = {
    //Set是最简单的一种集合。集合中的对象不按特定的方式排序，并且没有重复对象。

    val set=Set(1,2,3,3)
    println(set)  //Set(1, 2, 3)
    println(set.hashCode())

    println(set.max)
    println(set.min)

  }
}
