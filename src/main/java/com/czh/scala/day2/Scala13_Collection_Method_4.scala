package com.czh.scala.day2

import scala.collection.mutable

object Scala13_Collection_Method_4 {

    def main(args: Array[String]): Unit = {

        val list1 = List(1,2,3,4)

        // (A1, A1) => A1
        println(list1.reduce(_ + _))

        // (B, Int) => B
        println(list1.reduceLeft(_ - _))

        // (A1)((A1,A1)=>A1)
        println(list1.fold(9)(_ + _))

        // (B)((B, Int)=>B)
        println(list1.foldLeft("")(_ + _))

        // "1234"

        val map1 = mutable.Map(
            ("a", 1), ("b", 2), ("c", 3)
        )
        val map2 = mutable.Map(
            ("a", 4), ("d", 5), ("c", 6)
        )

        val map3 = map2.foldLeft(map1)(
            (map, kv) => {
                val key = kv._1
                val cnt = kv._2
                val oldCnt = map.getOrElse(key, 0)
                map.update(key, oldCnt + cnt)
                map
            }
        )
        println(map3)



    }

}
