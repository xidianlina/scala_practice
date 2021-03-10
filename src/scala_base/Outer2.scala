package scala_base

class Outer2 {

  class Inner {
    def f(): Unit = {
      println("f")
    }

    class InnerMost {
      f() //正确
    }

  }

  (new Inner).f() //正确 因为f()是public

}
