package chapter06.Constructor

/**
 * @Auther:weijian
 * @Date:2021/10/9-10-09-15:35
 * @Description:chapter06.Constructor
 * @version:1.0
 */
object demo1 {
  def main(args: Array[String]): Unit = {
    var dog1=new dog
    dog1.name="zhangsan"
    dog1.age=18
    dog1.totring()

    var dog2=new dog{
      name="lisi"
      age=19

    }
    dog2.totring()

    var dog3=new dog("wangwu")
    dog3.totring()

    var dog4=new dog("liuliu",10)
    dog4.totring()
  }
}

class dog{//Scala中的主构造器是在类名后，即class dog(){ ,隐式了
  var name:String=null
  var age=20
  val adress="中山" // val修饰的关键字，创建对象时不可更改
  def totring():Unit={
    println(this.name+""+this.age+this.adress)
  }
  def this(Inname:String)={
    this//this即为主构造器
    name=Inname
  }
  def this(InName:String,Inage:Int)={
    this
    name=InName
    age=Inage
  }
  def this(age:Int)={
    this
    this.age=age
  }
}
