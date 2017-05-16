package com.billyyccc.builderdemo; /**
 * Created by Billy Yuan on 2017/5/1.
 * Email: billy112487983@gmail.com
 */

/**
 * 具体的BenzCar类，继承自Car
 */
public class BenzCar extends Car {
    protected BenzCar() {

    }

    @Override
    public void setBrand() {
        this.brand = "Benz";
    }

    @Override
    public void setEngine() {
        this.engine = "Benz Engine";
    }

    @Override
    public void setSystem() {
        this.system = "Benz System";
    }
}
