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

package com.billyyccc.abstractfactorydemo.entity.factory;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

import com.billyyccc.abstractfactorydemo.base.AbstractComputerFactory;
import com.billyyccc.abstractfactorydemo.base.DesktopComputer;
import com.billyyccc.abstractfactorydemo.entity.computer.AppleDesktopComputer;
import com.billyyccc.abstractfactorydemo.entity.computer.DellLaptop;
import com.billyyccc.abstractfactorydemo.entity.cpu.AMD_A8_7650k;
import com.billyyccc.abstractfactorydemo.entity.cpu.AMD_FX_8300;
import com.billyyccc.abstractfactorydemo.entity.gpu.AMD_RX480;
import com.billyyccc.abstractfactorydemo.entity.ram.SamsungMemory;
import com.billyyccc.abstractfactorydemo.base.Laptop;

/**
 * 深圳富士康电脑工厂，负责生产Hp的笔记本电脑和Lenovo的台式电脑
 */


public class ShenzhenFoxconnFactory implements AbstractComputerFactory {
    @Override
    public Laptop createLaptop() {
        return new DellLaptop(new AMD_A8_7650k(), new AMD_RX480(), new SamsungMemory());
    }

    @Override
    public DesktopComputer createDesktopComputer() {
        return new AppleDesktopComputer(new AMD_FX_8300(), new AMD_RX480(), new SamsungMemory());
    }
}
