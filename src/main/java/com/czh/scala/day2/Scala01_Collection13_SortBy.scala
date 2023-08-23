package com.czh.scala.day2

import scala.collection.mutable.ArrayBuffer

object Scala01_Collection13_SortBy {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 方法
    //val array = ArrayBuffer(1,4,2,3)
    val array = ArrayBuffer("1", "11", "2", "3", "22")

    // 排序:通过指定的规则对每一条数据进行排序处理， 默认为升序
    println(array.sortBy(
      num => num.toInt
    ))

    println(array.sortBy(num => num.toInt)(Ordering.Int.reverse))

  }
}
