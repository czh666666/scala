package com.czh.scala.day2

import scala.collection.mutable

object Scala07_Collection_Set {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Set
        // 数据无序，不可重复
        // 不可变Set
        //val set = Set(1,2,3,4,1,2,3,4)
        // 可变Set
        val set = mutable.Set(1,2,3,4)

        //set.add(5)

        // update方法用于更新set集合
        set.update(5, true)
        println(set)
        set.update(4, false)
        println(set)

        set.remove(3)
        println(set)



    }

}
