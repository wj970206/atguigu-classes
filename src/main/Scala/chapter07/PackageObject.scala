package com.atguigu

/**
 * @Auther:weijian
 * @Date:2021/10/10-10-10-22:36
 * @Description:chapter07
 * @version:1.0
 */
//每个包都可以有一个包对象
//包对象定义时名字与包相同，且前面用object修饰
//包内可以有对象和类，但不能有方法和属性，所有引入包对象解决
//
package object scala{
  var dadname="jack"
  def sayOk(): Unit ={
    println(dadname+"say ok")
  }
}
package scala{
  //var name=""  报错，包内不能有直接的属性和方法

  class person{
    var age=19
    var name=dadname
    def dadSay: Unit ={
      sayOk()
    }
  }
  object test{
    def main(args: Array[String]): Unit = {
      var p1=new person
      println(p1.name)
      println(p1.age)
      p1.dadSay
    }
  }
}
