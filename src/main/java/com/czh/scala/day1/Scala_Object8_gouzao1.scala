package com.czh.scala.day1

object Scala_Object8_gouzao1 {
  def main(args: Array[String]): Unit = {
    // Java中的构造方法

    //val user = new User("zhangsan")

    // TODO 如果提供了类的构造方法，那么jvm不会再给类提供无参的构造方法
    //    之所以在类名后面提供构造方法，主要目的就是为了类的初始化

    // 马丁将构造方法分为2大类 ： 主构造方法 & 辅助构造方法
    // 用于完成类的初始化操作的构造方法称之为主构造方法
    // 其他的构造方法就称之为辅助构造方法, 辅助构造方法的名字是this关键字，其他和普通方法一样
    // 辅助构造方法的作用就是在类初始化完成后，做一些辅助功能。
    // 辅助构造方法在执行之前，应该首先调用主构造方法完成类的初始化
    // 辅助构造方法可以重载的,并且可以互相调用,但是调用的辅助构造方法应该提前声明
    //new User("lisi")
    //new User()
    new User(20)
  }
  class User(name:String) {
    println("aaaaa")
    // 辅助构造方法
    //        def this() {
    //            this(20)
    //        }
    def this(age:Int) {
      //this()
      this("zhangsan")
      println("bbbbb")
    }
  }

}
