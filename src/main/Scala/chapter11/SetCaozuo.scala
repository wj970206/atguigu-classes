package chapter11

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @Auther:weijian
 * @Date:2021/10/30-10-30-17:56
 * @Description:chapter11
 * @version:1.0
 */
object SetCaozuo {
  def main(args: Array[String]): Unit = {
    //看一个实际需求 要求：请将List(3,5,7) 中的所有元素都 * 2 ，
    // 将其结果放到一个新的集合中返回， 即返回一个新的List(6,10,14), 请编写程序实现
    //传统方法
    var list01 = List(1, 2, 3)
    list01=10::list01
    var list02=List[Int]()
    //list02=list02 :: 1 不行，因为list02没有元素，故不知道值类型
    for(i<-list01){
      list02=list02 :+ i*2
    }

    //高阶函数 higher-order functions
    //test就是高阶函数，f是传进去的方法 f后面的Int=>Int表示f方法的输入输出参数均为Int类型，n1表示输入的参数
    //test is higher-order functions,f is the method that use to transmission in,Int=>Int behind f means the type of  f function's input and output  is Int,n1 represent the argument of input
    def test(f:Int=>Int,n1:Int) ={
      f(n1)
    }
    def sum(in:Int):Int={
      in*8
    }
    var res=test(sum,6)
    println(res)

    //1.map方法 ====================
    //在Scala中可以通过map映射操作来解决：将集合中的每一个元素通过指定功能 （函数）映射（转换）成新的结果集合这里其实就是所谓的将函数作为参数传 递给另外一个函数,这是函数式编程的特点
    var list03=list01.map(multiply2)
    val lisss=list01.map((_*2))


    //2.flatmap方法  =======================
    //flat 即压扁，压平，扁平化映射，就是将集合中的每个元素的子元素隐射到某个函数并返回新的集合
    val names=List("Alice","Bob")

//    val namess=names.map(upper) 报错：forward reference extends over definition of value 原因：原因：方法体不能放在main主函数中，也就是c2不能再main中
//    println(namess)
    println(names.map(upper))
    //高阶函数使用的方法，不能赋值，只能直接调用赋值给变量，赋值的话方法体应存在main函数外

    def upper(In:String):String={
      In.toUpperCase
    }
    println(names.flatMap(upper)) //List(A, L, I, C, E, B, O, B)
    println(names.map(upper))  //List(ALICE, BOB)

    //3.filter方法  ==============
    //过滤出符合条件的元素，组成新的集合
    val names1=List("Alice","Bob","Nick")

    def with1(s:String):Boolean={
      s.startsWith("A")
    }
    val names3=names1.filter(with1)


    //传统方法
    def startWith(in:String):String={
      if(in.startsWith("A")){
        in
      }else{
        ""
      }

    }
    var list5=List[String]()
    for(i<-names1){
      if(startWith(i)==i){
        list5=list5:+i
      }
    }
    println(s"list5的数据为${list5}")


    //4.reduceLeft  ================
    //看一个需求: val list6 = List(1, 20, 30, 4 ,5) , 求出list的和.
    //传统方法
    val list6 = List(1, 20, 30, 4 ,5)
    var sum1=0
    for(i<-list6){
      sum1+=i
    }
    println("传统方法求得list内各元素相加的和为="+sum1)
    //reduceLeft
    //reduceLeft函数是提取集合左边两个元素两两相比后得出一个值后再提取两个
    //reduceRight函数则是提取顺序相反
    println("reduceLeft方法求出的和为"+list6.reduceLeft(_+_))

    def mins(i1:Int,i2:Int):Int={
      if(i1>i2) i1 else i2
    }
    println("list6用reduceleft方法求得的最大值为"+list6.reduceLeft(mins))


    //5.折叠  =====================================
    //foldLeft 和 foldRight

    //fold函数将上一步返回的值作为函数的第一个参数传递参与运算，直到list中的元素被遍历完
    //可以把reduceLeft看做简化版的foldLeft
    //相关函数： fold,foldLeft,foldRight 参考reduce的方法理解
    //示例
    //参考 ： https://blog.csdn.net/dz77dz/article/details/87191470
    val list7=List(1,2,3,4)
    def minus(i:Int,i1:Int):Int={
      i-i1
    }
    println(list7.foldLeft(1)(minus))//(1) 为初始值，表示从这里开始作为第一个参数，取出List的第一个参数后开始运算
    println(list7.foldLeft(2)(minus))//运算顺序从左向右 2-1-2-3-4

    println(list7.foldRight(5)(minus))  //4-5  3-（4-5） 2-（3-（4-5））  1-（2-（3-（4-5）））

    //foldLeft 和foldRight 缩写方法分别是 ： /:  和  :\
    val lis=List(1,3,9,5)
    val lis1=(1 /: lis)(minus) //等价于 lis.foldLeft(1)(minus)

    //val lis2=(10 :\ lis)(minus) 错误
    val lis2=(lis :\ 10)(minus)  //等价于lis.foldRigth(10)(minus)


    //6.扫描 ================================================
    //即对所有的元素做fold操作，但是会把产生的所有中间结果放置在一个集合中保存
    val lis3=List(1,2,3,4,5)
    val lis4=lis3.scanLeft(15)(minus)
    println(lis4) //List(15, 14, 12, 9, 5, 0) 中间结果也包括起始数15

    val lis5=lis3.scanRight(1)(minus)
    println(lis5) //List(2, -1, 3, 0, 4, 1)


    //以下为扩展内容 ===================
    println("以下为扩展内容 ===================")

    //7.拉链  ================================================
    //在开发中，常常需要将两个集合进行对偶元组的合并 此时可以使用拉链
    val lis6=List(1,2,3)
//    for(i<-lis6){
//      println(i)
//    }
    val lis7=List(4,5,6)
    val lis8=lis6.zip(lis7)
    for (i<-lis7){
      println(i)
    }
    println(lis8)


    //8.迭代器
    //通过迭代器iterator从集合中获得一个迭代器，通过while循环和for表达式对集合进行遍历
    val iterator=List(1,2,3,4).iterator
    println("遍历方式1")
    while(iterator.hasNext){
      println(iterator.next())
    }

    println("遍历方式2")
    for(enum<-iterator){
      println(enum)
    }

    //9.流Stream
    //基本说明： Stream 是一个集合，这个集合可以存放无穷多个元素，但这无穷多个元素并不会一次性生产出来
    //而是需要用到多大的区间，就会动态的生产，末尾元素遵循lazy规则，即要使用结果才会被计算出来
    def numsForm(n:BigInt):Stream[BigInt]=n#::numsForm(n+1)
    val stream1=numsForm(1)
    println("stream1="+stream1)

    //课堂练习1 =========================
    val sen="AAAABBCCCCCDDD"
    //将sen中的各个字符，通过foldLeft存放到一个ArrayBuffer中
    // 目的：理解foldLeft用法
    def putArray(arr:ArrayBuffer[Char],c:Char):ArrayBuffer[Char]={
      arr.append(c)
      arr
    }
    //val arr=ArrayBuffer[Char]()
    val arr1=sen.foldLeft(new ArrayBuffer[Char]())(putArray)
    println(arr1) //ArrayBuffer(A, A, A, A, B, B, C, C, C, C, C, D, D, D)


    //课堂练习2 ===================
    //使用映射集合，统计一句话中，各个字母出现的次数

    var map=new mutable.HashMap[Char,Int]()
    val sen1="AAAABBCCCCCDDDffgg"
    def count(ma:mutable.HashMap[Char,Int],in:Char):mutable.HashMap[Char,Int]={
      if(ma.contains(in)){
        ma(in)=ma(in)+1
      }else{
        ma(in)=1
      }
      ma
    }
    val countTest=sen1.foldLeft(map)(count)
    println(countTest)

    //课堂练习3===================================
    //大数据中经典的wordcount案例
    val lines=List("atguigu han hello","atguigu han aaa aaa aaa ccc ddd uuu")
    val res1=lines.flatMap(_.split(" "))
    println("res1="+res1)


//    def toList(list:List[String],in:String):List[String]={
//      list:+in
//    }
//    var map1=List[String]
//    val haha=lines.foldLeft(map1)(toList)
//    println("haha="+haha)


    val res2=res1.map(ha)
//    def ha(in:String):mutable.Map[String,Int]={
//      mutable.Map((in,1))
//    }
    println("res2="+res2)
    //等价于
    val res22=res1.map((_,1))
    println("res22="+res22)

    val res3=res22.groupBy(_._1) //_表示各个对偶元组，例如 hello,1
    println("res3="+res3) //res3=Map(han -> List((han,1), (han,1)), ddd -> List((ddd,1)))
    val res4=res3.map(x=>(x._1,x._2.size))
    // x表示传入的各个元素，比如 han -> List((han,1), (han,1))  ddd -> List((ddd,1))
    // x._1 表示map的key han ddd 等
    // x._2 表示map的value 即List((han,1), (han,1))  List((ddd,1))
    println(res4) //Map(han -> 2, ddd -> 1, ccc -> 1, uuu -> 1, atguigu -> 2, hello -> 1, aaa -> 3)

    val res5=res4.toList  //Map 转化成 List 会将map里面的每一键值对分别转化成List的二元
    println(res5)  //List((han,2), (ddd,1), (ccc,1), (uuu,1), (atguigu,2), (hello,1), (aaa,3))

    val res6=res5.sortBy(_._2)
    println(res6)
  }


  def multiply2(in:Int):Int={
    in*2
  }
  def ha(in:String):mutable.Map[String,Int]={
    mutable.Map((in,1))
  }
}
