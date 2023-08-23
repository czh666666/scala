package com.czh.scala.day1

import scala.beans.BeanProperty

object Scala_Object4_class {
  def main(args: Array[String]): Unit = {

    // TODO 面向对象 - 类 - 访问权限
    //
    /*
      java :
      1. private    => 本类
      2. (default)  => 本类，本包
      3  protected  => 本类，本包,子类
      4. public     => 任意
      scala :
      1. private       => 同类
      2. private[包名]  => 同包，包私有
      3. protected     => 受保护的， 同类，子类，没有同包
      4. (default) => 什么都不写就是公共的。没有public关键字

     */
  }
  class Test6 {
    private val name1:String = "zhangsan"
    private[this] val name2:String = "zhangsan"
    protected val name3:String = "zhangsan"
    val name4:String = "zhangsan"

    def test(): Unit = {
      println(name1)
      println(name2)
      println(name3)
      println(name4)
    }
  }
 /* class Test66 {
    def test(): Unit = {
      val t = new Test6
                  println(t.name1)
                  println(t.name2)
                  println(t.name3)
                  println(t.name4)
    }
  }

  class Test666 extends Test6 {
    def test(): Unit = {
      val t = new Test6
      println(t.name1)
      println(t.name2)
      println(t.name3)
      println(t.name4)
    }
  }*/

}

