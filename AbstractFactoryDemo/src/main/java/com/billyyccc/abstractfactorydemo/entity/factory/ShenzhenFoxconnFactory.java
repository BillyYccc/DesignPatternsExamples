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
