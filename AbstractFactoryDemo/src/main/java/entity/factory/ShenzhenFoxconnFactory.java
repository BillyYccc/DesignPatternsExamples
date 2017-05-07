package entity.factory;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

import base.AbstractComputerFactory;
import base.DesktopComputer;
import base.Laptop;
import entity.computer.HpLaptop;
import entity.computer.LenovoDesktopComputer;
import entity.cpu.AMD_A8_7650k;
import entity.cpu.AMD_FX_8300;
import entity.gpu.AMD_RX480;
import entity.ram.SamsungMemory;

/**
 * 深圳富士康电脑工厂，负责生产Hp的笔记本电脑和Lenovo的台式电脑
 */


public class ShenzhenFoxconnFactory implements AbstractComputerFactory {
    @Override
    public Laptop createLaptop() {
        return new HpLaptop(new AMD_A8_7650k(), new AMD_RX480(), new SamsungMemory());
    }

    @Override
    public DesktopComputer createDesktopComputer() {
        return new LenovoDesktopComputer(new AMD_FX_8300(), new AMD_RX480(), new SamsungMemory());
    }
}
