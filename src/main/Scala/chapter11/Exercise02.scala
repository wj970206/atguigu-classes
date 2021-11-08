package chapter11

import scala.collection.mutable.ArrayBuffer

/**
 * @Auther:weijian
 * @Date:2021/10/30-10-30-17:28
 * @Description:chapter11
 * @version:1.0
 */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    val sentence="AAAAAAABBBBBBBBBBBCCCCCCCCCCDDDDDD"
    val arrayBuffer=new ArrayBuffer[Char]()

    //理解折叠的第一个传入的arrayBuffer 含义.
    sentence.foldLeft(arrayBuffer)(putArray)
    println("arrayBuffer="+arrayBuffer)


  }

  def putArray(arr:ArrayBuffer[Char],c:Char):ArrayBuffer[Char]={
    arr.append(c)
    arr
  }
}
