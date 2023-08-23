package com.czh.scala.day2

import scala.collection.mutable.ListBuffer

object Scala06_Collection_Seq_2 {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Seq - 可变

        val list = ListBuffer(1,3,4,2,1)

        //list.append()
        //list.appendAll()
        //list.insert()

        list.update(0, 5) // 改变自身
        println(list)
        list.updated(0, 6) // 创建新的
        println(list.updated(0, 7))// 创建新的
        println(list)

        //list.remove(1)
        //list.remove(1,2)
        //
        //list.mkString()
        //list.iterator
        //list.foreach()
        println(list.mkString("-"))
        println(list.iterator.mkString("*"))
        list.foreach(println)

    }

}
