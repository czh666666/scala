package com.czh.scala.day3

object Scala06_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配 - 匹配规则

        val user = getUser()
        //user.name = "lisi"
        user match {
            case User("zhangsan",40) => println("用户为张三")
            case _ => println("什么也不是")
        }

    }
    // 如果在类的前面的增加case关键字，这个类专门用于模式匹配，称之为样例类
    // 在编译时，会自动生成大量的方法
    // 1. 样例类会自动实现可序列化接口
    // 2. 样例类的构造参数直接能够作为属性使用，但是不能修改，如果想要修改，需要将参数使用var声明
    // 3. 增加和重写了大量的方法
    // 4. 样例类自动生成伴生对象，而且其中自动声明了apply，unapply
    case class User(var name:String, age:Int)
    def getUser() = {
        User("zhangsan", 40)
    }
}
