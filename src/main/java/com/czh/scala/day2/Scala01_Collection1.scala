package com.czh.scala.day2

import scala.util.Random

object Scala01_Collection1 {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 数组
    // 集合分为两大类：可变集合，不可变集合
    // Scala默认提供的集合都是不可变。
            val array = new Array[String](3)
            array(0) = "a"
            array(1) = "b"
            array(2) = "c"
    for (i <- array){
      println(i)
    }


    println("**********************")

    val array1 = Array(1,2,3,4)
    val array2 = Array(5,6,7,8)
    val ints: Array[Int] = array1.+:(5)
    println(array1.toBuffer)
    println(array2.toBuffer)
    println(ints.toBuffer)
    println(ints.mkString(","))
    println("**********************")

    // foreach方法是一个循环的方法，需要传递一个参数，这个从参数的类型是函数类型
    //  函数类型 ： Int => U
    def foreachFunction(num:Int): Unit = {
      println(num)
    }
/*    array1.foreach(foreachFunction)
    array1.foreach((num:Int)=>{println(num)})
    array1.foreach((num:Int)=>println(num))
    array1.foreach((num)=>println(num))
    array1.foreach(num=>println(num))*/
    array1.foreach(println(_))
  }
}
