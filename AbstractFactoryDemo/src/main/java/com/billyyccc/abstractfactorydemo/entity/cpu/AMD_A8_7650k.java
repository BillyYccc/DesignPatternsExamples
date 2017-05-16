package com.billyyccc.abstractfactorydemo.entity.cpu;

import com.billyyccc.abstractfactorydemo.base.CPU;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class AMD_A8_7650k extends CPU {
    @Override
    public String getCPUBrand() {
        return "AMD";
    }

    @Override
    public String getCPUName() {
        return "A8-7650k";
    }

    @Override
    public double getPrice() {
        return 500;
    }
}
