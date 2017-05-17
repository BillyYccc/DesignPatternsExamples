/*
 * MIT License
 *
 * Copyright (c) 2017 BillyYuan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.billyyccc.singletondemotest;

import com.billyyccc.singletondemo.BillPughSingleton;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Billy Yuan on 2017/4/26.
 * Email: billy112487983@gmail.com
 */

public class BillPughSingletonTest implements Runnable {
    @Override
    public void run() {
        BillPughSingleton s = BillPughSingleton.getInstance();
        System.out.println(s.toString());
    }

    @Test
    public void billPughSingletonTest() {
        BillPughSingletonTest test = new BillPughSingletonTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        t1.start();
        t2.start();
        t3.start();

        BillPughSingleton s1 = BillPughSingleton.getInstance();
        BillPughSingleton s2 = BillPughSingleton.getInstance();

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        assertThat(s1.toString(), equalTo(s2.toString()));
    }
}
