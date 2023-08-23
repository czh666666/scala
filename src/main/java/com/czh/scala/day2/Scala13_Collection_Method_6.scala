package com.czh.scala.day2

object Scala13_Collection_Method_6 {

    def main(args: Array[String]): Unit = {

        val list1 = List(1,2,3,4)
        val list2 = List("Hello", "Hive", "Hadoop")
        val list4 = List(
            ("a", 1), ("a", 2), ("a", 3)
        )

        // Map[ 组名1=>分组集合1，组名2=>分组集合2 ]
        val list3 = list4.groupBy(
            t => t._1
        )

        println(list3)

        val list5 = List(1,4,3,2,5)

        // 1 4 3 2 5
        // 1 0 1 0 1
        // 4 2 1 3 5
        // List(4, 2, 1, 3, 5)
        println(list5.sortBy(_ % 2))


    }

}
