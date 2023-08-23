package com.czh.scala.day2

object Scala05_Collection_WordCount_4 {

    def main(args: Array[String]): Unit = {

        // TODO WordCount
        val list = List(
            ("Hello Scala", 4),
            ("Hello World", 2)
        )

        // ("Hello Scala", 4) => ("Hello", 4),("Scala", 4)
        // ("Hello World", 2) => ("Hello", 2),("World", 2)
        val list1 = list.flatMap(
            t => {
                val line = t._1
                val cnt = t._2

                val datas = line.split(" ") // Hello,Scala => (Hello, 4), (Scala, 4)
                datas.map(
                    word => {
                        (word, cnt)
                    }
                )

            }
        )
        val groupData: Map[String, List[(String, Int)]] = list1.groupBy(_._1)

        /*
           Map(
               Hello -> List((Hello,4), (Hello,2)),
               Scala -> List((Scala,4)),
               World -> List((World,2)))

           Map(
               Hello -> List(4, 2),
               Scala -> List(4),
               World -> List(2))

           Map(
               Hello -> 6,
               Scala -> 4,
               World -> 2
         */
        val groupData1 = groupData.mapValues(
            list => {
                list.map(_._2).sum
            }
        )

        println(groupData1)

    }

}
