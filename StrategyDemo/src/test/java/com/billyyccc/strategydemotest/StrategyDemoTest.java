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

package com.billyyccc.strategydemotest;

import com.billyyccc.strategydemo.*;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/6/1.
 * Email: billy112487983@gmail.com
 */

public class StrategyDemoTest {
    @Test
    public void discountStrategyATest() {
        DiscountStrategy strategyA = new BookDiscountStrategyA();
        Discount discount = new Discount(strategyA);
        discount.discountBook();
    }

    @Test
    public void discountStrategyBTest() {
        DiscountStrategy strategyB = new BookDiscountStrategyB();
        Discount discount = new Discount(strategyB);
        discount.discountBook();
    }

    @Test
    public void discountStrategyCTest() {
        DiscountStrategy strategyC = new BookDiscountStrategyC();
        Discount discount = new Discount(strategyC);
        discount.discountBook();
    }
}
