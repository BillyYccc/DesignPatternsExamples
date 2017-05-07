package entity.cpu;

import base.CPU;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class Intel_i7_6500u extends CPU {
    @Override
    public String getCPUBrand() {
        return "Intel";
    }

    @Override
    public String getCPUName() {
        return "i7-6500u";
    }

    @Override
    public double getPrice() {
        return 2500;
    }
}
