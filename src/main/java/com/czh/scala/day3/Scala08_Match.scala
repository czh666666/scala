package com.czh.scala.day3

object Scala08_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配 - 偏函数

        // 将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串
        val list : List[Any] = List(1,2,3,4,5,6,"test")

        //val newlist = list.map(_ + 1)

        //newlist.filter()

        //val newlist : List[Any] = list.filter(_.isInstanceOf[Int])
        //val newlist1 = newlist.map(_.asInstanceOf[Int] + 1)
        //println(newlist1)
        val list1 = list.map {
            case i : Int => {
                i + 1
            }
            case other => other
        }.filter(_.isInstanceOf[Int])

        println(list1)


    }
}
