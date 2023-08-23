package com.czh.scala.summer.common



import com.czh.scala.summer.util.EnvCache

import scala.io.{BufferedSource, Source}

trait TDao {
    def readFile(  path : String ) = {
        // e:/data/word.txt
        val source: BufferedSource = Source.fromFile(EnvCache.get() + path)
        val lines = source.getLines().toList
        source.close()
        lines
    }
}
