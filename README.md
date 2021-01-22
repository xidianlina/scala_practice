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



### Usage
> https://www.cnblogs.com/kevinlogs/p/9175602.html  
