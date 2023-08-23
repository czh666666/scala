package com.czh.scala.day2

import scala.collection.mutable.ArrayBuffer

object Scala01_Collection12_groupBy {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 方法
            val array = ArrayBuffer(1,2,3,4)

            // 根据指定的规则对每一条数据进行分组
            val r = array.groupBy(
                num => {
    //                if ( num % 2 == 0 ) {
    //                    "偶数"
    //                } else {
    //                    "奇数"
    //                }
                    num % 2
                }
            )

            println(r)
    val array1 = ArrayBuffer(
      "Hello", "Scala", "Hadoop", "Spark"
    )
    //分组规则
    println(array1.groupBy(_.substring(0, 1)))
  }
}
