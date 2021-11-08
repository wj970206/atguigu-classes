package chapter04

/**
 * @Auther:weijian
 * @Date:2021/10/3-10-03-17:24
 * @Description:chapter04
 * @version:1.0
 */
object ContinueDemo {
  def main(args: Array[String]): Unit = {
    //说明
    //1. 1 to 10
    //2. 循环守卫 if(i != 2 && i !=3) 这个条件为true，才执行循环体
    // 即当i==2 或者 i==3时，跳过
    for(i <- 1 to 30 if(i!=2 && i!=3)){
      println(s"i=${i}")
    }
  }
}
