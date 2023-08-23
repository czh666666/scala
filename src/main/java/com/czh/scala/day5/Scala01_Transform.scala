package com.czh.scala.day5

object Scala01_Transform {

    def main(args: Array[String]): Unit = {

        //val b : Byte = 10
        //val i : Int = b

        // OCP

        // 如果程序编译出错，编译器会尝试在整个的作用域中查找能够让程序编译通过的方式
        // 如果找到，那么编译器会尝试二次编译，让之前编译出现错误的代码经过转换后能够编译通过。
        // 这个转换过程看不见，但是存在，就称之为隐式转换,所谓的隐式转换，其实就是类型的转换
        implicit def transform( d : Double ): Int = {
            d.toInt
        }

        val age : Int = thirdPart()
        println(age)

        val b : Byte = 10
        val ii = b

    }
    def thirdPart(): Double = {
        30.0
    }
}
