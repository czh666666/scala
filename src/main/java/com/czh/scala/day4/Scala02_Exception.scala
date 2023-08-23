package com.czh.scala.day4

import java.io.FileNotFoundException

object Scala02_Exception {

    def main(args: Array[String]): Unit = {
    }
    @throws[Exception]
    def test(): Unit = {
        throw new Exception("abc");
    }
}
