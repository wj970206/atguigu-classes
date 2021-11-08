package chapter06.oop

/**
 * @Auther:weijian
 * @Date:2021/10/8-10-08-21:27
 * @Description:chapter06.oop
 * @version:1.0
 */
class CreateObj {
  def main(args: Array[String]): Unit = {
     val p1=new Person
     p1.name="jack"
     p1.age=10


  }
}
class Person{
    var name=""
    var age:Int=_  //如果是用 _ 方式给默认值，则属性必须指定类型

}
