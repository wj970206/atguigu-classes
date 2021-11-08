package chapter06.Constructor

/**
 * @Auther:weijian
 * @Date:2021/10/8-10-08-21:09
 * @Description:chapter06
 * @version:1.0
 */
object ConDemo01 {
  def main(args: Array[String]): Unit = {

  }
}
class Person(inName:String,inAge:Int){
  var name:String=inName
  var age:Int=inAge
  age+=10
  println("-----")

  //重写了toString，便于输出对象的信息
  override def toString:String={
     "name="+this.name + "\t" +"age="+this.age
  }


}