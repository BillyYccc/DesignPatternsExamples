package entity.factory;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

import base.AbstractComputerFactory;
import base.DesktopComputer;
import base.Laptop;
import entity.computer.AppleLaptop;
import entity.computer.DellDesktopComputer;
import entity.cpu.Intel_i7_6500u;
import entity.cpu.Intel_i7_7700k;
import entity.gpu.Nvidia_GTX1080;
import entity.ram.KingstonMemory;

/**
 * 成都富士康电脑工厂，负责生产Apple的笔记本电脑和Dell的台式电脑
 */

public class ChengduFoxconnFactory extends AbstractComputerFactory {
    @Override
    public Laptop createLaptop() {
        return new AppleLaptop(new Intel_i7_6500u(), new Nvidia_GTX1080(), new KingstonMemory());
    }

    @Override
    public DesktopComputer createDesktopComputer() {
        return new DellDesktopComputer(new Intel_i7_7700k(), new Nvidia_GTX1080(), new KingstonMemory());
    }
}
