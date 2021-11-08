package chapter05

/**
 * @Auther:weijian
 * @Date:2021/10/5-10-05-17:33
 * @Description:chapter05
 * @version:1.0
 */
object FunDetail {
  def  mysqlCon(add:String="广东省茂名市",phone:String="15229630346"): Unit ={
    //定义方法时，输入的参数可以预定义，调用参数时可以更改
    println(add)
    println(phone)

  }


  def sayOk(name:String="jack"):String={
    return name+"ok"
  }

  def f1(n1:Int): Int ={
    if(n1>=10){
      n1
    }else{
      10
    }
  }
  //形参列表和返回值列表的数据类型可以是值类型和引用类型
  def test01(n1:Int,t1:tiger): Unit ={
    println("编号为"+n1+"的老虎的名字为"+t1.name)
  }

  //编写一个函数sum ,可以求出  1到多个int的和
  def sum(num:Int*)={
    var sum=0
    for(i<- num){
      sum+=i
    }
    sum
  }
  def main(args: Array[String]): Unit = {
    mysqlCon(add="广东省东莞市")
    mysqlCon(phone = "15119630346",add = "广东省高州市")
    mysqlCon("广东省五华县")
    println(sayOk("jason"))
    println(f1(100))
    var t1:tiger=new tiger
    t1.name="张三"
    println(sum(1,2,3,4,5))
    test01(19,t1)

    test01(20,new tiger{
      name="李四"
    })
  }
}

class tiger{
  var name=""
}
