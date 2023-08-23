package com.czh.scala.day1

object Scala_Object10_bansheng {
  def main(args: Array[String]): Unit = {
    // 构造方法私有化: 在参数列表前增加private关键字
    // 声明一个公共的，静态的，返回本类型的方法，用于获取对象
    // scala中没有静态语法,但是可以直接使用java中的静态操作
    // scala采用了一种特殊的处理方式来代替静态语法 ：object
    // object关键字可以用于创建对象，对象的名字就是声明的名字

    // 使用object关键字声明的类和对象有关系的。
    // 这个对象等同于伴随着这个类创建时所产生的，所以将这个对象称之为：伴生对象
    // 这个类称之为伴生类
    // 伴生对象就是一个对象，可以访问伴生类中的所有东西，包括私有的。
    // 伴生对象其实就是马丁模拟静态语法所产生的。
    // 一般写代码时，将静态语法操作的代码写在伴生对象中，将成员方法或属性写在伴生类中


    //val p = new Person()
    //p.getInstance();
    //      TODO 获取静态
    //        val person: Person = Person.getInstance()
    //        println(person)


  }


  // 伴生类
  class Person private() {

  }

  // 伴生对象
  // Person.class
  // Person$.class
  object Person {
    def getInstance(): Person = {
      new Person()
    }
  }

}