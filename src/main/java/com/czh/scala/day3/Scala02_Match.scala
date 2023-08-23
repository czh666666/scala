package com.czh.scala.day3

object Scala02_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配 - 匹配规则

        // 匹配常量
        def describe1(x: Any) = x match {
            case 5 => "Int five"
            case "hello" => "String hello"
            case true => "Boolean true"
            case '+' => "Char +"
        }

        println(describe1(true))

        // TODO 匹配类型
        // 类型前增加变量名称,这个变量就是将数据转换成指定类型的变量
        // 如果想要使用下划线代表的数据，可以给下划线起名来使用
        // scala中类型匹配时，是不考虑泛型的,但是Array类型是特殊的。
        def describe(x: Any) = x match {
            case i : Int => i + 10
            case s : String => "String hello"
            case m: List[Int] => "List"
            case c: Array[Int] => "Array[Int]"
            case someThing => "something else " + someThing
        }

        // Array[Int], 这里的Int不是真正的泛型
        // java  => String[]
        // scala => Array[String]
        println(describe(true))
        println(describe(List("1","a")))
        println(describe(Array(1,"1")))
        println(describe(Array(1,1)))
    }
}
