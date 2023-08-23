package com.czh.scala.day3

object Scala05_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配 - 匹配规则
        // 匹配对象
        // apply : Attribute => Object
        val user = getUser()
        
        // unapply : Object => Attribute

        user match {
            case User("zhangsan",40) => println("用户为张三")
            case _ => println("什么也不是")
        }

    }
    class User {
        var name:String = _
        var age:Int = _
    }
    object User {
        // Object => Attribute
        def unapply(user: User): Option[(String, Int)] = {
            Option( (user.name, user.age) )
        }

        // Attribute => Object
        def apply( name : String, age:Int ) = {
            val user = new User()
            user.name = name
            user.age = age
            user
        }
    }
    def getUser() = {
        User("zhangsan", 30)
    }
}
