package com.billyyccc.builderdemotest;

import com.billyyccc.builderdemo.*;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/1.
 * Email: billy112487983@gmail.com
 */

public class BuilderTest {
    @Test
    public void builderTest1() {
        CarBuilder carBuilder = new BenzCarBuilder();
        //Director
        CarDirector benzDirector = new CarDirector(carBuilder);

        benzDirector.construct("米其林轮胎");
        BenzCar benzCar1 = (BenzCar) carBuilder.build();
        System.out.println(benzCar1.toString());
    }

    @Test
    public void builderTest2() {
        //有时候会省略Director,直接使用builder
        AudiCar audiCar1 = new AudiCar.AudiCarBuilder().buildEngine()
                .buildSystem()
                .buildBrand()
                .buildWheel("倍耐力轮胎")
                .build();
        System.out.println(audiCar1.toString());
    }

    @Test
    public void builderTest3() {
        //修改AudiCar的装配过程，先装配系统再装配发动机
        AudiCar audiCar2 = new AudiCar.AudiCarBuilder().buildSystem()
                .buildEngine()
                .buildWheel("倍耐力轮胎")
                .buildBrand()
                .build();
        System.out.println(audiCar2.toString());
    }
}
