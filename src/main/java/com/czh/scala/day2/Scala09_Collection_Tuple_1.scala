package com.czh.scala.day2

object Scala09_Collection_Tuple_1 {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Tuple
        // 如果元组中的元素只有2个，称之为对偶元组，也可以称之为键值对
        val kv = (1, "zhangsan")

        val map = Map(
            ("a", 1), ("b", 2), ("c", 3)
        )

        map.foreach(
            t => {
                println(t._1 + "=" + t._2)
            }
        )

        //println(map)
        // 将Map转换为List
        val list: List[(String, Int)] = map.toList

    }

}
