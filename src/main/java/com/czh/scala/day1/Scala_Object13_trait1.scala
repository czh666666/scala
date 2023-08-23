package com.czh.scala.day1

object Scala_Object13_trait1 {
  def main(args: Array[String]): Unit = {

    // TODO 面向对象 - 特征
    // 动态混入(方便扩展)
    val user = new User() with Updateuser
    user.insertUser()
    user.updateUser()

  }
  //    class Parent {
  //                def updateUser(): Unit = {
  //                    println("update user...")
  //                }
  //    }
  trait Updateuser {
    def updateUser(): Unit = {
      println("update user...")
    }
  }
  class User {
    def insertUser(): Unit = {
      println("insert user...")
    }
    //        def updateUser(): Unit = {
    //            println("update user...")
    //        }
  }

}