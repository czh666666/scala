package com.czh.scala.day1

object Scala_Object5_method {
  def main(args: Array[String]): Unit = {
    // TODO 面向对象 - 类 - 方法
    // 所谓的方法，其实就是类中声明的函数，属于类的一部分
    // 类的方法
    val t1 = new Test7()
    t1.id = 1
    val t2 = new Test7()
    t2.id = 2
//重写equals之前
    println(t1 == t2)//false
    println(t1.equals(t2))//false
//重写equals之后
    println(t1 == t2)//true
    println(t1.equals(t2))//true

    // TODO 常用方法 - 使用预先声明好的方法

    // java.lang这个包中的类在java使用时，不需要显示导入使用的。
    // scala中也存在同样的操作
    // 1. java.lang
    // 2. scala
    // 3. Predef
    println("123")
    Predef.println("123")
    val value: Class[Test7] = classOf[Test7]
    //Test7.class
    println(value)

  }
  class Test7 {
    var id : Int = 1

  /*  override def equals(o: Any): Boolean = {
      // TODO 1. 类型相同
      if ( o.isInstanceOf[Test7] ) {
        // TODO 2. 将判断的对象转换为当前类型
        val other = o.asInstanceOf[Test7]

        this.id == other.id
      } else {
        false
      }
    }*/
  }
}

