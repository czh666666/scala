package com.czh.scala.day4

import java.io.FileInputStream

object Scala01_Exception {

    def main(args: Array[String]): Unit = {

        // TODO - 异常
        try {
            val i = 0
            val j = 10 / i
            //new FileInputStream("xxxx")
        } catch {

            case e: ArithmeticException => println("算术异常")
            case e: Exception => println("其他异常")
        }


        // 马丁知道大家都不知道异常是什么
        // 所以scala中异常没有分类
        //new FileInputStream("xxxx")



    }
}
