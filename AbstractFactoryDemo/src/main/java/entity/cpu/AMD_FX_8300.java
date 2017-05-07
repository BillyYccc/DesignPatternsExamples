package entity.cpu;

import base.CPU;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class AMD_FX_8300 extends CPU {
    @Override
    public String getCPUBrand() {
        return "AMD";
    }

    @Override
    public String getCPUName() {
        return "FX-8300";
    }

    @Override
    public double getPrice() {
        return 800;
    }
}
