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

package com.billyyccc.bridgedemotest;

import com.billyyccc.adapterdemo.classadapterdemo.*;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/14.
 * Email: billy112487983@gmail.com
 */

public class ClassAdapterDemoTest {
    @Test
    public void transferByHdmi() {
        //将HDMI接口接上macbook
        MacbookPro macbookPro = new MacbookPro();
        HdmiPort hdmiPort = new ConcreteHdmiPort();
        macbookPro.setDigitalSignalOutputPort(hdmiPort);

        //将Dell显示器接上HDMI接口
        DellDisplayMonitor dellDisplayMonitor = new DellDisplayMonitor();
        dellDisplayMonitor.setHdmiOutputPort(hdmiPort);

        //连接好后戴尔显示器显示macbook传过来的信号
        macbookPro.transferDigitalSignal();
        dellDisplayMonitor.display();
    }

    @Test
    public void transferByVga() {
        MacbookPro macbookPro = new MacbookPro();
        HdmiToVgaClassAdapter hdmiToVgaClassAdapter = new HdmiToVgaClassAdapter();

        //将HDMI接口连上笔记本和Adapter
        macbookPro.setDigitalSignalOutputPort(hdmiToVgaClassAdapter);

        //将Adapter的VGA接口连上三星显示器
        SamsungDisplayMonitor samsungDisplayMonitor = new SamsungDisplayMonitor();
        samsungDisplayMonitor.setVgaOutputPort(hdmiToVgaClassAdapter);

        //连接好后三星显示器显示macbook传过来的信号
        macbookPro.transferDigitalSignal();
        hdmiToVgaClassAdapter.transformSignal();
        samsungDisplayMonitor.display();
    }
}
