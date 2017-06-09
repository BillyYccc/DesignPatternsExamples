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

package com.billyyccc.chainofresponsibilitydemotest;

import com.billyyccc.chainofresponsibilitydemo.Developer.AssociateDeveloper;
import com.billyyccc.chainofresponsibilitydemo.Developer.Developer;
import com.billyyccc.chainofresponsibilitydemo.Developer.ExpertDeveloper;
import com.billyyccc.chainofresponsibilitydemo.Developer.SeniorDeveloper;
import com.billyyccc.chainofresponsibilitydemo.Request.EasyRequest;
import com.billyyccc.chainofresponsibilitydemo.Request.HardRequest;
import com.billyyccc.chainofresponsibilitydemo.Request.Request;
import com.billyyccc.chainofresponsibilitydemo.Request.VeryHardRequest;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/6/9.
 * Email: billy112487983@gmail.com
 */

public class ChainOfResponsibilityDemoTest {
    @Test
    public void DevelopersHandleRequests() {
        System.out.println("-----A公司有三个级别的工程师-----");
        //初级工程师
        Developer developerC = new AssociateDeveloper();

        //高级工程师
        Developer developerA = new SeniorDeveloper();

        //领域专家
        Developer developerS = new ExpertDeveloper();

        developerC.setNextDeveloper(developerA);
        developerA.setNextDeveloper(developerS);

        //A公司来了个简单的需求
        System.out.println("A公司来了个简单的需求");
        Request requestA = new EasyRequest();
        System.out.println("交给初级工程师处理");
        developerC.handleRequest(requestA);

        System.out.println("----------");

        //A公司来了个比较困难的需求
        System.out.println("A公司来了个比较困难的需求");
        Request requestB = new HardRequest();
        System.out.println("交给初级工程师处理");
        developerC.handleRequest(requestB);

        System.out.println("----------");

        //A公司来了个十分棘手的需求
        System.out.println("A公司来了个十分棘手的需求");
        Request requestC = new VeryHardRequest();
        System.out.println("交给高级工程师处理");
        developerA.handleRequest(requestC);

        System.out.println("----------");

        //A公司又来了一个比较困难的需求
        System.out.println("A公司又来了一个比较困难的需求");
        Request requestD = new HardRequest();
        System.out.println("交给领域专家处理");
        developerS.handleRequest(requestD);
    }


}
