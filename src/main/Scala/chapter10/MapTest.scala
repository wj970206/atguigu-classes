package chapter10

import scala.collection.mutable

/**
 * @Auther:weijian
 * @Date:2021/10/30-10-30-10:13
 * @Description:chapter10
 * @version:1.0
 */
object MapTest {
  def main(args: Array[String]): Unit = {
    //Map 是一种把键对象和值对象映射的集合，它的每一个元素都包含一对键对象和值对象。
    //Map 不支持重复key
    //方式1-构造不可变映射
    //Map默认不可变映射，因为是immutable.Map
    //Map底层中，每对key-value都是Tuple2
    //从输出结果看，输出顺序和声明顺序一样
    val map1=Map("Alice"->1,"Bob"->2,"kotlin"->"北京")
    //亦可 val map1=Map(("Alice",1),("Bob",2),("kotlin","北京“))
    println(map1("Alice"))
    println(map1)
    val map11=Map(("alice",2),("ah",3))

    //方式2-构造可变映射
    //从输出的结果看，顺序不一致
    val map2=mutable.Map("Alice"->1,"Bob"->2,"kotlin"->"北京")
    println(map2)

    //方式3-创建空的映射
    //顺序不一致
    val map3=new mutable.HashMap[String,Int]()
    map3("deng")=5
    map3("wei")=2
    map3("jian")=3
    println(map3)

    //方式4 对偶元组
    val map4=mutable.Map(("Alice", 10), ("Bob", 20), ("Kotlin", "北京"))
    println("map4="+map4)

    println("=========================")

    //map的结果输出方式

    //方式一 使用map(key)
    println(map4("Alice"))

    //方式二 使用contains方法检查是否存在key
    if(map4.contains("Kotlin")){
      println("kotlin存在")
    }else{
      println("kotlin not exit")
    }

    //方式3 使用map.get(key).get取值
    //1. 如果key存在 map.get(key) 就会返回Some(值)  ,然后Some(值).get就可以取出
    //    //2. 如果key不存在 map.get(key) 就会返回None
    println(map4.get("Alice")) //some(10)
    println(map4.get("Alice").get) //10

    //方式4 使用map4.getOrElse()取值
    println(map4.getOrElse("Alice--","默认的值"))

    val map5=mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    map5("A")=20
    println(map5)
    map5+=("D"->100)
    //不支持map5+=("A",10)
    println(map5)

    //map 减少key
    map5 -=("A")
    println(map5)

    //map的遍历
    val map6=mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    for((k,n)<-map6) println((k+" is mapped to "+n))

    for(key<-map6.keys){
      println(key,map6(key))
    }

    //这样取出方式 v 类型是 Tuple2
    println("----v <- map6--------")
    for (v <- map6) println(v + " key =" + v._1 + " val=" + v._2) //v是Tuple?
  }
}
