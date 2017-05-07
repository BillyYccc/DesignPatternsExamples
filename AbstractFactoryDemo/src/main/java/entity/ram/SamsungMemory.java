package entity.ram;

import base.RAM;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class SamsungMemory extends RAM {
    @Override
    public String getRAMBrand() {
        return "Samsung";
    }

    @Override
    public String getRAMCapacity() {
        return "8GB";
    }

    @Override
    public double getPrice() {
        return 300;
    }
}
