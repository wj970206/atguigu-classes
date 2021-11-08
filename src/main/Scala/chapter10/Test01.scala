package chapter10

/**
 * @Auther:weijian
 * @Date:2021/10/30-10-30-17:35
 * @Description:chapter10
 * @version:1.0
 */
object Test01 {
  def main(args: Array[String]): Unit = {
    val list=List(1,2,3)
    var list2=List[Int]()

    for(i<-list){
      if(i%2==0){
        list2=i*2 :: list2
      }else{
        list2=i:: list2
      }

    }
    var list3=list.map(x2)
    println("list3="+list3)


    println(list2)
  }
  def x2(in:Int):Int={
    in*2
  }
}
