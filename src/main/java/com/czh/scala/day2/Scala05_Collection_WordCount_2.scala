package com.czh.scala.day2

import scala.io.{BufferedSource, Source}

object Scala05_Collection_WordCount_2 {

    def main(args: Array[String]): Unit = {

        // TODO 1. 读取文件，获取原始数据
        //  line => Hello Scala
        val source: BufferedSource = Source.fromFile("../Scala/data/word.txt")
        val lines: Array[String] = source.getLines().toArray
        source.close()

        // TODO 2. 将原始数据进行切分成一个一个的单词
        // "Hello Scala" => "Hello", "Scala"
        val words = lines.flatMap(
            line => {
                line.split(" ")
            }
        )

        // TODO 3. 对分词的结果进行分组操作（相同的单词放置在一起）
        // "Hello", "Hello" => { "Hello"=>List( Hello, Hello ) }
        val wordGroup: Map[String, Array[String]] = words.groupBy(word => word)

        // TODO 4. 对分组后的数据进行数量的统计
        // 如果数据在转换时，无需对key进行操作，只对v进行处理时，可以使用mapValues方法
        // { "Hello"=>List( Hello, Hello ) }
        // =>
        // { "Hello"=>2 }
//        val wordCount = wordGroup.map(
//            kv => {
//                val k = kv._1
//                val v = kv._2
//                ( k, v.size )
//            }
//        )
        val wordCount = wordGroup.map {
            case (word, list) => {
                (word, list.size)
            }
        }

        // TODO 5. 将统计结果打印在控制台
        println(wordCount)

    }

}
