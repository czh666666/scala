package com.czh.scala.day5


object Scala05_Transform extends Parent with MyTrait {

    def main(args: Array[String]): Unit = {

        // TODO 隐式转换的范围:
        // TODO 1. 当前代码作用域
        // TODO 2. 父类或伴生对象
        // TODO 3. 特征或伴生对象
        // TODO 4. 在其他地方声明（包对象）
        // TODO 5. 直接导入

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
class Parent {
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
}
object Parent {
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
}
trait MyTrait {
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
}
object MyTrait {
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
}