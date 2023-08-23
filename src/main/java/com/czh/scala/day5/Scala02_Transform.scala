package com.czh.scala.day5

object Scala02_Transform {

    def main(args: Array[String]): Unit = {

        // 使用implicit声明的函数为隐式函数。
        implicit def thransform( user:User ): UserExt = {
            new UserExt()
        }

        val user = getUser()
        user.insertUser()
        user.updateUser()

    }
    class UserExt {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
    trait Updateuser {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
    class Parent {
    //        def updateUser(): Unit = {
    //            println("update user...")
    //        }
    }
    class User {
        def insertUser(): Unit = {
            println("insert user...")
        }
//        def updateUser(): Unit = {
//            println("update user...")
//        }
    }
    def getUser() = {
        new User()
    }
}
