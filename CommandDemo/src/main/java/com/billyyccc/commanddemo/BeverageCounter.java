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

package com.billyyccc.commanddemo;

/**
 * Created by Billy Yuan on 2017/6/5.
 * Email: billy112487983@gmail.com
 */

/* Receiver class in pattern
 * Beverage Counter
 */
public class BeverageCounter {
    //real order coffee action
    public void orderCoffee() {
        System.out.println("点了一杯咖啡......咖啡已经就绪...");
    }

    //real order juice action
    public void orderJuice() {
        System.out.println("点了一杯果汁......果汁已经就绪...");
    }

    //real order milk tea action
    public void orderMilkTea() {
        System.out.println("点了一杯奶茶......奶茶已经就绪...");
    }
}
