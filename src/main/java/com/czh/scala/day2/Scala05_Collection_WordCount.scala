package com.czh.scala.day2

/**
 * 下划线的作用
 *
 * 1. 声明变量，但是不能访问
 *
 * val _ = "zhangsan"
 *
 * 2. 将函数作为整体使用
 *
 * val f = fun1 _
 *
 * 3. 使用import语法时，下划线可以代替星号
 *
 * import java.util._
 *
 * 4. 使用import语法时，下划线可以隐藏类
 *
 * import java.sql.{Date->_}
 *
 * 5. 模式匹配中，代表任意值
 *
 * case _ => xxxx
 *
 * 6. 泛型中，下划线表示任意类型
 *
 * List[_]
 */

import scala.io.{BufferedSource, Source}

object Scala05_Collection_WordCount {

    def main(args: Array[String]): Unit = {

        // TODO 1. 读取文件，获取原始数据
        //  line => Hello Scala
        //val source: BufferedSource = Source.fromFile("data/word.txt")
        val source: BufferedSource = Source.fromFile("../Scala/data/word.txt")
        //val source: BufferedSource = Source.fromFile("D:\\LenovoSoftstore\\idea_project\\Scala\\data\\word.txt")
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
        val wordCount = wordGroup.mapValues(
            v => {
                v.size
            }
        )

        // TODO 5. 将统计结果打印在控制台
        println(wordCount)

    }

}
