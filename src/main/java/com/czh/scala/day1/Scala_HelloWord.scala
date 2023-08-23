package com.czh.scala.day1


/*
scala语言是基于java语言开发的

package : java中的包

object : 声明一个对象,在编译时，会编译为两个类文件
         这个声明的对象的类型为：当前类型+$

        User user = new User();
        user.setName

        Scala02_HelloWorld = new Scala02_HelloWorld$()

Scala02_HelloWorld ： 对象名称

def : 声明方法的关键字

main : scala程序的入口方法名

() : 方法参数列表

args: Array[String] : 参数

     java => String[] args => java是一个强类型的语言
     scala => args: Array[String]

     args : 参数名
     Array[String] ： 参数类型
     ： => 分隔符

Array[String] : Array是一个数组类型
                scala语言是一个完全面向对象的语言，所以万物皆对象
                数组也是对象，也有自己的类型：Array,这里的中括号表示泛型

                String[] => [Ljava.lang.String@343434

: Unit =>    scala => 名称：类型
                   => 参数名：参数类型
                   => 变量名：变量类型
                   => 方法名：方法的返回值类型

            Unit表示返回值类型，Unit类型是scala中新的类型，为了代替void关键字，表示没有返回值

 = : 赋值

    User user = new User();
    user.xxx
    user.yyy

    public void test() = {
        sout("123")
    }

    test()

System.out.println("Hello Scala World") ： java代码

        scala语言是基于java语言开发的，所以大部分的java代码可以直接在scala中使用

代码可以不需要分号结尾： scala推荐一行代码中只有一个逻辑，那么分号可以省略




 */

object Scala_HelloWord {



  def main(args: Array[String]): Unit = {
    println("Hello Word")
  }
}
