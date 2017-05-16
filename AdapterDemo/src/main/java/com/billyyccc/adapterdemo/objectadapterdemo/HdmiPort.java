package com.billyyccc.adapterdemo.objectadapterdemo;

/**
 * Created by Billy Yuan on 2017/5/13.
 * Email: billy112487983@gmail.com
 */

public class HdmiPort implements SignalPort {
    @Override
    public void outputSignal() {
        System.out.println("HDMI接口输出数字信号...");
    }
}
