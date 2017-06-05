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

package com.billyyccc.commanddemotest;

import com.billyyccc.commanddemo.*;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/6/5.
 * Email: billy112487983@gmail.com
 */

/* Client class in pattern*/
public class CommandDemoTest {
    @Test
    public void beverageOrderTest() {
        BeverageCounter beverageCounter = new BeverageCounter();

        //创建三种下单命令
        BuyCoffee buyCoffee = new BuyCoffee(beverageCounter);
        BuyJuice buyJuice = new BuyJuice(beverageCounter);
        BuyMilkTea buyMilkTea = new BuyMilkTea(beverageCounter);

        BeverageShopBroker beverageShopBroker = new BeverageShopBroker();

        //饮品店来了5个客户，点了1杯果汁，3杯咖啡，一杯奶茶
        beverageShopBroker.takeOrder(buyJuice);
        beverageShopBroker.takeOrder(buyCoffee);
        beverageShopBroker.takeOrder(buyCoffee);
        beverageShopBroker.takeOrder(buyCoffee);
        beverageShopBroker.takeOrder(buyMilkTea);

        //其中两个客户突然不想要咖啡了，于是撤销之前的订单
        beverageShopBroker.cancelOrder(buyCoffee);
        beverageShopBroker.cancelOrder(buyCoffee);

        //两个客户换成了果汁和奶茶
        beverageShopBroker.takeOrder(buyJuice);
        beverageShopBroker.takeOrder(buyMilkTea);

        //根据订单开始制作饮品
        beverageShopBroker.placeOrders();
    }
}
