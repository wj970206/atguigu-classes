package chapter12

import scala.io.StdIn

/**
 * @Auther:weijian
 * @Date:2021/10/31-10-31-21:41
 * @Description:chapter12
 * @version:1.0
 */
object Match {
  def main(args: Array[String]): Unit = {
    //scala中的模式匹配类似于Java中的switch语法，但是更加强大
    //模式匹配语法中，采用match关键字声明，每个分支采用case关键字进行声 明，
    // 当需要匹配时，会从第一个case分支开始，
    // 如果匹配成功，那么执行对 应的逻辑代码，如果匹配不成功，继续执行下一个分支进行判断。
    // 如果所有 case都不匹配，那么会执行case _ 分支，类似于Java中default语句。

    //1.match ===================================
    // Switch的简单回顾 // Java int i = 1;
    // switch ( i ) {
    //       case 0 :
    //            break;
    //       case 1 :
    //            break;
    //       default : break
    // }
    // scala的模式匹配，类似于java的switch语法
    println("请输入运算符号")
    val oper=StdIn.readChar()
    val n1=20
    val n2=10
    var res=0
    oper match{
      case '+'=>res=n1+n2
      case '-'=>res=n1-n2
      case '*'=>res=n1*n2
      case '/'=>res=n1/n2
      case _=>println("oper error")
    }
    println("res="+res)
    //match detail
    // 1.when all the case are not suitted,then it will execute the branch of case _,
    //    like the default statement of java
    // 2.if all the case are not suitted and there is not case _ branch ,then it will throw the MatchError
    // 3.every case,if not use break statement,they will break the case automatically
    // 4.we can use another type in case statement,not just the char
    // 5.=> can be counted(看作) as java switch


    //2.守卫 guard(ps:动词 守卫 为defend ====================
    // recommend(介绍）：if you want to express the data of some scope,that you need to add conditions of guard in match suit
    for(ch <- "+-3!"){

    }
  }
}
