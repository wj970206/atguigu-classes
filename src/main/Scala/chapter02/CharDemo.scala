package chapter02

/**
 * @Auther:weijian
 * @Date:2021/9/27-09-27-22:39
 * @Description:chapter02
 * @version:1.0
 */
object CharDemo {
  def main(args: Array[String]): Unit = {
    var char1:Char=98
    //当我们输出一个char类型是，他会输出该数字对应的字符(码值表 unicode)//unicode 码值表包括ascii
    println(char1)

    var char2:String="a"
    var char3:Char='a'
    //字符单引号，字符串双引号
    println(10+char3)
    println(10+char2)

//    var c2:Char='a'+1
//    var c3:Char=97+1
//    var c4:Char=98
//    var c5:Char=b
    //Char类型的变量，数字字符可忽略‘’
    ////原因和分析
    //    //1. 当把一个计算的结果赋值一个变量，则编译器会进行类型转换及判断（即会看范围+类型）
    //    //2. 当把一个字面量赋值一个变量，则编译器会进行范围的判定
  }
}
