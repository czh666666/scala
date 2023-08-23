package com.czh.scala.summer.service

import com.czh.scala.summer.common.TService
import com.czh.scala.summer.dao.WordCountDao


class WordCountService extends TService {

    private val wordCountDao = new WordCountDao

    def analysis() = {

        val lines = wordCountDao.readFile("data/word.txt")

        val words = lines.flatMap(
            line => {
                line.split(" ")
            }
        )

        val wordGroup = words.groupBy(word => word)
        val wordCount = wordGroup.mapValues(
            v => {
                v.size
            }
        )
        wordCount
    }
}
