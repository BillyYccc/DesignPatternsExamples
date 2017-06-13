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

package com.billyyccc.observerdemotest;

import com.billyyccc.observerdemo.observer.*;
import com.billyyccc.observerdemo.subject.Counter;
import com.billyyccc.observerdemo.subject.PizzaHutCounter;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/6/13.
 * Email: billy112487983@gmail.com
 */

public class ObserverDemoTest {
    @Test
    public void orderFoodInPizzaHut() {
        //实例化必胜客柜台，对应模式中的Subject
        Counter counter = new PizzaHutCounter();

        //店里面来了5个顾客ABCDE
        Customer customerA = new CustomerA();
        Customer customerB = new CustomerB();
        Customer customerC = new CustomerC();
        Customer customerD = new CustomerD();
        Customer customerE = new CustomerE();

        //顾客点餐,顾客D点的是培根披萨，顾客ABCE点的都是鸡肉披萨
        System.out.println("顾客点餐中...");
        counter.add(customerA);
        counter.add(customerB);
        counter.add(customerC);
        counter.add(customerD);
        counter.add(customerE);

        //顾客C因为有事临时取消了订单
        counter.delete(customerC);

        //顾客D的披萨已经做好了，柜台通知顾客D取餐
        System.out.println("顾客D的披萨已经做好了...");
        counter.notifyCustomer(customerD);
        System.out.println("-----顾客D开始用餐-----");

        //顾客ABE的披萨也好了，柜台通知顾客A,B,E取餐
        System.out.println("顾客A的披萨已经做好了...");
        System.out.println("顾客B的披萨已经做好了...");
        System.out.println("顾客E的披萨已经做好了...");
        counter.notifyAllCustomers();
        System.out.println("-----顾客A开始用餐-----");
        System.out.println("-----顾客B开始用餐-----");
        System.out.println("-----顾客E开始用餐-----");
    }
}
