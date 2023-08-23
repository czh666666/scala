package com.czh.scala.day1

object Scala_Object13_trait3 {
  def main(args: Array[String]): Unit = {

    // TODO 面向对象 - 特征(特质)
    // 可以将trait理解为接口和抽象类的结合体
    // 1. 初始化问题
    //    父类的特质 > 父类 > 特质1, 特质2 > 当前类
    // TODO 面向对象 - 特征(特质)

    // java中不能类的多继承 ： 砖石问题
    // scala采用了一种功能叠加的方式解决砖石问题
    // super不是父特质的意思，是上一级（上一个）的意思
    //super[Operator]指跳过一个DB直接到mysql
    new MySQL().operData()

  }
  trait Operator {
    def operData(): Unit = {
      println("操作数据")
    }
  }

  trait Log extends Operator {
    override def operData(): Unit = {
      print("向日志文件中")
      super[Operator].operData()
    }
  }

  trait DB extends Operator{
    override def operData(): Unit = {
      print("向数据库中")
      super.operData()
    }
  }
//显示结果和顺序有关
  class MySQL extends DB with Log {

  }

}