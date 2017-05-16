package com.billyyccc.adapterdemo.classadapterdemo;

/**
 * Created by Billy Yuan on 2017/5/14.
 * Email: billy112487983@gmail.com
 */

public class ConcreteHdmiPort implements HdmiPort {
    @Override
    public void outputSignal() {
        System.out.println("HDMI接口输出数字信号...");
    }
}
