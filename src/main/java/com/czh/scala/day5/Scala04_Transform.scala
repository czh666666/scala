package com.czh.scala.day5


object Scala04_Transform {

    def main(args: Array[String]): Unit = {

        // 声明类
        // 声明方法
        // user => userExt
//        implicit def transform( user : User ): UserExt = {
//            new UserExt(user)
//        }
        // scala中可以将implicit关键字声明在类的前面。称之为隐式类,不能为顶级对象

        val user = new User()
        user.insertUser()
        user.updateUser()

    }
    implicit class UserExt(user:User) {
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
