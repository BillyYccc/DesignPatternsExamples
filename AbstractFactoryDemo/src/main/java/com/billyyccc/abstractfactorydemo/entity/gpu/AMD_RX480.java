package com.billyyccc.abstractfactorydemo.entity.gpu;

import com.billyyccc.abstractfactorydemo.base.GPU;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class AMD_RX480 extends GPU {
    public String getGPUBrand() {
        return "AMD";
    }


    public String getGPUName() {
        return "RX480";
    }


    public String getGPURAM() {
        return "4GB";
    }


    public double getPrice() {
        return 2000;
    }
}
