# DesignPatternsExamples
Examples of multiple [design patterns](http://billyyccc.com/2017/04/27/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%881%EF%BC%89/),the project is built based on Gradle and Intellij IDEA 

[![Build Status](https://travis-ci.org/BillyYccc/DesignPatternsExamples.svg?branch=master)](https://travis-ci.org/BillyYccc/DesignPatternsExamples)
[![license](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/BillyYccc/DesignPatternsExamples/blob/master/LICENSE)

## 创建型模式 Creational Pattern
***
### SingletonDemo
[单例模式](http://billyyccc.com/2017/04/28/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%882%EF%BC%89%EF%BC%9A%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8FSINGLETON/)
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
[建造者模式](http://billyyccc.com/2017/04/30/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%883%EF%BC%89%EF%BC%9A%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8FBUILDER/)
* builderTest1() 使用Director进行装配
* builderTest2() 
  <br>builderTest3() 省略Director，直接使用builder进行装配

### FactoryMethodDemo
[工厂方法模式](http://billyyccc.com/2017/05/03/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%884%EF%BC%89%EF%BC%9A%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95FACTORYMETHOD/)

### SimpleFactoryDemo
[简单工厂模式(静态工厂方法)](http://billyyccc.com/2017/05/06/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%885%EF%BC%89%EF%BC%9A%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/)

### AbstractFactoryDemo
[抽象工厂模式](http://billyyccc.com/2017/05/07/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%886%EF%BC%89%EF%BC%9A%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82ABSTRACTFACTORY/)

### PrototypeDemo
[原型模式](http://billyyccc.com/2017/05/10/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%887%EF%BC%89%EF%BC%9A%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8FPROTOTYPE/)

#### copy包里面是深拷贝跟浅拷贝的实现
* deepcopy 深拷贝的三种实现
1. Diary 对String进行深拷贝
2. Bookshelf 对ArrayList进行深拷贝
3. Magazine 通过序列化的方式进行深拷贝

* shallowcopy 浅拷贝实现
1. Newspaper 实现Cloneable接口进行浅拷贝

## 结构型模式 Structural Pattern

***

### AdapterDemo
[适配器模式](http://billyyccc.com/2017/05/15/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%888%EF%BC%89%EF%BC%9A%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8FADAPTER/)
* classadapter 类适配器
* objectadapter 对象适配器

### BridgeDemo
[桥接模式](http://billyyccc.com/2017/05/17/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%889%EF%BC%89%EF%BC%9A%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8FBRIDGE/)

### CompositeDemo
[组合模式](http://billyyccc.com/2017/05/18/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8810%EF%BC%89%EF%BC%9A%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8FCOMPOSITE/)
* safecompositepatter
* transparentcompositepatter

### DecoratorDemo
[装饰模式](http://billyyccc.com/2017/05/22/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8811%EF%BC%89%EF%BC%9A%E8%A3%85%E9%A5%B0%E6%A8%A1%E5%BC%8FDECORATOR/)

### FacadeDemo
[外观模式](http://billyyccc.com/2017/05/26/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8812%EF%BC%89%EF%BC%9A%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8FFACADE/)

### FlyweightDemo
[享元模式](http://billyyccc.com/2017/05/29/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%8813%EF%BC%89%EF%BC%9A%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8FFLYWEIGHT/)