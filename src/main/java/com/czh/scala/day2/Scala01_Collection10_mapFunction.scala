package com.czh.scala.day2

import scala.collection.mutable.ArrayBuffer

object Scala01_Collection10_mapFunction {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 方法
    val array = ArrayBuffer(1,2,3,4)

    // TODO 功能函数：由集合对象提供函数执行自定义的功能
    //  1. map => 映射(转换) => K->V
    //     a => b

    // map方法需要传递一个参数，这个参数的类型为函数类型: Int => B
    def mapFunction( num:Int ): Int = {
      num * 2
    }

    println(array.map(mapFunction))

    //        println(array.map(
    //            (num:Int) => {
    //                num * 2
    //            }
    //        ))

    println(array.map(_*2))

  }
}
