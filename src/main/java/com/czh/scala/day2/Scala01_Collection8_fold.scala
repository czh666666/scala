package com.czh.scala.day2

import scala.collection.mutable.ArrayBuffer

object Scala01_Collection8_fold {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 方法
    val array = ArrayBuffer(1,2,3,4)
    val num = 5

    // 折叠
    println(array.fold(5)(_ - _))

    // (((5 - 1) - 2) - 3) - 4
    println(array.foldLeft(5)(_ - _))

    // reversed.foldLeft(z)((x, y) => op(y, x))
    // 【1，2，3，4】
    // 【4，3，2，1】
    //  1 - (2  - (3 - (4 - 5)))
    println(array.foldRight(5)(_ - _))

    //println(array.scan(5)(_ - _))
    println(array.scanRight(5)(_-_))


  }
}
