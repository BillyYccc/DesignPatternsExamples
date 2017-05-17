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

package com.billyyccc.factorymethoddemotest;

import com.billyyccc.factorymethoddemo.CircleFactory;
import com.billyyccc.factorymethoddemo.Shape;
import com.billyyccc.factorymethoddemo.ShapeFactory;
import com.billyyccc.factorymethoddemo.SquareFactory;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/3.
 * Email: billy112487983@gmail.com
 */

public class FactoryMethodTest {
    @Test
    public void factoryMethodTest() {
        ShapeFactory squareFactory = new SquareFactory();
        ShapeFactory circleFactory = new CircleFactory();
        Shape square1 = squareFactory.createShape("square1");
        Shape square2 = squareFactory.createShape("square2");
        Shape circle1 = circleFactory.createShape("circle1");
        Shape circle2 = circleFactory.createShape("circle2");
        square1.draw();
        square2.draw();
        circle1.draw();
        circle2.draw();
    }
}
