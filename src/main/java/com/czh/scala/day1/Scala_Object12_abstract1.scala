package com.czh.scala.day1

object Scala_Object12_abstract1 {
  def main(args: Array[String]): Unit = {
    // TODO 面向对象 - 抽象 - 属性
    // scala中属性也可以是抽象的，底层实现时其实就是抽象方法

    // TODO 面向对象 - 抽象

    // 子类重写父类的抽象方法，直接补充完整即可
    // 子类重写父类的完整方法，必须添加override关键字
    // 开发时，推荐，只要重写，都添加overr

    // TODO 面向对象 - 抽象

    // 子类可以重写父类的抽象属性，补充完整即可
    // 子类可以重写父类的完整属性，那么必须要添加override关键字

  }
  abstract class User {
    // 抽象属性：只有声明，没有初始化
    // 编译时，不会在类中声明属性，而是会声明属性的set，get方法，并且是抽象的。
    var name:String
  }
  class Child extends User {
    // 属性：编译时，会在类中声明私有属性，同时提供属性的set，get方法，并且为公共的。
    var name:String = "zhangsan"
  }
}