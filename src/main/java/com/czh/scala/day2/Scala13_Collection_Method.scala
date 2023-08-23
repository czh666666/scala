package com.czh.scala.day2

object Scala13_Collection_Method {

    def main(args: Array[String]): Unit = {

        val list1 = List(1,2,1,2,1,2)

        println(list1.distinct)

        // 快排
        val list = List(1,6,5,3,2,4)

        val tuple: (List[Int], List[Int]) = list.partition(
            num => {
                num > 3
            }
        )
        println(tuple._1)
        println(tuple._2)


    }

}
