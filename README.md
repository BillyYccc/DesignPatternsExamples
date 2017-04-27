# DesignPatternsExamples
Examples of multiple design patterns,the project is built based on Gradle

## SingletonDemo
单例模式
* EagerInitializationSingleton 饿汉式单例
* LazyInitializationSingletonA 懒汉式单例，线程不安全
* LazyInitializationSingletonB 改进过的懒汉式单例，线程安全
* DoubleCheckedLockingSingleton 双重检查锁单例
* EnumSingleton 枚举类型单例(可以直接序列化和反序列化)
* BillPughSingleton 静态内部类单例
* SerializeSingletonA 提供序列化接口的静态内部类单例，但是反序列化后异常
* SerializeSingletonB 提供序列化接口的静态内部类单例，增加readResolve()方法后，可以对单例进行序列化操作