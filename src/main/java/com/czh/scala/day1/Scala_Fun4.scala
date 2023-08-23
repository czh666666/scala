package com.czh.scala.day1

object Scala_Fun4 {
  def main(args: Array[String]): Unit = {

    // TODO 函数式编程 - 惰性函数     lazy

    // 函数结果没使用，那么这个函数就不会执行
    def fun9(): String = {
      println("function...")
      "zhangsan"
    }

    lazy val a = fun9() // Load 10000User
    println("----------") // 2Min
    println(a) // 10000 User

    // function...
    // ----------
    // zhangsan

  }
}

