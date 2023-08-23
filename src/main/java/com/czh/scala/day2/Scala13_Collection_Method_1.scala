package com.czh.scala.day2

object Scala13_Collection_Method_1 {

    def main(args: Array[String]): Unit = {

        val list1 = List(1,2,3,4)
        val list2 = List(3,4,5,6)

        // 交集，并集，差集
        println(list1.intersect(list2))
        println(list1.union(list2))
        println(list1.diff(list2))


    }

}
