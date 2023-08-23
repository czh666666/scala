package com.czh.scala.day2

import scala.collection.mutable

object Scala12_Collection_Par {
  /**
   * par 并行
   * @param args
   */
    def main(args: Array[String]): Unit = {

        val result1 = (0 to 20).map{
            x => {
                Thread.currentThread.getName
            }
        }
        val result2 = (0 to 20).par.map{
             x =>  {
                 Thread.currentThread.getName
             }
        }

        println(result1)
        println(result2)


    }

}
