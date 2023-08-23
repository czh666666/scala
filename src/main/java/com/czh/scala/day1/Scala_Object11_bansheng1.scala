package com.czh.scala.day1

object Scala_Object11_bansheng1 {

  def main(args: Array[String]): Unit = {

    // TODO scala中伴生对象就是单例的
    // 伴生对象只需要声明即可，无需构建，所以不需要构造参数列表
    // 单例模式存在一个问题：创建的对象不会被回收，需要显示地回收（设置为null）

    // 如果伴生对象中构建对象的方法名成为apply，编译器可以自动识别的，所以这个方法名可以省略的
    //val test1: Test = Test.apply()
    val test1 = new Test() // 调用类的构造方法
    println("**********************")
    val test2 = Test()     // 调用的是伴生对象的apply方法
    println("**********************")
    val test3 = Test       // 伴生对象本体
    println(test3)


  }
  class Test() {
    println("ttttt")
  }
  object Test {
    def apply() = {
      println("apply")
      //new Test()
    }
  }
}