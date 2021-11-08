package chapter05

/**
 * @Auther:weijian
 * @Date:2021/10/9-10-09-21:58
 * @Description:chapter05
 * @version:1.0
 */
object Execise {
  def main(args: Array[String]): Unit = {
    println(bozi(7))
    println(test(3))
  }
  def bozi(n1:Int):Int={
    if(n1==1||n1==2){
      return 1
    }else{
      bozi(n1-1)+bozi(n1-2)
    }
  }
  def test(n1:Int):Int={
    if(n1==1){
      return 3
    }else{
      2*test(n1-1)+1
    }
  }
}
