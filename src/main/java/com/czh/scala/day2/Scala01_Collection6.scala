package com.czh.scala.day2

import scala.collection.mutable.ArrayBuffer

object Scala01_Collection6 {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 方法
    val array = ArrayBuffer(1,2,3,4)

    // 从集合中获取部分数据

    //获取头
    println(array.head)
    //获取除了头以外的数据
    println(array.tail)
    //迭代
    println(array.tails)
    println(array.tails.mkString("-"))
    //取最后一个
    println(array.last)
    //除了最后一个的前面所有
    println(array.init) // 初始
    //迭代的
    println(array.inits)
    // 取前几个
    println(array.take(3))
    //取后两个
    println(array.reverse.take(2).reverse)
    //取后两个
    println(array.takeRight(2))
    //丢弃第一个
    println(array.drop(1))
    //丢弃后一个
    println(array.dropRight(1))
  }
}
