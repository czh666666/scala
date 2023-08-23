package com.czh.scala.day1

object Scala_Object9_gouzao2 {
  def main(args: Array[String]): Unit = {

    /*
      class User {
          private String name;
          public User( String name ) {
              this.name = name;
          }
      }
     */
    // TODO 在构造参数前使用var或val声明
    //可以改变值，默认val不可修改的
    val user = new User("zhangsan");
    user.name = "wangwu"
    println(user.name)

  }
  class User(var name:String) {
    //var username : String = name
  }
}
