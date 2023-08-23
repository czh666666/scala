package com.czh.scala.day1

object Scala_Fun1 {
  def main(args: Array[String]): Unit = {
/*    // TODO 3. 将函数作为返回值返回

    def test(): Unit = {
      println("function...")
    }

    def fun() = {
      test _
    }
    val f = fun _
    println(f)*/








    // TODO 3. 将函数作为返回值返回, 一般应用于将内部的函数在外部使用
    // 这种方式不推荐自己定义类型

/*    def outer() = {
      def inner(): Unit = {
        println("inner...")
      }
      inner _
    }


     outer()()*/

    // TODO 闭包
    // 一个函数使用了外部的变量，把这个变量包含到了它的内部来使用，改变了这个变量的生命周期
    // 将当前的代码形成了一个闭合的环境，这个环境称之为闭包环境，简称为闭包

    // Scala2.12版本前闭包功能采用的是匿名函数类型实现
    // Scala2.12版本闭包功能采用的是更改函数声明实现


    def outer( a : Int ) = {
      def inner( b : Int ): Int = {
        a + b
      }
      inner _
    }

    println(outer(10)(20))
    val f = outer(10)
    val ff = f(20)

    println(ff)

  }
}

