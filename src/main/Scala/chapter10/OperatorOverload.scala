package chapter10

/**
 * @Auther:weijian
 * @Date:2021/10/30-10-30-14:29
 * @Description:chapter10
 * @version:1.0
 */
object OperatorOverload {
  def main(args: Array[String]): Unit = {
    var cat=new Cat{
      age=20
    }
    cat 呵呵 "dengweijian" //呵呵为方法名，dengweijian为输入参数
    println(cat.name) //dengweijian

    cat.+(20)
    println(cat.age)

    var cat1=new Cat
    cat1++10
    //scala中，类里面可以直接定义名 符号 组成的方法，且该方法目的为给类内的某个变量赋值
    //则调用该方法时，可以忽略 .
    println(cat1.age)
    cat1+20
    println(cat1.age)
    cat1.++(30)
    println("cat1.age="+cat1.age)

    var cat4=new Cat
    cat4 nameAddAge("lisi",1)
    println(cat4.name)
  }

}
class Cat{
  var long=0
  var age=0
  var name=""
  def +(N:Int): Unit ={
    this.long+=N
  }
  def ++(n:Int): Unit ={
    this.age+=n
  }

  def 呵呵(name:String): Unit ={
    this.name=name
  }
  def nameAddAge(n1:String,n2:Int): Unit ={
    this.name=n1
    this.age=n2
  }

}
