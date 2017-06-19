# DesignPatternsExamples
Examples of multiple [design patterns](http://billyyccc.com/2017/04/27/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%881%EF%BC%89/),reference to [*Design Patterns: Elements of Reusable Object-Oriented Software*](https://www.goodreads.com/book/show/85009.Design_Patterns),the project is built based on Gradle and Intellij IDEA 

[![Build Status](https://travis-ci.org/BillyYccc/DesignPatternsExamples.svg?branch=master)](https://travis-ci.org/BillyYccc/DesignPatternsExamples)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/7acbea57b799470ea843b801e7b8c13e)](https://www.codacy.com/app/BillyYccc/DesignPatternsExamples?utm_source=github.com&utm_medium=referral&utm_content=BillyYccc/DesignPatternsExamples&utm_campaign=badger)
[![license](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/BillyYccc/DesignPatternsExamples/blob/master/LICENSE)

## 创建型模式 Creational Pattern

### SingletonDemo
> Ensure a class only has one instance, and provide a global point of access to it.

[单例模式](http://billyyccc.com/2017/04/28/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%882%EF%BC%89%EF%BC%9A%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8FSINGLETON/)

> 保证一个类仅有一个实例，并提供一个访问它的全局访问点。

* EagerInitializationSingleton 饿汉式单例
* LazyInitializationSingletonA 懒汉式单例，线程不安全
* LazyInitializationSingletonB 改进过的懒汉式单例，线程安全
* DoubleCheckedLockingSingleton 双重检查锁单例
* EnumSingleton 枚举类型单例(可以直接序列化和反序列化)
* BillPughSingleton 静态内部类单例
* SerializeSingletonA 提供序列化接口的静态内部类单例，但是反序列化后异常
* SerializeSingletonB 提供序列化接口的静态内部类单例，增加readResolve()方法后，可以对单例进行序列化操作
* EnumMultiton 多例模式

### BuilderDemo

> Separate the construction of a complex object from its representation so that the same construction process can create different representations.

[建造者模式](http://billyyccc.com/2017/04/30/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%883%EF%BC%89%EF%BC%9A%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8FBUILDER/)

> 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

* builderTest1() 使用Director进行装配
* builderTest2() 
  <br>builderTest3() 省略Director，直接使用builder进行装配

### FactoryMethodDemo

> Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

[工厂方法模式](http://billyyccc.com/2017/05/03/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%884%EF%BC%89%EF%BC%9A%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95FACTORYMETHOD/)

> 定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method使一个类的实例化延迟到其子类。

### SimpleFactoryDemo
[简单工厂模式(静态工厂方法)](http://billyyccc.com/2017/05/06/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%885%EF%BC%89%EF%BC%9A%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/)

### AbstractFactoryDemo

> Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

[抽象工厂模式](http://billyyccc.com/2017/05/07/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%886%EF%BC%89%EF%BC%9A%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82ABSTRACTFACTORY/)

> 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

### PrototypeDemo

> Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

[原型模式](http://billyyccc.com/2017/05/10/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%887%EF%BC%89%EF%BC%9A%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8FPROTOTYPE/)

> 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

#### copy包里面是深拷贝跟浅拷贝的实现
* deepcopy 深拷贝的三种实现
1. Diary 对String进行深拷贝
2. Bookshelf 对ArrayList进行深拷贝
3. Magazine 通过序列化的方式进行深拷贝

* shallowcopy 浅拷贝实现
1. Newspaper 实现Cloneable接口进行浅拷贝

## 结构型模式 Structural Pattern

### AdapterDemo

> Convert the interface of a class into another interface clients expect.Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

[适配器模式](http://billyyccc.com/2017/05/15/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%888%EF%BC%89%EF%BC%9A%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8FADAPTER/)

> 将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

* classadapter 类适配器
* objectadapter 对象适配器

### BridgeDemo

> Decouple an abstraction from its implementation so that the two can vary independently.

[桥接模式](http://billyyccc.com/2017/05/17/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%889%EF%BC%89%EF%BC%9A%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8FBRIDGE/)

> 将抽象部分与它的实现部分分离，使它们都可以独立地变化。

### CompositeDemo

> Compose objects into tree structures to represent part-whole hierarchies.Composite lets clients treat individual objects and compositions of objects uniformly.

[组合模式](http://billyyccc.com/2017/05/18/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8810%EF%BC%89%EF%BC%9A%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8FCOMPOSITE/)

> 将对象组合成树形结构以表示“部分-整体”的层次结构。Composite使得用户对单个对象和组合对象的使用具有一致性。

* safecompositepatter
* transparentcompositepatter

### DecoratorDemo

> Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

[装饰模式](http://billyyccc.com/2017/05/22/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8811%EF%BC%89%EF%BC%9A%E8%A3%85%E9%A5%B0%E6%A8%A1%E5%BC%8FDECORATOR/)

> 动态地给一个对象添加一些额外的职责。就增加功能来说， Decorator模式相比生成子类更为灵活。

### FacadeDemo

> Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

[外观模式](http://billyyccc.com/2017/05/26/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8812%EF%BC%89%EF%BC%9A%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8FFACADE/)

> 为子系统中的一组接口提供一个一致的界面， Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

### FlyweightDemo

> Use sharing to support large numbers of fine-grained objects efficiently.

[享元模式](http://billyyccc.com/2017/05/29/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8813%EF%BC%89%EF%BC%9A%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8FFLYWEIGHT/)

> 运用共享技术有效地支持大量细粒度的对象。

### ProxyDemo

> Provide a surrogate or placeholder for another object to control access to it.

[代理模式](http://billyyccc.com/2017/05/31/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8814%EF%BC%89%EF%BC%9A%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8FPROXY/)

> 为其他对象提供一种代理以控制对这个对象的访问。

## 创建型模式 Creational Pattern

### StrategyDemo

> Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

[策略模式](http://billyyccc.com/2017/06/02/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8815%EF%BC%89%EF%BC%9A%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8FSTRATEGY/)

> 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。

### StateDemo

> Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

[状态模式](http://billyyccc.com/2017/06/03/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8816%EF%BC%89%EF%BC%9A%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8FSTATE/)

> 允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。

### TemplateMethodDemo

> Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

[模板方法模式](http://billyyccc.com/2017/06/04/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8817%EF%BC%89%EF%BC%9A%E6%A8%A1%E6%9D%BF%E6%96%B9%E6%B3%95TEMPLATEMETHOD/)

> 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。TemplateMethod使得子类
> 可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

### CommandDemo

> Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

[命令模式](http://billyyccc.com/2017/06/05/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8818%EF%BC%89%EF%BC%9A%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8FCOMMAND/)

> 将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤消的操作。

### MementoDemo

> Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

[备忘录模式](http://billyyccc.com/2017/06/07/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8819%EF%BC%89%EF%BC%9A%E5%A4%87%E5%BF%98%E5%BD%95%E6%A8%A1%E5%BC%8FMEMENTO/)

> 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。

### ChainOfResponsibilityDemo

> Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

[职责链模式](http://billyyccc.com/2017/06/10/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8820%EF%BC%89%EF%BC%9A%E8%81%8C%E8%B4%A3%E9%93%BE%E6%A8%A1%E5%BC%8FCHAINOFRESPONSIBILITY/)

> 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。

### ObserverDemo

> Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

[观察者模式](http://billyyccc.com/2017/06/13/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8821%EF%BC%89%EF%BC%9A%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8FOBSERVER/)

> 定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时, 所有依赖于它的对象都得到通知并被自动更新。

### IteratorDemo

> Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

[迭代器模式](http://billyyccc.com/2017/06/15/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8822%EF%BC%89%EF%BC%9A%E8%BF%AD%E4%BB%A3%E5%99%A8%E6%A8%A1%E5%BC%8FITERATOR/)

> 提供一种方法顺序访问一个聚合对象中各个元素, 而又不需暴露该对象的内部表示。

### MediatorDemo

> Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

[中介者模式](http://billyyccc.com/2017/06/16/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8823%EF%BC%89%EF%BC%9A%E4%B8%AD%E4%BB%8B%E8%80%85%E6%A8%A1%E5%BC%8FMEDIATOR/)

> 用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。