package com.czh.scala.day1

object Scala_Object7_gouzao {
  def main(args: Array[String]): Unit = {
    // Java中的构造方法
    // 1. 提供无参，公共的构造方法
    // 2. 构造方法可以重载的
    // 3. 构造方法可以互相调用
    // 4. 必须显示调用父类有参的构造方法
    // 5. 构造方法的名称应该和类型一致。

    // Scala中的构造方法
    // 1. 提供无参，公共的构造方法
    // 2. scala中构造方法的名称和类名是不一致的。

    // scala是一个完全面向对象的语言，又是一个完全面向函数的语言。
    // 所以类也是一个函数：声明一个类就等同于声明一个函数
    // 类名的后面可以声明小括号，表示构造参数列表
    val user = new User()



  }
  class User() {
    // 类的初始化
    // 构造方法体 & 类的主体内容
    val name : String = "zhangsan"
    def test(): Unit = {

    }
    println("user...")
  }
}
