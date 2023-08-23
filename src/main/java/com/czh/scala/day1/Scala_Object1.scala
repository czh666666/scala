package com.czh.scala.day1

object Scala_Object1 {

  def main(args: Array[String]): Unit = {
    //创建对象调用
    val te = new Test1()
    te.test1()
    //调用方法
    test1()

  }
  def test1():Unit = {
    println("test1......method")
  }
  class Test1{
    def test1():Unit = {
      println("test1......function")
    }
  }


  /**
   *
   * // TODO  - 面向对象编程 - 包
   * /*
   * TODO java package :
   *                       1. 分类管理 util.StringUtil, DateUtil
   *                       Lock, aaa.KafkaProducer
   *                       2. 区分类 java.util.UtilDate, java.sql.SQLDate
   *                       3. 包访问权限 （X）
   *
   * SpringBoot => c.a.b.c.d.XXXXX
   *
   * TODO scala
   * 发现package语法过于简单，但是又不能省略。
   * 马丁说：我要赋予它更多的功能
   *                    1. 可以让源码文件中多次使用package关键字
   *                       2. 源码物理路径和包名没有关系
   *                       3. 明确包的作用域，可以在package关键字的后面增加大括号
   *                       4. 同一个源码中，子包中可以直接访问父包中的内容
   *                       5. scaka可以将包当成对象来用
   *                       可以直接声明属性和方法
   *
   * */
   *
   * @param args
   */


}

