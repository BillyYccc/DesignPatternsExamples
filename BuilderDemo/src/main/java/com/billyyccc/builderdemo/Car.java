package com.billyyccc.builderdemo;

/**
 * Created by Billy Yuan on 2017/5/1.
 * Email: billy112487983@gmail.com
 */

public abstract class Car {
    protected String engine;
    protected String wheel;
    protected String system;
    protected String brand;

    protected Car() {

    }

    //设置轮子
    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    //设置发动机
    public abstract void setEngine();

    //设置车载系统
    public abstract void setSystem();

    //贴牌
    public abstract void setBrand();

    @Override
    public String toString() {
        return "Car (brand = " + brand + ", system = " + system + ", engine = " + engine + ", wheel = " + wheel + ")";
    }
}
