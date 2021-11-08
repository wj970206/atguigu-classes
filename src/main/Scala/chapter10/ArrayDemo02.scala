package chapter10

/**
 * @Auther:weijian
 * @Date:2021/10/28-10-28-21:28
 * @Description:chapter10
 * @version:1.0
 */
object ArrayDemo02 {
  def main(args: Array[String]): Unit = {
    //使用的是object array的apply
    //2. 直接初始化数组，这时因为你给了 整数和 "", 这个数组的泛型就Any
    //3. 遍历方式一样

    var arr02=Array[Any](1,2,3)
    arr02(2)="hello"

    println(arr02)


    for(i<-arr02){
      println(i)
    }

    for(i<- 0 to  arr02.length-1){
      println(arr02(i))
    }

    val arr=Array.ofDim[Int](1,2)


    println(arr)
    for(i<-arr){
      for(j<-i){
        println(j)
      }

    }
  }
}
