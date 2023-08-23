package com.czh.scala.day2

import scala.io.{BufferedSource, Source}

object Scala05_Collection_WordCount_1 {

    def main(args: Array[String]): Unit = {

        // TODO 1. 读取文件，获取原始数据
        //  line => Hello Scala
        val source: BufferedSource = Source.fromFile("../Scala/data/word.txt")
        val lines: Array[String] = source.getLines().toArray
        source.close()

        val wordCount =
            lines
                .flatMap(_.split(" "))
                .groupBy(word => word)
                .mapValues(_.size)

        println(wordCount)

    }

}
