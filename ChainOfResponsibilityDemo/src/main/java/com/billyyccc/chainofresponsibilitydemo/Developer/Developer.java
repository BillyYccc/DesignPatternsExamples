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

package com.billyyccc.chainofresponsibilitydemo.Developer;

import com.billyyccc.chainofresponsibilitydemo.Request.Request;

/**
 * Created by Billy Yuan on 2017/6/9.
 * Email: billy112487983@gmail.com
 */

/* 抽象的工程师类，对应模式中的Handler */
public abstract class Developer {
    protected Developer nextDeveloper;

    public void setNextDeveloper(Developer developer) {
        nextDeveloper = developer;
    }

    //处理请求的判断逻辑
    public final void handleRequest(Request request) {
        if (getLevel() >= request.getLevel()) {
            //如果层级一致交给该工程师来处理
            handle(request);
        } else {
            //否则交给下一级来处理
            if (nextDeveloper != null) {
                System.out.println("当前工程师无法解决，交给下一级工程师解决...");
                nextDeveloper.handleRequest(request);
            } else {
                //如果都不能处理
                System.out.println("所有工程师都不能处理该问题");
            }
        }

    }

    //当前工程师能处理的层级
    public abstract int getLevel();

    //具体的处理方法
    public abstract void handle(Request request);
}
