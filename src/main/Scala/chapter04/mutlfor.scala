package chapter04

import scala.io.StdIn

/**
 * @Auther:weijian
 * @Date:2021/10/1-10-01-22:29
 * @Description:chapter04
 * @version:1.0
 */
object mutlfor {
  def main(args: Array[String]): Unit = {

    /*
    应用实例：

  1.统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
    分析思路
    (1) classNum 表示 班级个数 , stuNum 表示学生个数
    (2) classScore 表示各个班级总分 totalScore 表示所有班级总分
    (3) score 表示各个学生成绩
    (4) 使用循环的方式输入成绩
  2.统计三个班及格人数，每个班有5名同学。
  3.打印出九九乘法表

     */

   /* var classNum = 3
    val stuNum=6
    var classScore=0
    var totalScore=0
    var score=0
    var numOfJige=0
    for(j<-1 to 2) {

      numOfJige=0
      classScore=0
      println(s"请输入${j}班各学生的成绩")
      for (i <- 1 to 3) {
        println(s"输入${j}班第${i}个学生的分数")
        score = StdIn.readInt()

        if(score>=60){
          numOfJige+=1
        }
        classScore+=score
      }
      println(s"第${j}个班的及格人数为${numOfJige}")
      println(s"第${j}个班的总分为${classScore}")
      totalScore=totalScore+classScore
    }

    println("所有班级的总分为"+totalScore)
    println("班级平均分为"+totalScore/stuNum)



    */
     for(i<- 1 to 9){
       for(j<- 1 to 9){
         printf(s"${i}*${j}="+i*j)
         printf(s"\t")
       }
       println()
     }


  }
}
