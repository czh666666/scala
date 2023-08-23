package com.czh.scala.day3

object Scala07_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配 - 偏函数
        // 以偏概全
        // 全量函数 ：函数进行处理时必须对所有的数据进行处理。
        // 偏函数 ： 函数进行处理时只对满足条件的数据进行处理
        val list = List(1,2,3,4)

        // 2 2 6 4

        // map只支持全量函数操作
        // 1 => 2
        // 2 => Unit
        // 3 => 6
        // 4 => Unit
        val list1 = list.map(
            num => {
                if ( num % 2 != 0 ) {
                    num * 2
                }
            }
        )

        println(list1)


    }
}
