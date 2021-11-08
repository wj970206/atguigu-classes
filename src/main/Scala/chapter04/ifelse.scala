package chapter04
import scala.io.StdIn
////小的技巧，如何查看某个包下包含的内容
//    //1.比如我们想看 scala.io 包有什么内容
//    //2.将光标放在 io上即可，输入ctrl +b
//    //3.将光标放在 StdIn上即可，输入ctrl +b,看的是StdIn源码
/**
 * @Auther:weijian
 * @Date:2021/9/28-09-28-22:07
 * @Description:chapter04
 * @version:1.0
 */
object ifelse {
  def main(args: Array[String]): Unit = {
    println("请输入年龄")
    var age=StdIn.readInt()
    if(age<18){
      watch("动漫")
    }else if(age>18 && age<=30){
      watch("小黄书")
    }else{
      watch("小黄书")
    }

//    scala中任意表达式都是有返回值，ifelse 表达式其实有返回值，返回值看最后的

    var age1 = 7
    var res=if(age1 < 9 ){
      println("hello age > 20")
      9+10
      "yes ok"

    }else{
      7
    }
    println(res)
  }
  def watch(str: String):Unit={
    println("看"+str)
  }
}
