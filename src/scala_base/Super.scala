package scala_base

class Super {
  protected def f(): Unit = {
    println("f")
  }

  class Sub extends Super {
    f() //正确
  }

  class Other {
    (new Super).f() //错误
  }

}
