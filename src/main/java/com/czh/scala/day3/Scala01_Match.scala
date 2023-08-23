package com.czh.scala.day3

object Scala01_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配 - 匹配规则
        // 类似于java中switch
        // 当数据满足某一个分支时，执行完毕后，就直接跳出
        // case _ 分支类似于default语言， 分支匹配其实就是顺序匹配
        // 如果数据没有匹配任何规则，会发生错误
//        val age = 20
//
//        age match {
//            //case _ => println("other")
//            case 10 => println("age = 10")
//            case 30 => println("age = 30")
//        }

        var a: Int = 10
        var b: Int = 20
        var operator: Char = '+'

        var result = operator match {
            case '+' => a + b
            case '-' => a - b
            case '*' => a * b
            case '/' => a / b
            case _ => "illegal"
        }
        println(result)


    }
}
