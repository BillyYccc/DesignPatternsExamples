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

package com.billyyccc.proxydemotest;

import com.billyyccc.proxydemo.HkBroadwayStore;
import com.billyyccc.proxydemo.JdOnlineStore;
import com.billyyccc.proxydemo.SmartPhoneAgent;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/30.
 * Email: billy112487983@gmail.com
 */

public class ProxyDemoTest {
    @Test
    public void purchaseIphone7InMainland() {
        System.out.println("去京东商城购买Iphone7");
        System.out.println("--------------------");
        System.out.println("打开京东商城");
        JdOnlineStore jdOnlineStore = new JdOnlineStore();
        jdOnlineStore.sellIphone7();
        System.out.println("客户成功购买Iphone7...");
        System.out.println("--------------------");
    }

    @Test
    public void purchaseIphone7InHongKong() {
        System.out.println("去香港购买Iphone7");
        System.out.println("--------------------");
        System.out.println("逛香港百老汇");
        HkBroadwayStore hkBroadwayStore = new HkBroadwayStore();
        hkBroadwayStore.sellIphone7();
        System.out.println("客户成功购买Iphone7...");
        System.out.println("--------------------");
    }

    @Test
    public void purchaseIphone7InAgent() {
        System.out.println("去XXX代购店购买Iphone7");
        System.out.println("--------------------");
        System.out.println("浏览XXX代购店");
        SmartPhoneAgent smartPhoneAgent = new SmartPhoneAgent();
        smartPhoneAgent.sellIphone7();
        System.out.println("客户成功购买Iphone7...");
        System.out.println("--------------------");
    }
}
