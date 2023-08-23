package com.czh.scala.day1

import scala.beans.BeanProperty

object Scala_Object3_shuxing {
  def main(args: Array[String]): Unit = {

    // TODO 面向对象 - 类 - 属性
    // 所谓的属性，其实就是类中的变量
    // 在编译时，编译器会将变量编译为类的（私有的）属性，同时提供了属性对应的set，get方法
    val test = new Test()
    // 给类的属性赋值，等同于调用对象属性的set方法
    //test.name = "lisi"
    // 访问类的属性时，等同于调用对象属性的get方法
    //println(test.name)

    // 使用 val声明的类的变量，取值不能修改
    // val声明的属性，在编译时，会给属性添加final关键字，编译器不会提供属性的set方法
    // test.age = 20

    // scala中变量必须显示地初始化
    // 如果希望类的属性和java一样可以由系统进行初始化，而是手动赋值，可以采用特殊符号：下划线

    // java bean规范
    // 反射一般用于架构设计，而架构设计的目的就是通用化
    // scala中给属性提供的set，get方法不遵循bean规范
    // sql => cols => [id ,name, age] => getId, getName, getAge

    test.setEmail("xxx")
    println(test.getEmail())

  }
  class Test {
    // 声明属性
    // private String name = "zhangsan";
    // private final int age = 30;
    private var name : String = "zhangsan"
    val age : Int = 30
    //  todo @BeanProperty可以自动生成规范的setXxx/getXxx方法
    @BeanProperty var email : String = _
  }
}

