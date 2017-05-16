package com.billyyccc.builderdemo; /**
 * Created by Billy Yuan on 2017/5/1.
 * Email: billy112487983@gmail.com
 */

/**
 * 抽象Builder类
 */
public abstract class CarBuilder {
    //安装发动机
    public abstract void buildEngine();

    //安装车载系统
    public abstract void buildSystem();

    //安装轮子
    public abstract void buildWheel(String wheel);

    //贴牌
    public abstract void buildBrand();

    //装配
    public abstract Car build();
}
