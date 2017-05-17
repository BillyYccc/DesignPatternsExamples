/*
 * MIT License
 *
 * Copyright (c) 2017 BillyYuan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
