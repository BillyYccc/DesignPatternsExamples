package entity.cpu;

import base.CPU;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class Intel_i7_7700k extends CPU {
    @Override
    public String getCPUBrand() {
        return "Intel";
    }

    @Override
    public String getCPUName() {
        return "i7-7700k";
    }

    @Override
    public double getPrice() {
        return 3000;
    }
}
