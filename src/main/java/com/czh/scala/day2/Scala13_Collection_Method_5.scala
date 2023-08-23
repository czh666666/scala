package com.czh.scala.day2

import scala.collection.mutable
import scala.io.{BufferedSource, Source}

object Scala13_Collection_Method_5 {

    def main(args: Array[String]): Unit = {

        val list1 = List(1,2,3,4)

        //println(list1.map(_ * 2))
//        list1.map {
//            num => {
//                num
//            }
//        }

        val list2 = List(
            "Hello Scala"
        )

        // 1 => N => List(N)
        val words = list2.flatMap(
            str => {
                str.split(" ") // 容器（ Hello, Scala ）
            }
        )
//        val words1 = list2.flatMap(_.split(" "))
        //println(words)

//        val list3 = List(
//            List(1,2), List(3,4)
//        )
//
//        val newlist = list3.flatMap(
//            list => { // 整体
//                list  // 容器
//            }
//        )
        //println(newlist)

//        val list4 = List(1,2,3,4)
//
//        val newList = list4.flatMap(
//            num => {
//                List(num)
//            }
//        )
        //println(newList)

        /*
        val source: BufferedSource = Source.fromFile("data/word.txt")
        val lines: Array[String] = source.getLines().toArray
        source.close()

        val wordCount =
            lines
                .flatMap(_.split(" "))
                .groupBy(word=>word)
                .mapValues(_.size)

        println(wordCount)

         */
        // TODO 使用匿名函数时，给定的参数直接放回，不能使用下划线代替，必须完整，
        def test( f : (String)=>Unit ): Unit = {
            f("zhangsan")
        }

        test( (s:String)=>{println(s)} )
        test( (s:String)=>println(s) )
        test( (s)=>println(s) )
        test( s=>println(s) )
        test( s => println(s) )


    }

}
