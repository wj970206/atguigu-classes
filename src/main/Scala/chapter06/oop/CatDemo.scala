package chapter06.oop

/**
 * @Auther:weijian
 * @Date:2021/10/8-10-08-21:16
 * @Description:chapter06.oop
 * @version:1.0
 */
object CatDemo {
  def main(args: Array[String]): Unit = {
      val cat=new Cat
      cat.name="小花"
      cat.age=18
      cat.color="green"

    println(s"猫的信息如下，名字为${cat.name},年龄为${cat.age},吃的鱼的名字为${cat.fishName}")

  }
}

//定义一个类Cat
//一个class Cat 对应的字节码文件只有一个 Cat.class ,默认是public
class Cat{
  var name:String=""
  var age:Int=_  // _ 表示给age 一个默认的值(必须指定类型) ，如果Int 默认就是0
  var color:String="red"
  var fishName=new Fish{
    name="张三"
  }.name


}
class Fish{
  var name=""

}