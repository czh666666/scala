package com.czh.scala.day1

object Scala_Object2_import {
  def main(args: Array[String]): Unit = {

    // TODO  - 面向对象编程 - 导入
    /*

     TODO java import :
      1. 导入其他包中的类
      2. 静态导入

      scala import :
      java中的import功能比较单一，但是不能省略
      马丁想：赋予import更多的功能
     */
    // TODO 1. 星号在scala中有特殊用于，所以不能使用在import语法中,需要采用特殊符号：下划线
    //import java.util._
    // TODO 2. import关键字可以在任何地方使用
    //import java.util.Date
    //new Date()
    // TODO 3. 可以在一行中导入同一个包中多个类
    //import java.util.{ArrayList, List, LinkedList}
    //new ArrayList()
    // TODO 4. 导包
    //import java.util
    //new util.ArrayList()

    // TODO 5. 隐藏类
    //import java.util._
    //import java.sql.{Date=>_, _}
    //new Date()
    //new ArrayList();
    //new Timestamp(111)

    // TODO 6. scala中导入类的操作，是以相对路径（当前包路径）的方式导入的。
    //         如果想要使用绝对路径的方式，那么需要增加特殊操作:_root_
    println(new _root_.java.util.HashMap())
    // { k = v, k =v }
    // [a, b, c, d]

    // TODO 7. 给类起别名
    import java.util.{HashMap=>JavaHashMap}
    println(new JavaHashMap())
    // TODO 面向对象 - 类
    // 使用class关键字可以声明类

    // TODO 通过new的方式构建类的对象
    // TODO scala中的源码可以声明多个类，而且可以声明多个公共类，名称可以和文件名不一样。

  }
}

