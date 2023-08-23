package com.czh.scala.day2

object Scala13_Collection_Method_2 {

    def main(args: Array[String]): Unit = {

        val list1 = List(1,2,3,4,5,6,7,8)

        println(list1.drop(1))
        println(list1)
        //list1.head + list1.tail.head

        // 滑动窗口
        // 滚动窗口
        //sliding(3, 2) 3个一组，一组2个数据
        val iterator: Iterator[List[Int]] = list1.sliding(3, 2)
        while (iterator.hasNext) {
            val ints: List[Int] = iterator.next()
            println(ints)
        }


    }

}
