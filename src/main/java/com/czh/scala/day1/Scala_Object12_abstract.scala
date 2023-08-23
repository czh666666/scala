package com.czh.scala.day1

object Scala_Object12_abstract {
  def main(args: Array[String]): Unit = {

    // TODO 面向对象 - 抽象
    // 所谓的抽象其实就是不完整
    // 抽象类，抽象方法
    // 抽象类没有办法直接实例化，需要由子类继承后完成实例化操作
    // 子类继承抽象类后，可以声明为抽象类，也可以将父类的抽象方法补充完整。
    // scala中不完整的方法就是抽象，所以无需增加abstract关键字。
    val user = new Child()


  }
  abstract class User {
    // 抽象方法:只有声明，没有实现
    def test():Unit
  }
  class Child extends User {
    def test():Unit = {

    }
  }
}