package com.billyyccc.builderdemo;

/**
 * Created by Billy Yuan on 2017/5/1.
 * Email: billy112487983@gmail.com
 */

public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    /**
     * 详细的装配过程
     */
    public void construct(String wheel) {
        carBuilder.buildEngine();
        carBuilder.buildSystem();
        carBuilder.buildBrand();
        carBuilder.buildWheel(wheel);
    }

}
