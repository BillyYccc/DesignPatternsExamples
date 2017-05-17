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

package com.billyyccc.abstractfactorydemo.base;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

/**
 * 抽象的Laptop类
 */

public abstract class Laptop {
    protected CPU mCpu;
    protected GPU mGpu;
    protected RAM mRam;
    protected String mOs;

    public String getOs() {
        return mOs;
    }

    public void setOs(String Os) {
        mOs = Os;
    }

    protected Laptop(CPU cpu, GPU gpu, RAM ram) {
        mCpu = cpu;
        mGpu = gpu;
        mRam = ram;
    }

    protected abstract CPU getCpu();

    protected abstract GPU getGpu();

    protected abstract RAM getRam();

    //获取总价的方法
    protected abstract double getTotalPrice();

    public String getInfo() {
        return "Laptop CPU Brand : " + this.getCpu().getCPUBrand()
                + "\nLaptop CPU Name : " + this.getCpu().getCPUName()
                + "\nLaptop CPU Price : " + this.getCpu().getPrice()
                + "\nLaptop GPU Brand : " + this.getGpu().getGPUBrand()
                + "\nLaptop GPU Name : " + this.getGpu().getGPUName()
                + "\nLaptop GPU RAM : " + this.getGpu().getGPURAM()
                + "\nLaptop GPU Price : " + this.getGpu().getPrice()
                + "\nLaptop RAM Brand : " + this.getRam().getRAMBrand()
                + "\nLaptop RAM Capacity : " + this.getRam().getRAMCapacity()
                + "\nLaptop RAM Price : " + this.getRam().getPrice()
                + "\nLaptop OS : " + this.getOs()
                + "\nLaptop Total Price : " + this.getTotalPrice();
    }
}
