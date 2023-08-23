package com.czh.scala.day1

object Scala_Object13_trait2 {
  def main(args: Array[String]): Unit = {

    // TODO 面向对象 - 特征(特质)
    // 可以将trait理解为接口和抽象类的结合体
    // 1. 初始化问题
    //    父类的特质 > 父类 > 特质1, 特质2 > 当前类
    new User()


  }

  trait Test extends Test1{
    println("aaaa")
  }
  trait Test1 {
    println("dddd")
  }
  class Person{
    println("bbbb")
  }
  class User extends Person with Test with Test1 {
    println("cccc")
  }
}