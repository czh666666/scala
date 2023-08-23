package com.czh.scala.day2

import scala.collection.mutable.ListBuffer

object Scala06_Collection_Seq_3 {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Seq - 可变

        val list = ListBuffer(1,3,4,2,1)
        val list1 = list.toList
        val list2 = list1.toBuffer
        println(list1)
        println(list2)


    }

}
