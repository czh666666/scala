package com.czh.scala.day5

object Scala03_Transform {

    def main(args: Array[String]): Unit = {

        // OCP

        // 隐式参数
       def reg( implicit password : String = "000000" ): Unit = {
           println("默认密码：" + password)
       }



        // 隐式变量
        // 隐式参数不用传递，这个传递的过程由编译器完成
        // 在同一个作用域中，如果相同的转换规则的多个数据，会发生错误
        implicit val password : String = "111111"
        reg
       reg()
        reg("123123")

//        val list = List(1,4,3,2)
//        list.sortBy(num=>num)(Ordering.Int.reverse)
//        list.sortBy(num=>num)
    }
}
