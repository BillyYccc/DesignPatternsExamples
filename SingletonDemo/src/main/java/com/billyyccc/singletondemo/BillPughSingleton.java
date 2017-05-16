package com.billyyccc.singletondemo;

/**
 * Created by Billy Yuan on 2017/4/26.
 * Email: billy112487983@gmail.com
 */

public class BillPughSingleton {
    //引入静态内部类保证单例
    private static class SingletonHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    //私有构造方法
    private BillPughSingleton() {

    }

    //提供单例访问接口
    public static BillPughSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
