package com.czh.scala.day2

import scala.collection.mutable.ArrayBuffer

object Scala01_Collection9_flatten {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 方法
            val array = ArrayBuffer(
                ArrayBuffer(
                    ArrayBuffer(1,2),ArrayBuffer(5,6)
                ), ArrayBuffer(
                    ArrayBuffer(3,4),ArrayBuffer(7,8)
                )
            )

    println(array.length)
    // 将整体拆分成个体的操作，称之为扁平化
    // 扁平化操作只能对最外层进行操作
    println(array.flatten.flatten)

    val array1 = Array(
      "Hello Scala", "Hello Hadoop"
    )

    println(array1.flatten.mkString(","))

    println(array1.flatMap(
      str => {
        str.split(" ")
      }
    ).mkString(","))

  }
}
