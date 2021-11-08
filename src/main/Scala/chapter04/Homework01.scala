package chapter04

/**
 * @Auther:weijian
 * @Date:2021/9/28-09-28-21:19
 * @Description:chapter04
 * @version:1.0
 */
object Homework01 {
  def main(args: Array[String]): Unit = {
    var num=0
    //求100以内的数的总和
    for(i<- 1 to 100){
      num=num+i
    }
    println(num)

    var num2=0
    for(i<- 1 until 100){//1到99
      num2=num2+i
    }
    println(num2)

    var num3=0
    var loop=true
    for(i<- 1 to 100 if loop == true){
      num3=num3+i
      if(num3>=20){
        loop=false
      }
    }
    println(num3)

  }

}
