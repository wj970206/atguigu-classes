package chapter04

/**
 * @Auther:weijian
 * @Date:2021/10/3-10-03-22:36
 * @Description:chapter04
 * @version:1.0
 */
object ForDouble {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 10;j=i*2-1){
      println(j)
    }

    for(i<-1 to 10){
      var j=i*2-1
      println(j)
    }

    //步长for
    for(i<- Range(1,33,3)){
      println(i)
    }

    var a=1
    for(i<- 1 to 33){
      if(i-a==3){
        a=i
        println(i)

      }
    }

    //说明 val res = for(i <- 1 to 10) yield i 含义
    //1. 对1 to 10 进行遍历
    //2. yield i 将每次循环得到i 放入到集合Vector中，并返回给res
    //3. i 这里是一个代码块，这就意味我们可以对i进行处理
    //4. 下面的这个方式，就体现出scala一个重要的语法特点，就是将一个集合中个各个数据
    //    进行处理，并返回给新的集合

    val res=for(i<- 1 to 10) yield {
      if(i%2==0){
        i
      }else{
        " "
      }
    }
    println(res)
    val res1=for(h<- 1 to 10) yield h
    println(res1)
    var i=0
    while(i<=10){
      println("上学")
      i+=1
    }
  }
}
