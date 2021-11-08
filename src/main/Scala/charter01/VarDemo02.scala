package charter01

/**
 * @Auther:weijian
 * @Date:2021/9/27-09-27-22:01
 * @Description:charter01
 * @version:1.0
 */
object VarDemo02 {
  def main(args: Array[String]): Unit = {
    //类型推导
    var num=10
    println(num.isInstanceOf[Float])
    //isInstanceOf方法： 判断变量的类型是否是参数表示的变量
    //类型确认后，类型不可更改，值可改除非用方法更改
    //num=23.2 如这样会报错
    num.toDouble

    val A=20
    //A=30 val修饰的变量值不可更改，但可以修改对象内部的值
    val dog=new Dog{
      age=18
      name="haha"
    }
    dog.name="旺财"
    println(dog.name)
  }
  class Dog{
    var age:Int=0
    var name:String=""

  }
}
