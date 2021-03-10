记录Scala基础知识
======

# Scala简介
* Scala是一门多范式（multi-paradigm）的编程语言，设计初衷是要集成面向对象编程和函数式编程的各种特性。
* Scala运行在Java虚拟机上，并兼容现有的Java程序。
* Scala源代码被编译成Java字节码，所以它可以运行于JVM之上，并可以调用现有的Java类库。
> Scala特性   
  1.面向对象特性
  Scala是一种纯面向对象的语言，每个值都是对象。对象的数据类型以及行为由类和特质描述。  
  类抽象机制的扩展有两种途径：一种途径是子类继承，另一种途径是灵活的混入机制。这两种途径能避免多重继承的种种问题。  
  2.函数式编程   
  Scala也是一种函数式语言，其函数也能当成值来使用。Scala提供了轻量级的语法用以定义匿名函数，支持高阶函数，允许嵌套多层函数，并支持柯里化。
  Scala的case class及其内置的模式匹配相当于函数式编程语言中常用的代数类型。  
  更进一步，程序员可以利用Scala的模式匹配，编写类似正则表达式的代码处理XML数据。       
  3.静态类型        
  Scala具备类型系统，通过编译时检查，保证代码的安全性和一致性。类型系统具体支持以下特性：    
  泛型类   
  协变和逆变     
  标注            
  类型参数的上下限约束        
  把类别和抽象类型作为对象成员        
  复合类型      
  引用自己时显式指定类型       
  视图        
  多态方法      
  4.扩展性       
  Scala的设计秉承一项事实，即在实践中，某个领域特定的应用程序开发往往需要特定于该领域的语言扩展。Scala提供了许多独特的语言机制，可以以库的形式轻易无缝添加新的语言结构：      
  任何方法可用作前缀或后缀操作符       
  可以根据预期类型自动构造闭包。       
  5.并发性     
  Scala使用Actor作为其并发模型，Actor是类似线程的实体，通过邮箱发收消息。Actor可以复用线程，因此可以在程序中可以使用数百万个Actor,而线程只能创建数千个。在2.10之后的版本中，使用Akka作为其默认Actor实现。       

# Scala基础语法
Scala与Java的最大区别是:Scala语句末尾的分号;是可选的。
> 对象 - 对象有属性和行为。例如：一只狗的状属性有：颜色，名字，行为有：叫、跑、吃等。对象是一个类的实例。     
  类 - 类是对象的抽象，而对象是类的具体实例。       
  方法 - 方法描述的基本的行为，一个类可以包含多个方法。      
  字段 - 每个对象都有它唯一的实例变量集合，即字段。对象的属性通过给字段赋值来创建。
        
## 基本语法
   Scala基本语法需要注意以下几点：
   * 1.区分大小写 -  Scala是大小写敏感的，这意味着标识Hello和hello在Scala中会有不同的含义。
   * 2.类名 - 对于所有的类名的第一个字母要大写。
   如果需要使用几个单词来构成一个类的名称，每个单词的第一个字母要大写。
   示例：class MyFirstScalaClass
   * 3.方法名称 - 所有的方法名称的第一个字母用小写。
   如果若干单词被用于构成方法的名称，则每个单词的第一个字母应大写。
   示例：def myMethodName()
   * 4.程序文件名 - 程序文件的名称应该与对象名称完全匹配(新版本不需要了，但建议保留这种习惯)。
   保存文件时，应该保存它使用的对象名称（记住Scala是区分大小写），并追加".scala"为文件扩展名。（如果文件名和对象名称不匹配，程序将无法编译）。
   示例: 假设"HelloWorld"是对象的名称。那么该文件应保存为'HelloWorld.scala"
   * 5.def main(args: Array[String]) - Scala程序从main()方法开始处理，这是每一个Scala程序的强制程序入口部分。
   
## 标识符
* Scala可以使用两种形式的标志符，字符数字和符号。      
* 字符数字使用字母或是下划线开头，后面可以接字母或是数字，符号"$"在 Scala 中也看作为字母。然而以"$"开头的标识符为保留的 Scala 编译器产生的标志符使用，应用程序应该避免使用"$"开始的标识符，以免造成冲突。      
* Scala的命名规则采用和Java类似的camel命名规则，首字符小写，比如toString。类名的首字符还是使用大写。此外也应该避免使用以下划线结尾的标志符以避免冲突。
  符号标志符包含一个或多个符号，如+，:，? 等，比如:+ ++ ::: < ?> :->     
* Scala内部实现时会使用转义的标志符，比如:->使用$colon$minus$greater 来表示这个符号。因此如果你需要在Java代码中访问:->方法，你需要使用Scal 的内部名称$colon$minus$greater。     
* 混合标志符由字符数字标志符后面跟着一个或多个符号组成，比如 unary_+ 为 Scala 对+方法的内部实现时的名称。字面量标志符为使用"定义的字符串，比如 `x` `yield`。     
* 可以在"之间使用任何有效的Scala标志符，Scala将它们解释为一个Scala标志符，一个典型的使用为Thread的yield方法，在Scala中不能使用Thread.yield()是因为yield为Scala中的关键字，必须使Thread.`yield`()来使用这个方法。

## Scala注释
   Scala类似Java支持单行和多行注释。多行注释可以嵌套，但必须正确嵌套，一个注释开始符号对应一个结束符号。注释在Scala编译中会被忽略。

## 空行和空格
   一行中只有空格或者带有注释，Scala会认为其是空行，会忽略它。标记可以被空格或者注释来分割。
   
## 换行符
   Scala是面向行的语言，语句可以用分号（;）结束或换行符。Scala 程序里,语句末尾的分号通常是可选的。
   如果你愿意可以输入一个,但若一行里仅 有一个语句也可不写。另一方面,如果一行里写多个语句那么分号是需要的。

## Scala包
   Scala使用package关键字定义包，在Scala将代码定义到某个包中有两种方式：
   第一种方法和Java一样，在文件的头定义包名，这种方法就后续所有代码都放在该包中。比如：
   package com.runoob
           class HelloWorld
   第二种方法有些类似 C#，如：
   package com.runoob {
           class HelloWorld 
   }
   第二种方法，可以在一个文件中定义多个包。
   
## 引用
   Scala使用import关键字引用包。
   
   import java.awt.Color// 引入Color
   import java.awt._  // 引入包内所有成员
    
   def handler(evt: event.ActionEvent) { // java.awt.event.ActionEvent
     ...  // 因为引入了java.awt，所以可以省去前面的部分
   }
   
   import语句可以出现在任何地方，而不是只能在文件顶部。import的效果从开始延伸到语句块的结束。这可以大幅减少名称冲突的可能性。
   
   如果想要引入包中的几个成员，可以使用selector（选取器）：
   import java.awt.{Color, Font}
    
   // 重命名成员
   import java.util.{HashMap => JavaHashMap}
    
   // 隐藏成员
   import java.util.{HashMap => _, _} // 引入了util包的所有成员，但是HashMap被隐藏了   
   
# Scala数据类型
  Scala与Java有着相同的数据类型，下表列出了Scala支持的数据类型：
  ![data_type](http://github.com/xidianlina/scala_practice/raw/master/picture/data_type.png)
  上表中列出的数据类型都是对象，也就是说scala没有java中的原生类型。在scala是可以对数字等基础类型调用方法的。

# Scala变量
 >变量是一种使用方便的占位符，用于引用计算机内存地址，变量创建后会占用一定的内存空间。        
 基于变量的数据类型，操作系统会进行内存分配并且决定什么将被储存在保留内存中。因此，通过给变量分配不同的数据类型，你可以在这些变量中存储整数，小数或者字母。
 变量声明       
 变量:在程序运行过程中其值可能发生改变的量叫做变量。如：时间，年龄。     
 常量:在程序运行过程中其值不会发生变化的量叫做常量。如：数值 3，字符'A'。        
 在Scala中，使用关键词"var"声明变量，使用关键词"val"声明常量。     
 声明变量实例如下：      
 var myVar : String = "Foo"     
 var myVar : String = "Too"     
 以上定义了变量myVar，可以修改它。        
 声明常量实例如下：      
 val myVal : String = "Foo"     
 以上定义了常量myVal，它是不能修改的。如果程序尝试修改常量myVal的值，程序将会在编译时报错。         
 变量类型声明     
 变量的类型在变量名之后等号之前声明。定义变量的类型的语法格式如下：      
 var VariableName : DataType [=  Initial Value]     
 或      
 val VariableName : DataType [=  Initial Value]     
 变量类型引用     
 在 Scala 中声明变量和常量不一定要指明数据类型，在没有指明数据类型的情况下，其数据类型是通过变量或常量的初始值推断出来的。
 所以，如果在没有指明数据类型的情况下声明变量或常量必须要给出其初始值，否则将会报错。     
 var myVar = 10;        
 val myVal = "Hello, Scala!";       
 以上实例中，myVar 会被推断为 Int 类型，myVal 会被推断为 String 类型。        
 Scala 多个变量声明       
 Scala 支持多个变量的声明：       
 val xmax, ymax = 100  // xmax, ymax都声明为100     
 如果方法返回值是元组，可以使用val来声明一个元组：     
 val pa = (40,"Foo")        
 pa: (Int, String) = (40,Foo)       

#Scala访问修饰符
> Scala访问修饰符基本和Java的一样，分别有:private，protected，public。        
 如果没有指定访问修饰符，默认情况下，Scala对象的访问级别都是public。        
 Scala中的private限定符，比Java更严格，在嵌套类情况下，外层类甚至不能访问被嵌套类的私有成员。     
 
### 私有(Private)成员
    用private关键字修饰，带有此标记的成员仅在包含了成员定义的类或对象内部可见，同样的规则还适用内部类。
```scala
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
```
    (new Inner).f() 访问不合法是因为f在Inner中被声明为private，而访问不在类Inner之内。
    但在InnerMost里访问f就没有问题的，因为这个访问包含在Inner类之内。
    Java中允许这两种访问，因为它允许外部类访问内部类的私有成员。

### 保护(Protected)成员
    在scala中，对保护（Protected）成员的访问比java更严格一些。
    因为它只允许保护成员在定义了该成员的的类的子类中被访问。而在java中，
    用protected关键字修饰的成员，除了定义了该成员的类的子类可以访问，同一个包里的其他类也可以进行访问。
```scala
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
```  
    Sub类对f的访问没有问题，因为f在Super中被声明为protected，而Sub是Super的子类。
    相反，Other对f的访问不被允许，因为other没有继承自Super。而后者在java里同样被认可，因为Other与Sub在同一包里。
### 公共(Public)成员
    Scala中，如果没有指定任何的修饰符，则默认为public。这样的成员在任何地方都可以被访问。 
```scala
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
```  
### 作用域保护
> Scala中，访问修饰符可以通过使用限定词强调。格式为:      
  private[x]        
  或         
  protected[x]      
  这里的x指代某个所属的包、类或单例对象。如果写成private[x],读作"这个成员除了对[…]中的类或[…]中的包中的类及它们的伴生对像可见外，对其它所有类都是private。     
  这种技巧在横跨了若干包的大型项目中非常有用，它允许你定义一些在你项目的若干子包中可见但对于项目外部的客户却始终不可见的东西。        
```scala
package scala_base

package navigation {

  private[scala_base] class Navigator {
    protected[navigation] def useStarChart() {}

    class LegOfJourney {
      private[Navigator] val distance = 100
    }

    private[this] var speed = 200
  }

}

package launch {

  import navigation._

  object Vehicle {
    private[launch] val guide = new Navigator
  }

}
```    
    类Navigator被标记为private[scala_base]就是说这个类对包含在scala_base包里的所有的类和对象可见。
    比如说，从Vehicle对象里对Navigator的访问是被允许的，因为对象Vehicle包含在包launch中，
    而launch包在scala_base中，相反，所有在包scala_base之外的代码都不能访问类Navigator。  
    
    
    
    
    
### Usage
> https://www.cnblogs.com/kevinlogs/p/9175602.html  
