package com.czh.scala.day3

object Scala09_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配 - 偏函数

        val list : List[Any] = List(1,2,3,4,5,6,"test")

        val list1 = list.collect{
            case i : Int => i + 1
        }

        println(list1)


    }
}
