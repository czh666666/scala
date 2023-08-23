package com.czh.scala.day1

import java.lang.reflect.Field

object Scala_Object14_fanshe {
  def main(args: Array[String]): Unit = {

    val s = " a b "

    // 反射：类型信息
    // 镜子
    val stringClass: Class[String] = classOf[String]
    val field: Field = stringClass.getDeclaredField("value")
    field.setAccessible(true)
    val obj = field.get(s)
    val chars: Array[Char] = obj.asInstanceOf[Array[Char]]
    chars(2) = 'D'

    println(s)


  }
}