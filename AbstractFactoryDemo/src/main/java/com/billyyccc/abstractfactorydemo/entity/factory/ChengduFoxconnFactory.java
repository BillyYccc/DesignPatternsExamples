package com.billyyccc.abstractfactorydemo.entity.factory;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

import com.billyyccc.abstractfactorydemo.base.AbstractComputerFactory;
import com.billyyccc.abstractfactorydemo.entity.computer.DellDesktopComputer;
import com.billyyccc.abstractfactorydemo.entity.cpu.Intel_i7_6500u;
import com.billyyccc.abstractfactorydemo.entity.cpu.Intel_i7_7700k;
import com.billyyccc.abstractfactorydemo.entity.gpu.Nvidia_GTX1080;
import com.billyyccc.abstractfactorydemo.base.DesktopComputer;
import com.billyyccc.abstractfactorydemo.base.Laptop;
import com.billyyccc.abstractfactorydemo.entity.computer.AppleLaptop;
import com.billyyccc.abstractfactorydemo.entity.ram.KingstonMemory;

/**
 * 成都富士康电脑工厂，负责生产Apple的笔记本电脑和Dell的台式电脑
 */

public class ChengduFoxconnFactory implements AbstractComputerFactory {
    @Override
    public Laptop createLaptop() {
        return new AppleLaptop(new Intel_i7_6500u(), new Nvidia_GTX1080(), new KingstonMemory());
    }

    @Override
    public DesktopComputer createDesktopComputer() {
        return new DellDesktopComputer(new Intel_i7_7700k(), new Nvidia_GTX1080(), new KingstonMemory());
    }
}
