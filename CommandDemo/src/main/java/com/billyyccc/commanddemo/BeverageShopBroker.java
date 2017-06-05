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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Billy Yuan on 2017/6/5.
 * Email: billy112487983@gmail.com
 */

/* Invoker class in pattern
 * Beverage Shop Broker
 */
public class BeverageShopBroker {
    private List<Order> ordersList = new ArrayList<>();

    //下单
    public void takeOrder(Order order) {
        ordersList.add(order);
    }

    //取消订单
    public void cancelOrder(Order order) {
        Stream<Order> stream = ordersList.stream();
        ordersList.remove(stream.filter(t -> t.equals(order)).findFirst().get());
    }

    //制作
    public void placeOrders() {
        for (Order order : ordersList) {
            order.execute();
        }
        ordersList.clear();
    }
}
