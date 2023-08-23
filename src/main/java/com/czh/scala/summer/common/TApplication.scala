package com.czh.scala.summer.common

import com.czh.scala.summer.util.EnvCache


trait TApplication {

    def execute( op: =>Unit ): Unit = {
        EnvCache.put("e:/")
        println("开启环境")

        try {
            op
        } catch {
            case e: Exception => e.printStackTrace()
        }

        println("释放环境")
        EnvCache.clear()
    }
//    def execute(): Unit = {
//        // 模板方法设计模式
//        println("开启环境")
//
//        try {
//            doExecute()
//        } catch {
//            case e: Exception => e.printStackTrace()
//        }
//
//        println("释放环境")
//    }
//    def doExecute():Unit
}
