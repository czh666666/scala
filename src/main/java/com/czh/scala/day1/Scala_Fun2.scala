package com.czh.scala.day1

import scala.util.control.Breaks

object Scala_Fun2 {
  def main(args: Array[String]): Unit = {
    /**
     * 控制抽象
     * @param op
     */
    // TODO : 控制抽象
    // 抽象
    // 函数类型：() =>Unit
    def fun(op: => Unit) = {
      op
    }
    fun(println("dssdfs"))
    // 参数类型不完整，那么在传递参数时，也是不完整：只有传递代码就可以，不需要完整的声明
    // 可以采用控制抽象设计语法

    def fun1(op: => String) = {
      op
    }

    val str = fun1(
      "nihao"
    )
    println(str)

  }
}

