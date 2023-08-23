package com.czh.scala.day2

object Scala01_Collection5 {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 方法
    val array = Array(1,2,3,4)

    println(array.size)
    println(array.length)
    println(array.isEmpty)
    println(array.contains(2))
    println(array.distinct.mkString(","))
    println(array.reverse.mkString(","))

    println(array.mkString(","))
    array.foreach(println)
    println(array.iterator.mkString("-"))
  }
}
