package com.czh.scala.day2

import scala.collection.mutable

object Scala08_Collection_Map_1 {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Map

        // java中从HashMap中获取一个不存在的key，会返回null
        //       HashMap允许放空键（Key）空值(Value)
        val map1 = mutable.Map(
            "a" -> 1, "b" -> 2, "a" -> 3,"d" -> 4,"e" -> 5
        )

        val maybeInt: Option[Int] = map1.get("a")
        val maybeInt1: Option[Int] = map1.get("f")

        // Option类型专门为了解决空指针问题设计的
        // Option : 选项，对象只有2个 Some, None
        if ( maybeInt1.isEmpty ) {
            println("没有对应key的值, 提供默认值 : " + maybeInt1.getOrElse(0))
        } else {
            println("对应key的值为" + maybeInt1.get)
        }
        //没有设置为0
        println("获取指定key的值：" + maybeInt1.getOrElse(0))

        println(map1.getOrElse("a", 0))
        println(map1.iterator.mkString("--"))
        map1.foreach(println)




    }

}
