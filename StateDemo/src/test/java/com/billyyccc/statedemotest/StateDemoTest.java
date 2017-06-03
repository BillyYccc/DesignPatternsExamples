/*
 * MIT License
 *
 * Copyright (c) 2017 BillyYuan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.billyyccc.statedemotest;

import com.billyyccc.statedemo.goodexample.GearShift;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/6/3.
 * Email: billy112487983@gmail.com
 */

public class StateDemoTest {
    @Test
    public void gearShiftTest() {
        System.out.println("赛车手进入赛车...");
        GearShift gearShift = new GearShift();
        System.out.println("比赛进入倒计时...");
        System.out.println("比赛开始...");
        gearShift.upShift();
        System.out.println("加速...");
        gearShift.upShift();
        System.out.println("加速...");
        gearShift.upShift();
        System.out.println("加速...");
        gearShift.upShift();
        System.out.println("加速...");
        gearShift.upShift();
        System.out.println("加速...");
        gearShift.upShift();
        System.out.println("加速...");
        gearShift.upShift();
        System.out.println("前方弯道，开始减速...");
        gearShift.downShift();
        System.out.println("减速...");
        gearShift.downShift();
        System.out.println("减速...");
        gearShift.downShift();
        System.out.println("减速...");
        gearShift.downShift();
        System.out.println("弯道通过...即将到达终点...");
        System.out.println("减速...");
        gearShift.downShift();
        System.out.println("减速...");
        gearShift.downShift();
        System.out.println("到达终点，停车...");
        gearShift.downShift();
    }
}
