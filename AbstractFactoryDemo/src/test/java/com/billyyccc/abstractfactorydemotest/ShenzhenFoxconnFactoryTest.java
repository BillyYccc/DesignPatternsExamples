package com.billyyccc.abstractfactorydemotest;

import com.billyyccc.abstractfactorydemo.base.AbstractComputerFactory;
import com.billyyccc.abstractfactorydemo.base.DesktopComputer;
import com.billyyccc.abstractfactorydemo.base.Laptop;
import com.billyyccc.abstractfactorydemo.entity.factory.ShenzhenFoxconnFactory;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class ShenzhenFoxconnFactoryTest {
    @Test
    public void shenzhenFoxconnFactoryTest1() {
        AbstractComputerFactory shenzhenFoxcnnFactory = new ShenzhenFoxconnFactory();
        Laptop dellLaptop = shenzhenFoxcnnFactory.createLaptop();
        System.out.println(dellLaptop.getInfo());
    }

    @Test
    public void shenzhenFoxconnFactoryTest2() {
        AbstractComputerFactory shenzhenFoxcnnFactory = new ShenzhenFoxconnFactory();
        DesktopComputer applePC = shenzhenFoxcnnFactory.createDesktopComputer();
        System.out.println(applePC.getInfo());
    }
}
