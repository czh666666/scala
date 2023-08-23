package com.czh.scala.day3

object Scala04_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配 - 匹配规则

        // 模式匹配
        val (_, name, _) = (1, "zhangsan", 30)
        println(name)
        println("***************************")

        val map = Map(
            ("a", 1), ("b", 2), ("c", 2)
        )

        for ( (k, 2) <- map ) {
            println( k )
        }

        println("***************************")
        val list = List(
            (("河北", "鞋"), 10),
            (("河北", "衣服"), 20),
            (("河北", "电脑"), 15),
        )

        list.map(
            (t) => {
                t
            }
        )

        // 下面的代码中，使用模式匹配需要注意：
        // 1. 匹配数据时，需要使用case关键字
        // 2. case分支可能存在多个，那么需要将map的小括号换成大括号
        val list1 = list.map {
            case ((prv, item), cnt) => {
                (prv, (item, cnt * 2))
            }
        }
        println(list1)

        println("***************************")
        val Array(first, second, _*) = Array(1, 7, 2, 9)
        println(s"first=$first,second=$second")
    }
}
