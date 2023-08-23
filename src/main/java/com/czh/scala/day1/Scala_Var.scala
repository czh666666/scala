package com.czh.scala.day1

import scala.io.StdIn
import scala.util.control.Breaks
import scala.util.control.Breaks.{break, breakable}

object Scala_Var {
  def main(args: Array[String]): Unit = {
    //    val name = "xiaoli"
    //    val age = 15
    //    println("my name is "+ name +", age is"+age)
    //    printf("my name is %s age is %d",name,age)
    //    println(s"\n my name is $name age is $age")

    /*    //键盘录入
        println("输入名字：")
        val name1 = StdIn.readLine()
        println("输入密码：")
        val pwd = StdIn.readLine()


        //多行字符串
        """
          |duo
          |hang
          |zi
          |fu
          |chuan
          |""".stripMargin*/

    Breaks.breakable{
      for (i <- 1 to 5) {
        if (i == 3) {
          // scala中没有break关键字,采用面向对象的方式来代替
          // 采用抛出异常的方式来跳出循环
          Breaks.break()
        }
        println(i)
      }
    }

    println("*************************")
    for (i <- 1 to 5) {
      Breaks.breakable {
        if (i == 3) {
          // scala中没有break关键字,采用面向对象的方式来代替
          // 采用抛出异常的方式来跳出循环
          Breaks.break()
        }
      println(i)
      }
    }
    println("*************************")
    for (i <- 1 to 5) {
      Breaks.breakable {
        if (i == 3) {
          // scala中没有break关键字,采用面向对象的方式来代替
          // 采用抛出异常的方式来跳出循环
          Breaks.break
        }
        println(i)
      }
    println("*************************")
      breakable {
        for ( i <- 1 to 5 ) {
          if ( i == 3 ) {
            // scala中没有break关键字,采用面向对象的方式来代替
            // 采用抛出异常的方式来跳出循环
            break
          }
          println(i)
        }
      }
    }
  }

}
