package com.czh.scala.day2

object Scala01_Collection {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 数组
    // 数组 ：严格意义上，数组不是集合
    //      scala中给数组一个特定的类型：Array
    // TODO 构建
    // String[]
    // 构建Scala中的数组，其实等同于构造Java的数组
    val array = new Array[String](3)
    println(array)

    println("*************")
    // 访问
    // 可以根据索引访问数组的元素
    //array.update(1, "abc")
    // 中括号在scala中表示泛型，所以不能在索引操作中使用，使用小括号
    array(1) = "abc"
    //取元素
    val str = array.apply(0)
    println(str)
    println("*************")
    // 遍历
    for ( i <- array ) {
      println(i)
    }
    println("*************")
    val strings = array.clone()
    println(strings)

  }
}
