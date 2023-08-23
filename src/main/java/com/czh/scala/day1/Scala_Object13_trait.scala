package com.czh.scala.day1

object Scala_Object13_trait {
  def main(args: Array[String]): Unit = {

    // TODO 面向对象 - 特征
    // 将多个对象中相同的特征，从对象中剥离出来，形成独立的一个结构，称之为trait（特征）
    // 如果一个对象符合这个特征，那么可以将这个特征加入到这个对象，这个加入的过程，称之为混入(extends)

    // 如果一个类只有一个特征时，采用extends关键字进行混入
    // 但是一个类如果有多个特征，这个时候，第一个特征采用extends，后续采用with

    // 如果类存在父类的场合，并同时具备了某个特征，
    // 需要使用extends关键字继承父类，使用with关键字来混入特征


  }
  trait eat {
    def eat():Unit
  }
  trait Runnable {
    def run():Unit
  }
  class Person extends Object with Runnable {
    override def run(): Unit = {
      println("run...")
    }
  }
  class Dog extends Runnable {
    override def run(): Unit = {
      println("run...")
    }
  }
}