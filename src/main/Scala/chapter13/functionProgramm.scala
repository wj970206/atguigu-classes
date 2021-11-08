package chapter13

/**
 * @Auther:weijian
 * @Date:2021/11/1-11-01-21:22
 * @Description:chapter13
 * @version:1.0
 */
object functionProgramm {
  def main(args: Array[String]): Unit = {

    //1.偏函数 Partial function ==================================
    println("===============偏函数==================")

    //需求：给你一个集合val list=List(1,2,3,4,"abc") 完成要求：
    //demand: give you a collection,then complete the required
    // 1.将集合list中的所有数字加1，并返回一个新的集合
    // 1.take the number of collection list to add 1,then return the new collection
    // 2.要求忽略掉非数字的元素，即返回的新的集合形式为 （2，3，4，5）
    // 2.the required is to ignore the element of non-numeric,means return the new collection ,and the type is like (2,3,4,5)

    // 解决方式-map返回新的集合, 引出偏函数
    //solve methods 1: use map to return the new collection,then leads to bring the partial function
    //思路1-map+fliter方式  method 1: use map and filter way
    val list=List(1,2,3,4,"abc")
    def f1(in:Any):Boolean={
      in.isInstanceOf[Int]
    }
    val list1=list.filter(f1)
    println(list1)

    def add1(in:Int):Int={
      in+1
    }
    def turnInt(in:Any):Int={
      in.asInstanceOf[Int]
    }
    //because when use map to add the element of list to f1 method,it will turn the type from Int to Any
    //then if you use add1 method,it need the type is Int,so need the turnInt method to change type
    val list2=list1.map(turnInt).map(add1)
    println(list2)

    //思路2 模式匹配  method 1： model match
    def modelMatch(in:Any):Any={
      in match {
        case in:Int => in+1
        case _ =>
      }
    }
    val list3=list.map(modelMatch)
    println(list3)

    //啥是偏函数 what　is the partial function
    //1) 在对符合某个条件，而不是所有情况进行逻辑操作时，使用偏函数是一 个不错的选择  when meet a certain condition,instead of doing logic in all cases,partial function is a good choice

    // 2) 将包在大括号内的一组case语句封装为函数，我们称之为偏函数，
    //    它只 对会作用于指定类型的参数或指定范围值的参数实施计算，超出范围的 值会忽略
    //    （未必会忽略，这取决于你打算怎样处理）
    //    see the case statement that included by big  as function,that is the partial function
    //
    // 3) 偏函数在Scala中是一个特质PartialFunction
    // now lets use partialFunction to solve the problem
    val addOne3=new PartialFunction[Any,Int] {
      def isDefinedAt(any:Any)=if(any.isInstanceOf[Int]) true else false
      def apply(any:Any)=any.asInstanceOf[Int]+1
    }
    val list4=list.collect(addOne3) //map方法不得行
    println("list4="+list4)
    //偏函数小结 conclusion of partialFunction
    //1.使用构建特质的实现类 implementation(落实，执行) classes using build attributes 2.partialFunction is a trait特质 3.[Any,Int]是泛型，Any是参数类型，Int是返回参数
    //4.当使用偏函数时，会遍历集合的所有元素，编译器执行流程时先执行isDefinedAt(),为true，执行apply，为false，过滤掉
    //5.map函数不支持偏函数，因为map底层就是循环遍历，无法过滤处理原来集合的元素  6.collect函数支持偏函数

    //偏函数简化形式
    //声明偏函数，需要重写特质中的方法，而Scala提供了简单的方法
    //简化形式1
    def f2:PartialFunction[Any,Int]={
      case i:Int=>i+1
    }
    val list5=List(1,2,3,"dd").collect(f2)
    println(list5)

    //简化形式2
    val list6=List(2,3,"hd").collect{case i:Int=>i+1}
    println(list6)

    //2.作为参数的函数 function as arguments  ========================作为参数的函数==================
    println("=========作为参数的函数==================")
    //函数作为一个变量传入到了另一个函数中，那么该作为参数的函数的类型是： function1，即：(参数类型) => 返回类型
    // basic introduction : funcition is as a variable to insert into another function,then the function as argument's type is:Function1,that is (argument type)=>return type
    //应用实例  examples of application
    //the conclusion of 'examples of application'
    def plus(x:Int)=3+x
    val result=Array(1,2,3,4).map(plus(_)) //plus(_)表示将plus这个函数当作一个参数传给map,_表示从集合中遍历出来的一个元素
    println(result.mkString(","))



    //2.匿名函数  anonymous function
    //basic introduction:anonymous function is no-name function,it can use function expression to set
    //the anonymous function
    val triple=(x:Int)=>3*x
    println("triple="+triple)
    //(x: Double) => 3 * x 就是匿名函数
    //(x: Double) 是形参列表，
    // => 是规定语法表示后面是函数体，
    // 3 * x 就是函数 体，如果有多行，可以 {} 换行写.
    // triple 是指向匿名函数的变量。
    //案例：请编写一个匿名函数，可以返回2个整数的和，并输出该匿名函数的类型
    val f11=(in:Int,in1:Int)=>{
      println("匿名函数被调用")
      in+in1
    }
    println("f11类型="+f11)
    println(f11(10,29))


    //3.高阶函数  higher-order function
    //function what can accept function as a parameter ,called higher-order function. can make application's program more stronger
    //The basic use of higher-order function
    def test(f:(Double,Double)=>Double,n1:Double,n2:Double): Double ={
      f(n1,n2)
    }
    def sum(d:Double,a:Double):Double={
      d+d
    }
    val res=test(sum,2,2)
    println("res="+res)

    //higher-order function can return the type of function
    def minusxy(x:Int)={
      (y:Int)=>x+y
    }
    val res11=minusxy(3)(3)
    println(res11)
    //说明val result3 = minusxy(3)(5)
    // 1) minusxy(3)执行minusxy(x: Int)得到 (y: Int) => 3 - y 这个匿名函 2) minusxy(3)(5)执行 (y: Int) => x - y 这个匿名函数 3) 也可以分步执行: val f1 = minusxy(3); val res = f1(90)


    //4.参数类型推断  inference the type of parameter
    //basic introduction:参数推断省去类型信息（在某些情况下[需要有应用场景]，参数类型是可以推断 出来的，
    //  如list=(1,2,3) list.map() map中函数参数类型是可以推断的)，同时也 可以进行相应的简写。
    // 参数类型推断写法说明
    // 1) 参数类型是可以推断时，可以省略参数类型
    // 2) 当传入的函数，只有单个参数时，可以省去括号
    // 3) 如果变量只在=>右边只出现一次，可以用_来代替
    //应用案例 the application case
    val list111=List(1,2,3,4)
    println(list111.map((x:Int)=>x+1))
    println(list111.map((x)=>x+1))
    println(list111.map(x=>x+1))
    println(list111.map(_+1))
    //1) map是一个高阶函数，因此也可以直接传入一个匿名函数，完成map
    // 2) 当遍历list时，参数类型是可以推断出来的，可以省略数据类型Int println(list.map((x)=>x + 1))
    // 3) 当传入的函数，只有单个参数时，可以省去括号 println(list.map(x=>x + 1))
    // 4) 如果变量只在=>右边只出现一次，可以用_来代替 println(list.map(_ + 1))


    //5.闭包 closure
    //basic introduction:闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
    val factor=3
    val multiplier=(x:Int)=>x+factor
    //这就是闭包，因为函数变量multiplier的值依赖于其外面定义的变量factor


    //6.函数柯里化  function's curry
    //函数编程中，接受多个参数的函数都可以转化为接受单个参数的函数，这个转 化过程就叫柯里化
    //编写一个函数，接收两个整数，可以返回两个数的乘积，要求:
    // 1) 使用常规的方式完成 2) 使用闭包的方式完成 3) 使用函数柯里化完成
    def sum11(i1:Int,i2:Int)={
      i1+i2
    }
    println(sum11(10,3))

    def sum2(i:Int)={
      (y:Int)=>i+y
    }
    println(sum2(20)(10))

    def sum3(x:Int)(y:Int)=x+y
    val hehe=sum3(9)(8)

  }
}
