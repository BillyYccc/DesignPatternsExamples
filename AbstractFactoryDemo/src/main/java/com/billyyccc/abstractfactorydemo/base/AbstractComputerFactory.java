package com.billyyccc.abstractfactorydemo.base;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

/**
 * 抽象的生产工厂，既能生产台式电脑又能生产笔记本电脑
 */

public interface AbstractComputerFactory {
    DesktopComputer createDesktopComputer();

    Laptop createLaptop();
}
