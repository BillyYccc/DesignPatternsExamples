package com.billyyccc.abstractfactorydemo.entity.ram;

import com.billyyccc.abstractfactorydemo.base.RAM;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class KingstonMemory extends RAM {
    @Override
    public String getRAMBrand() {
        return "Kingston";
    }

    @Override
    public String getRAMCapacity() {
        return "8GB";
    }

    @Override
    public double getPrice() {
        return 350;
    }
}
