package chapter08

/**
 * @Auther:weijian
 * @Date:2021/10/27-10-27-20:16
 * @Description:chapter08
 * @version:1.0
 */
//隐式转换
object test {
  def main(args: Array[String]): Unit = {

    implicit def f1(d:Double):Int={
      d.toInt
    }
    val n:Int=3.5
    //高精度转低精度需要用toInt方法
    //如果想要变量隐式转换
    //隐式转换函数是以implicit关键字声明的带有单个参数的函数。
    // 这种函数将会 自动应用，将值从一种类型转换为另一种类型
    //隐式转换函数的函数名可以是任意的，隐式转换与函数名称无关，只与 函数签名（函数参数类型和返回值类型）有关。
    //隐式函数可以有多个(即：隐式函数列表)，但是需要保证在当前环境下， 只有一个隐式函数能被识别
    val n2:Int=3.4
    implicit def f2(d:Double):Float={
      d.toFloat
    }

    //隐式转换还可以丰富类库的功能
    implicit def addDelete(n:MySQL):DB={
      new DB
    }
    val mysql:DB=new MySQL
    mysql.delete()

    //隐式值
    //隐式值也叫隐式变量，将某个形参变量标记为implicit，
    // 所以编译器会在方法 省略隐式参数的情况下去搜索作用域内的隐式值作为缺省参数
    //也即当某个变量被implicit修饰后，方法中有implicit修饰的和刚刚的变量同类型的输入变量的话，该方法该参数的值等于那个
    implicit val name:String="张三"
    implicit val age=189.2.toInt
    def hello(implicit inname:String): Unit ={
      println("hello"+" "+inname)
    }

    def hello3(implicit inname:String="李四"): Unit ={
      println("hello"+" "+inname)//输出结果仍为张三
    }
    def hello2(implicit inage:Int): Unit ={
      println("hello"+" "+inage)
    }

//    implicit val hight:Int=10
//    def hight1(implicit tall:Double): Unit ={
//      println(tall)
//    }
//    hight1   方法hight1内implicit修饰的参数方法外没有与之类型匹配的implicit变量，故报错


    hello
    hello2
    hello3

  }






}

class MySQL{
  def insert(): Unit ={
    println("insert")
  }
}

class DB{
  def delete(): Unit ={
    println("delete")
  }
}
