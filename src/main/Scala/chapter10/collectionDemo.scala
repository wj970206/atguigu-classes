package chapter10

import scala.collection.mutable.ListBuffer

/**
 * @Auther:weijian
 * @Date:2021/10/28-10-28-21:32
 * @Description:chapter10
 * @version:1.0
 */
object collectionDemo {
  def main(args: Array[String]): Unit = {

    val str="hello"  //字符串在scala中就是char的集合

    for(i<- 0 to str.length-1){
      println(str(i))
    }

    //List，List的特征是其元素以线性方式存储，集合中可以存放重复对象。
    //默认情况，List是scala.collection.immutable.List,即不可变
    //用var修饰的List集合可以修改值，增加值，那该不可变体会在增加和修改前后的hashcode已经发生变化
    //即增加修改是在原来的lIST集合基础上变成新的list集合
    var list1=List(1,2,3)
    println(list1.hashCode())
    println(list1.length)
    println(list1.reverse)
    println(list1)//纯数字的list可以直接输出，而字符串的不行

    val str1=List("hello","spark")
    println(str1(1))

    //list集合添加元素
    //用  :+
    list1=list1:+3
    println(list1.hashCode())
    println("添加后元素"+list1(3))

    //:: 符号：用于拉取前后的元素成为新的list集合
    val list4=List(1,2,3,"abc")
    val list5=4 :: 5 :: 6 :: 6 :: list4 :: Nil  //       List(4, 5, 6, 6, List(1, 2, 3, abc))
    println(list5)
    for(i<-list5){
      println(i)
    }

    val list6=list1 :: list4
    println(list6)
    for(i<-list6){
      print("test list1 add list6"+i+"   ")
    }
    println()
    println("=====================")
    val te1=List(1,2,3)
    val te11=1::te1::Nil  //单元素拉取List集合后，集合为一元集合，但是加了Nil后，新集合内依然保持原有集合
    println(te11)  //List(1, 1, 2, 3)  加Nil后结果为List(1, List(1, 2, 3))

    val te2=List(4,5,6)
    val te22=te1::te2::Nil  //集合拉取集合，结果为前面的集合保留，后面的集合打散  加Nil后保持
    println(te22) //List(List(1, 2, 3), 4, 5, 6)   加Nil后结果为List(List(1, 2, 3), List(4, 5, 6))
    println("====================")
    //这段话表示
    //list之listbuffer
    //创建listBuffer
    val lb=new ListBuffer[Any]
    lb.append(2)
    lb.append(2)
    lb.append(2)
    lb.append(2)
    lb+=3
    for(i<-lb){
      println(i)
    }

    val lb1=ListBuffer(1,2,3,4)

    val lb2=new ListBuffer[Int]
    lb2++=lb1 //++=表示把集合lb1的数遍历赋值给lb2
    for(i<-lb2){
      println(i)
    }

    val lsit=List(12.3,3,"hello")
    println(lsit(2))
  }
}
