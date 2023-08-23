package com.czh.scala.day2

import scala.collection.mutable.ArrayBuffer

object Scala01_Collection3_mutable {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 数组 - 可变数组
    //val buffer = new ArrayBuffer[String]()
    val buffer = ArrayBuffer( "a","b", "c")
    println(buffer)
    // TODO 操作
    buffer.append("a", "b", "c", "d")
     buffer.appendAll(Array("a", "b", "c"))
    //buffer.insert(100, "f")

    //buffer.update(0, "e")
    //buffer(0) = "e"


    //buffer.remove(2,2)

    val strings: ArrayBuffer[String] = buffer - "a"
    buffer.remove(0)
    println(buffer eq strings)
    println(buffer)
    println(strings)
  }
}
