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

package com.billyyccc.templatemethoddemotest;

import com.billyyccc.templatemethoddemo.InstallDellU2417H;
import com.billyyccc.templatemethoddemo.InstallDellU2515H;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/6/4.
 * Email: billy112487983@gmail.com
 */

public class TemplateMethodTest {
    @Test
    public void installDellU2515HTest() {
        InstallDellU2515H installDellU2515H = new InstallDellU2515H();
        installDellU2515H.install();
    }

    @Test
    public void installDellU2417HTest() {
        InstallDellU2417H installDellU2417H = new InstallDellU2417H();
        installDellU2417H.install();
    }
}
