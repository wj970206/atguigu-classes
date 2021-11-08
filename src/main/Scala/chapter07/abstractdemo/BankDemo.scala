package chapter07.abstractdemo

/**
 * @Auther:weijian
 * @Date:2021/10/25-10-25-22:23
 * @Description:chapter07.abstractdemo
 * @version:1.0
 */
object BankDemo {
  def main(args: Array[String]): Unit = {

  }

  //编写一个Account类
  class Account(inAccount:String,inBalance:Double,inPwd:String){
    /*
    属性：账号，余额，密码
    方法：查询，取款，存款

     */

    private val accountNo=inAccount
    private var balance=inBalance
    private var pwd=inPwd


  }
}
