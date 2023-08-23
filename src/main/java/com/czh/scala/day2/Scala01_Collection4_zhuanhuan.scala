package com.czh.scala.day2

import java.util
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala01_Collection4_zhuanhuan {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 数组 - 可变数组
    val array = Array(1,2,3,4)

    // 不可变 => 可变
    val buffer: mutable.Buffer[Int] = array.toBuffer

    val buff = ArrayBuffer(1,2,3,4)
    // 可变 => 不可变
    val array1: Array[Int] = buff.toArray

    // Java集合 <=> Scala集合
    array1.foreach(println)
    // Java集合 => Scala集合
    import scala.collection.JavaConverters._
    val list = new java.util.ArrayList[String]()
    println(list)
    list.add("a")
    list.add("b")
    println(list.asScala.mkString("-"))
    list.asScala.foreach(println)

    // Java集合 <= Scala集合
    //val java: util.List[Int] = List(1, 2, 3, 4).asJava
    //println(java)
  }
}
