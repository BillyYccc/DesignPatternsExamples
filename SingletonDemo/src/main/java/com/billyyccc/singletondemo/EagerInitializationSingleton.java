package com.billyyccc.singletondemo;

/**
 * Created by Billy Yuan on 2017/4/26.
 * Email: billy112487983@gmail.com
 */

public class EagerInitializationSingleton {
    //只有一个实例
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    //私有的构造器，阻止其他类实例化
    private EagerInitializationSingleton() {

    }

    //提供获取单例的接口
    public static EagerInitializationSingleton getInstance() {
        return instance;
    }
}
