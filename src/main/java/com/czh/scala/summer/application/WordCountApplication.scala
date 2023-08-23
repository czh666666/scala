package com.czh.scala.summer.application

import com.czh.scala.summer.common.TApplication
import com.czh.scala.summer.controller.WordCountController


object WordCountApplication extends TApplication with App{

    execute {
        val controller = new WordCountController
        controller.dispatch()
    }
}
