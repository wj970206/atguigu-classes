package testGit

/**
 * @Auther:weijian
 * @Date:2021/11/9-11-09-7:39
 * @Description:testGit
 * @version:1.0
 */
object testBranch {
  def main(args: Array[String]): Unit = {
    println("this is branch")
    println("this is branch")
  }
  def method1(): Unit ={
    println("method1")
  }
  def method2(): Unit ={
    println("branch2.method2")
  }
  def branch: Unit ={
    println("add branch2 method2")
  }
  def method3(): Unit ={
    println("method3")
  }
  def method4: Unit ={
    println("method4")
  }
  def method5: Unit ={
    println("branch2.5")
  }
}
