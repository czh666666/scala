package com.czh.scala.day2

import scala.collection.mutable.ArrayBuffer

object Scala01_Collection7_reduce {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 方法
    val array = ArrayBuffer(1,2,3,4, 5)

    println(array.sum)
    println(array.max)
    println(array.min)
    println(array.product)

    // 自定义数据操作的方法
    // 集合的数据无论是多少，最基本的数据操作其实都是两两计算。
    // map => reduce => 简化，规约（聚合）

    def reduceFunction(x : Int, y : Int): Int = {
      x + y
    }

    println(array.reduce(reduceFunction))
    println(array.reduce((x:Int, y:Int)=>{x + y}))
    println(array.reduce((x:Int, y:Int)=>x + y))
    println(array.reduce((x, y)=>x + y))
    println(array.reduce(_ - _))  // -13
    println(array.reduceLeft(_ - _)) // -13

    // 【1，2，3，4】
    //  (((1 + 2) + 3) + 4)
    // reversed.reduceLeft[B]((x, y) => op(y, x))
    // 【1，2，3，4, 5】
    // 【5，4，3，2，1】
    //  1 - (2 - (3 - (4 - 5)))
    // 【1，2，3，4】
    // (1 - (2 - (3 - 4)))
    println(array.reduceRight(_ - _)) // 3

  }
}
