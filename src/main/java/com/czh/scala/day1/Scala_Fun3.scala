package com.czh.scala.day1

object Scala_Fun3 {
  def main(args: Array[String]): Unit = {
    // TODO 函数式编程 - 柯里化（Curry）

    // 将无关的参数分离开
    def test( a:Int, b:Int ): Unit = {
      for ( i <- 1 to a ) { // 10min
        println(i)
      }
      for ( j <- 1 to b ) { // 20min
        println(j)
      }
    }
//声明多个参数列表，分离参数
    def test1(a:Int)(b:Int): Unit = {
      for ( i <- 1 to a ) { // 10min
        println(i)
      }
      for ( j <- 1 to b ) { // 20min
        println(j)
      }
    }

    val a = 10 // 10min
    val b = 20 // 20min
    test(a, b) // 60min
    test1(a)(b)


    // TODO 函数式编程 - 递归
    //   1. scala中要求递归函数必须明确声明返回值类型
    //   2. 函数内部调用自身
    //   3. 一定要有跳出递归的逻辑
    //   4. 递归函数在调用时传递的参数之间有关系
    // 阶乘
    // 5!
    // StackOverflowError
    // Overflow : 滚动
    //        def myRecursion(num:Int):Int = {
    //            if ( num <= 1 ) {
    //                1
    //            } else {
    //                num * myRecursion(num-1)
    //            }
    //        }
    //
    //        println(myRecursion(5))

    def myRecursion(num:Long):Long = {
      if ( num <= 1 ) {
        1
      } else {
        num + myRecursion(num-1)
      }
    }

    println(myRecursion(10000))

    // TODO 函数式编程 - 递归
    def test11(): Unit = {
      test11()
      println("test11")
    }
    test11()

    // Scala中尾递归不是真正的递归，是由编译器进行了优化，形成了while循环。所以应该称之为伪递归
    // java中也有尾递归。但是不会优化为while循环。
    // 尾递归也会出现
    // 伪递归
    // 尾递归
    def test111(): Unit = {
      println("test111")
      test111()
    }
    test111()
  }
}

