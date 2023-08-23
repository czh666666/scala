package com.czh.scala.day1

object Scala_Class {
  def main(args: Array[String]): Unit = {
 /*   var age = 19
    if(age >18)
      println("大于18")
    else
      println("dfsd")
      println("dsadaa")*/

    //for(i <- 数组 集合 表达式 字符串)
    val arr = Array(1, 2, 3)
    for(i <- arr){
      println(i+" ")
    }
    println("*************************")
    for(i <- "acbsd"){
      println(((i+1)).toInt.toChar)
    }
    println("*************************")
    for(i <- "bdcte"){
      println(((i-1)).toInt.toChar)
    }
    println("*************************")
    for(i <- "bdcte".toCharArray){
      println((i-1).toChar)
    }
    println("*************************")
    //    （1）循环守卫
    for (i <- 0 to 10 if i >5){
      println(i)
    }
    println("*************************")
    //    （2）循环步长
    for (i <- 0 to 10 by 2) {
      println(i)
    }
    println("*************************")
    //99乘法表
    for(i <- 1 to 9 ; j <- 1 to i){
      print(s"$j * $i = ${i*j}   ")
      if (i == j) {
        println()
      }
    }
    println("*************************")
    for(i <- 1 to 9){
      for (j <- 1 to i){
        print(s"$j * $i = ${i*j}   ")
      }
      println()
    }
    println("*************************")
    //    （5）循环返回值
    val ints = for (i <- 0 to 3) yield {
      10
    }
    println(ints)
    println("*************************")
    for (i <- 0 to 3) yield println(i * 100)
    println("*************************")
    //    （6）倒序打印
    for (i <- 0 to 10 reverse){
      print(i +"  ")
    }
    println()
    println("*************************")
    for ( i <- Range(5, 0, -1) ) {
      print(i + " ")
    }
    println()
    println("*************************")
    val re = for ( i <- Range(5, 0, -1) )yield {
      print(i + " ")
      i+2
    }
    println(re)
    println("*************************")
    val result = for ( i <- 1 to 5 ) yield {
      i * 2
    }
    println(result)
    println("*************************")

    // TODO for循环
    // 表达式的返回值
    // 输出等腰三角形  n1/2行
    var n1 = 20;
    for (i <- 1 to n1 by 2; j = (n1 - i)/2) {
      println(" " * j + "*" * i)
    }
    println("================================")

    //输出等腰三角形
    val n = 5 //定义等要三角形的总行数
    //输出总行数
    for (i <- 1 to n) { //输出每行空格   呈递减状态
      for (j <- 1 to n - i) {
        System.out.print(" ")
      }
      //输出每行*，递增状态
      //第一行1个*   第二行3个* 第n行2n-1个*
      for (k <- 1 to 2 * i - 1) {
        System.out.print("*")
      }
      System.out.println() //每行输出后加换行

    }
    println("================================")
  }
}
