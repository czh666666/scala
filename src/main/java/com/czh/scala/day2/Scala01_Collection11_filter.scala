package com.czh.scala.day2

import scala.collection.mutable.ArrayBuffer

object Scala01_Collection11_filter {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 方法
    val array = ArrayBuffer(1,2,3,4)

    // filter方法可以对集合中的每一条数据进行筛选过滤
    // 满足条件（true）的数据保留，不满足条件(false)的数据丢弃
    val r = array.filter(
      num => {
        num % 2 != 0
      }
    )
    println(r)
  }
}
