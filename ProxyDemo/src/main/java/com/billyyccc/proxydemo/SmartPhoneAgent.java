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

package com.billyyccc.proxydemo;

/**
 * Created by Billy Yuan on 2017/5/30.
 * Email: billy112487983@gmail.com
 */

public class SmartPhoneAgent implements SellSmartPhone {
    private HkBroadwayStore hkBroadwayStore;

    public SmartPhoneAgent() {
        System.out.println("欢迎来到XXX手机代购店...");
    }

    @Override
    public void sellIphone7() {
        System.out.println("代购去香港买港行Iphone7...");
        hkBroadwayStore = new HkBroadwayStore();
        hkBroadwayStore.sellIphone7();
        System.out.println("代购成功购买Iphone7...");
        System.out.println("代购将Iphone7运回大陆地区进行贩卖...");
    }
}
