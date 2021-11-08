package chapter06.homework

/**
 * @Auther:weijian
 * @Date:2021/10/8-10-08-21:51
 * @Description:chapter06.homework
 * @version:1.0
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {

    val t = {} //
    println("t=" + t + " " + t.isInstanceOf[Unit]) // ()

    //定义List集合
    val list=List(1,2,3)
    println(list.reverse)
    println((1 to 10).reverse)  // Range 10 to 1 by -1
    val res=(1 to 10).reverse
    println("分割线")
    res.foreach(println)
    val n=3
    val res1=(0 to n).reverse  //返回 Range 3 to 0 by -1
    println(res1)

    for(i<- Range(1,22,2)){
      println(i)
    }

    for(i<- Range(10,0,-1)){
      println(i)
    }
    //等同于
    for(i<-0 to 10 reverse){
      println(i)
    }
    var res2=List(1,2,3,2,1)
    // foreach
    // foreach 函数，（f:Int => U），即接收一个输入参数为Int,输出为U的函数
    //说明
    //1. 将res1的每个元素依次遍历出来，传递给println(x)
    //res1.foreach(println)
    //2. 将res1的每个元素依次遍历出来，传递给myShow(x)
    res2.foreach(myshow)

    println(sumUnicode("Hello"))
    println(sumUnicode2("Hello"))
  }
  def myshow(n:Int):Unit={
    println("xxxxxx")
    println(n)
  }

  def sigsum(n1:Int):Int={
    if(n1>0){
      return 1
    }else if(n1==0){
      0
    }else{
      -1
    }
  }


  //求字符串里每个字符的Unicode的乘积和
  def sumUnicode(string1:String):Long={
    var sum:Long=1
    for(i<-string1){
      sum*=i.toLong
    }
    return sum
  }
  //等价于
  def sumUnicode2(s:String):Long={
    if(s.length==1) return s.charAt(0).toLong
    else s.charAt(0).toLong * sumUnicode2(s.drop(1))
    //else s.take(1).charAt(0)  s.take拿出来的是字符串，s.charAt拿出来的是字符

  }
}
