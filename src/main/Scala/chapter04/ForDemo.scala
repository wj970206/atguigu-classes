package chapter04

import scala.io.StdIn

/**
 * @Auther:weijian
 * @Date:2021/10/3-10-03-22:23
 * @Description:chapter04
 * @version:1.0
 */
object ForDemo {
  def main(args: Array[String]): Unit = {
    //输出10句 "hello,尚硅谷!"
    println("请输入开始数")
    val start=StdIn.readInt()
    println("请输入结束数")
    val end=StdIn.readInt()
    for(i<- start to end){
      println("hello,尚硅谷")
    }

    //说明for 这种推导时，也可以直接对集合进行遍历
    var list=List("hello","hi",10,3)
    for(i<- list){
      println("i="+i)
    }

    /*
   for循环练习题(学员先做)

 打印1~100之间所有是9的倍数的整数的个数及总和.
 完成下面的表达式输出

    */
    var sum9=0
    var sum=0
    for(i<-1 to 100){
      if(i%9==0){
        sum+=1
        sum9+=i
      }
    }

    println("9的倍数的整数的个数="+sum)
    println("9的倍数的整数的总数="+sum9)


    for(i<- 1 to 10 if i%2!=0){
      println(i)
    }
  }
}
