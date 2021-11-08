package chapter05

/**
 * @Auther:weijian
 * @Date:2021/10/5-10-05-22:54
 * @Description:chapter05
 * @version:1.0
 */
object ThrowDemo {
  def main(args: Array[String]): Unit = {
    //如果我们希望在test() 抛出异常后，代码可以继续执行，则我们需要处理
    try{
      test()
    }catch {
      case ex:Exception=>{
        println("捕获到异常"+ex.getMessage)
      }

      case ex:ArithmeticException=> println("得到一个算数异常")
    }finally {
      println("hello,我是张三")
    }
  }
  def test():Nothing={
    throw new ArithmeticException("算数异常")
  }
}
