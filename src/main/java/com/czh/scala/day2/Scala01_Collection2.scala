package com.czh.scala.day2

import scala.util.Random

object Scala01_Collection2 {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 数组
    // 多维数组
    var myMatrix = Array.ofDim[Int](3,4)
    myMatrix.foreach(list=>println(list.mkString(",")))

    val arr1 = Array(1,2,3,4)
    val arr2 = Array(5,6,7,8)
    // 合并数组
    val arr6: Array[Int] = Array.concat(arr1, arr2)
    println(arr6.mkString("*"))

    val random = new Random()
    val index = random.nextInt(arr2.length)
    println(index)

    // 创建指定范围的数组
    val arr7: Array[Int] = Array.range(0,2)
    println(arr7.mkString("*"))
    //填充
    val arr8:Array[Int] = Array.fill[Int](5)(-1)
    arr8.foreach(println)
  }
}
