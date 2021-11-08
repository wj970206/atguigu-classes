package chapter06

import scala.beans.BeanProperty

/**
 * @Auther:weijian
 * @Date:2021/10/6-10-06-19:08
 * @Description:chapter06
 * @version:1.0
 */
object BeanPropertDemo {
  def main(args: Array[String]): Unit = {
     val car=new Car
     car.setName("hanhan")
     println(car.name)

    val car2=new Car
    car2.name="hahaha"
    println(car2.name)
  }
}

class Car{
  //使用 @BeanProperty 自动生成 getXxx 和 setXxx
  @BeanProperty var name:String=null
}
