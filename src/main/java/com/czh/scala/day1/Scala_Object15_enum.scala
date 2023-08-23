package com.czh.scala.day1

import java.lang.reflect.Field

object Scala_Object15_enum {
  def main(args: Array[String]): Unit = {
    println(Color.RED.id)


  }
}
// 枚举类
object Color extends Enumeration {
  val RED = Value(1, "red")
  val YELLOW = Value(2, "yellow")
  val BLUE = Value(3, "blue")
}