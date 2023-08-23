package com.czh.scala.day2

import scala.collection.mutable

object Scala09_Collection_Tuple {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Tuple
        // 1, zhangsan, 30
        //List(1, "zhangsan", 30)
        // scala可以将无关的元素组合在一起，形成一个整体来进行访问，这种整体结构称之元素组合
        // 简称元组 - Tuple
        val t : (Int, String, Int) = (1, "zhangsan", 30)
        // 因为元组中的数据没有关系，所以只能通过顺序号进行访问
        println(t._1)
        println(t._2)
        println(t._3)
        // Tuple也是一个集合对象，所以也有类型
        // (Int, String, Int)
        // scala中元组也有专门的类型
        val t1 : Tuple3[Int, String, Int] = (1, "zhangsan", 30)

        // Tuple类型最多存放元素的数量为22个。但是类型没有约束的。

        println(t)





    }
    class User {
        var id:Int = 1
        var name:String = "zhangsan"
        var age:Int = 30
    }

}
