package com.czh.scala.day2

object Scala13_Collection_Method_7 {

    def main(args: Array[String]): Unit = {

        val user1 = new User()
        user1.age = 20
        user1.salary = 2000
        val user2 = new User()
        user2.age = 30
        user2.salary = 2000
        val user3 = new User()
        user3.age = 30
        user3.salary = 1000

        val users = List(
            user1, user2, user3
        )

        println(users.sortBy(_.age)(Ordering.Int.reverse))
println(
    "********************************"
)
        // Tuple : 元组,可以默认排序，先比较第一个，如果相同，比较第二个，依此类推
        println(
            users.sortBy(
                user => {
                    ( user.age, user.salary )
                }
            )(Ordering.Tuple2[Int, Int]( Ordering.Int, Ordering.Int.reverse ))
        )
println(
    "**********************************"
)
        // 自定义排序
        println(users.sortWith(
            (user1, user2) => {
                // 将你期望的结果，返回为true
                //user1.salary > user2.salary
                if ( user1.age < user2.age ) {
                    true
                } else if (user1.age == user2.age ) {
                    user1.salary < user2.salary
                } else {
                    false
                }
            }
        ))


    }
    class User {
        var age : Int = _
        var salary : Int = _

        override def toString: String = {
            return s"User[${age}, ${salary}]"
        }
    }
}
