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

package com.billyyccc.templatemethoddemo;

/**
 * Created by Billy Yuan on 2017/6/4.
 * Email: billy112487983@gmail.com
 */

/*安装戴尔显示器的接口*/
interface InstallDellMonitor {
    /*给出默认的安装顺序*/
    default void install() {
        unwrapPacking();
        attachStand();
        connectMonitor();
        setupInSystem();
    }

    /*拆开包装*/
    default void unwrapPacking() {
        System.out.println("拆开纸箱包装...");
    }

    /*将屏幕安装到显示器底座上*/
    void attachStand();

    /*连接显示器与主机*/
    void connectMonitor();

    /*在系统中进行设置*/
    void setupInSystem();
}
