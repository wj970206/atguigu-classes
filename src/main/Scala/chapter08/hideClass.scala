package chapter08

/**
 * @Auther:weijian
 * @Date:2021/10/27-10-27-21:22
 * @Description:chapter08
 * @version:1.0
 */
object hideClass {
  def main(args: Array[String]): Unit = {
    //同样可以扩展类的功能，比隐式转换丰富类库功能更方便
    //隐式类有如下特点：
    //    1.构造参数有且只能由一个。 2.隐式类不能是顶级的。 即必须定义在 类 或 伴生对象 或包对象里
    //    3.隐式类不能是case class.  4.作用域内不能有与之相同名称的标识符


    //DB1对应生成隐式类
    implicit class DB1(val m:Mysql1){
      def addSuffix():String={
        m+"scala"
      }
    }
    val test=new Mysql1
    test.sayOk()

  }
}

class Mysql1{
  def sayOk():Unit={
    println("sayok")
  }
}
