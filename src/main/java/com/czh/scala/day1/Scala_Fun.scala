package com.czh.scala.day1

object Scala_Fun {
  def main(args: Array[String]): Unit = {
    def fun2( name:String* ): Unit = {
      println(name)
    }

    fun2() // 一个参数都没有 ： List()
    fun2("zhangsan") // 一个参数 WrappedArray(zhangsan)
    fun2("zhangsan", "lisi", "wangwu") // 一个参数 WrappedArray(zhangsan, lisi, wangwu)

    // TODO 3. 参数默认值 : 声明参数的同时设定默认值
    //   底层就是编译为一个方法，当不传参数时，由编译器自动调用这个方法
    // 函数的参数默认以val声明，意味着不能改
    //        def fun3( password:String ): Unit = {
    //            var pswd = password
    //            if ( pswd == null ) {
    //                pswd = "000000"
    //            }
    //        }
    def fun3( password:String = "000000" ): Unit = {
      println(password)
    }

    // 调用时，参数如果想用使用默认值，可以不传递参数
    fun3()
    // 调用时，如果不想使用默认值，注解传值即可
    fun3("111111")

    // TODO 4. 带名参数:传递参数时，增加参数的名称，用于改变传参的顺序
    def fun4( password:String = "000000", name:String  ): Unit = {

    }

    // 参数在传递时默认为顺序匹配。
    // scala可以通过特殊的语法改变传值的顺序
    fun4(name="zhangsan")

//            def test( password:String = "000000", name:String* ): Unit = {
//
//            }
//            // 可变参数和参数默认值是不能联合声明
//           // test()
//            test("000000")
//            test("000000", "zhangsan")
//            test("000000", "zhangsan", "lisi")

    // TODO 1. return 关键字可以省略
    // 函数体会将满足条件的最后一行的代码的执行结果作为函数的返回值
    def test1(): String = {
      "lisi"
    }
    //println(test1())

    // TODO 2. 如果函数返回数据，那么可以推断出返回值类型的话，返回值类型可以省略
    def test2() = {
      "wangwu"
    }

    //        def test22() = {
    //            val age = 30
    //            if ( age == 30 ) {
    //                "zhangsan"
    //            } else {
    //                null
    //            }
    //        }
    // println(test2())

    // TODO 3. 如果函数体的逻辑代码只有一行的，那么大括号可以省略
    def test3() = "wangwu1"
    //println( test3() )

    // TODO 4. 如果函数的参数列表中没有声明任何的参数，那么参数列表可以省略
    def test4 = "wangwu2"
    var test44 = "wangwu2"

    // 当函数省略参数列表的声明时，调用这个函数不能增加小括号的
    //println( test4 )

    // TODO 5. 如果希望省略Unit，但同时又不希望函数体中的return起作用，那么可以将等号同时省略
    // 如果函数明确声明为Unit，那么函数体中的return关键字不会被返回
    def test5(): Unit = {
      return "zhangsan"
    }
    // 如果函数体中使用return返回结果，那么一定要声明返回值类型
    //        def test55() = {
    //            return "zhangsan"
    //        }
    // 过程函数
    def test555()  {
      return "zhangsan"
    }

    //def test5555() return "zhangsan"

    //println(test5())

    // TODO 6. 关键字def和函数名也可以省略，称之为匿名函数
    // 省略的同时，也需要将返回值类型同时省略，将等号增加一个箭头
    // 匿名函数不能独立使用
    //println(List(1, 2, 3, 4).reduce(_ - _))
    val f = () => {
      "zhangsan123"
    }

    println(f())
    println("****************************")

    // TODO 如果将函数作为整体，而不是执行结果赋值给变量，那么需要采用特殊符号：下划线
    def fun1(): Unit = {
      println("fun1...")
    }
    val f1 = fun1 _
    println(f1)
    val f2 = fun1()
    println(f2)

    // TODO 函数独立使用时，参数声明没有个数限制的，
    //   但是如果将函数作为对象给别人使用，那么函数的参数声明的个数最多为22个

    //之所以使用下划线让函数作为对象使用，因为代码中没有明确变量的类型，所以需要通过取值类推断
    // 如果变量声明的类型为函数类型，那么可以不使用下划线让函数作为对象


















  }
}








