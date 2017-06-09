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

package com.billyyccc.chainofresponsibilitydemo.developer;

import com.billyyccc.chainofresponsibilitydemo.request.Request;

/**
 * Created by Billy Yuan on 2017/6/9.
 * Email: billy112487983@gmail.com
 */

/* 初级工程师，ConcreteHandler in pattern */
public class AssociateDeveloper extends Developer {

    private static final int EASY_LEVEL = 1;

    @Override
    public int getLevel() {
        return EASY_LEVEL;
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getProblemContent());
        System.out.println("初级工程师已经解决简单问题...");
    }
}
