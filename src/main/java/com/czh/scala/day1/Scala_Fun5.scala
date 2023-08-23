package com.czh.scala.day1

object Scala_Fun5 {
  def main(args: Array[String]): Unit = {

    // TODO 函数式编程

    // 函数作用域比较窄
    // 方法的作用域比较大
    def test1(): Unit = {
      println("test function...")
    }

    println(test1() )
    println(Scala_Fun5.test("zhang san"))
    println(Scala_Fun5.test())

  }
  def test(): Unit = {
    println("test method...")
  }
  def test(name:String): Unit = {
    println("test method...")
  }
}

