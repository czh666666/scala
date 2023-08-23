package com.czh.scala.day2

import scala.collection.mutable.ArrayBuffer

object Scala06_Collection_Seq {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Seq

        // 一般会从采用List
        val seq = Seq(1,2,3,4)
        val list = List(1,2,3,4)
        val list1 = List(5,6,7,8)

        // 数据操作
        val ints: List[Int] = list :+ 5
        val ints1: List[Int] = 5 +: list

        // Nil 在集合中表示空集合
        val ints2 = 1 :: 2:: 3 :: Nil
        val ints22=Nil.::(3).::(2).::(1)
        val ints3 = 1 :: 2 :: 3 :: list1 ::: Nil

        println(seq)
        println(list eq ints)
        println(list)
        println(ints)
        println(ints1)
        println(Nil)
        println(ints2)
        println(ints22)
        println(ints3)

    }

}
