package scala_base

class Outer {

  class Inner {
    private def f(): Unit = {
      println("f")
    }

    class InnerMost {
      f() //正确
    }

  }

  (new Inner).f() //错误
}
