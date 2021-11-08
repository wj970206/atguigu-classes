package chapter06.homework

/**
 * @Auther:weijian
 * @Date:2021/10/9-10-09-10:50
 * @Description:chapter06.homework
 * @version:1.0
 */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    var str="Hello"
    var substr1=str.take(1)
    var substr2=str.charAt(0)

    var dog=new Dog{
      name="旺财"
      age=3
      weight=60.1
    }
    var dogMessage=dog.say()
    println(dogMessage)
  }
}

/*
小狗案例

编写一个Dog类，包含name(String)、age(Int)、weight(Double)属性
类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。

在另一个DogCaseTest类中的main方法中，创建Dog对象，并访问say方法和所有属性，将调用结果打印输出。

 */
class Dog{
  var name=""
  var age=0
  var weight=0.0
  def say():String={
    "小狗的信息如下：name="+this.name+"age="+this.age + "weight="+ this.weight
  }
}
