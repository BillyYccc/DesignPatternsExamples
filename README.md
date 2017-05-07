# DesignPatternsExamples
Examples of multiple [design patterns](http://billyyccc.com/2017/04/27/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%881%EF%BC%89/),the project is built based on Gradle

## SingletonDemo
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

## BuilderDemo
[建造者模式](http://billyyccc.com/2017/04/30/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%883%EF%BC%89%EF%BC%9A%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8FBUILDER/)
* builderTest1() 使用Director进行装配
* builderTest2() 
<br>builderTest3() 省略Director，直接使用builder进行装配

## FactoryMethodDemo
[工厂方法模式](http://billyyccc.com/2017/05/03/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%884%EF%BC%89%EF%BC%9A%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95FACTORYMETHOD/)

## SimpleFactoryDemo
[简单工厂模式(静态工厂方法)](http://billyyccc.com/2017/05/06/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%885%EF%BC%89%EF%BC%9A%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/)
