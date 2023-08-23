package com.czh.scala.summer.controller

import com.czh.scala.summer.common.TController
import com.czh.scala.summer.service.WordCountService


class WordCountController extends TController {

    private val wordCountService = new WordCountService

    // 调度
    def dispatch(): Unit = {
        val wordCount: Map[String, Int] = wordCountService.analysis()
        println(wordCount)
    }
}
