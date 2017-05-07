package entity.gpu;

import base.GPU;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class Nvidia_GTX1080 extends GPU {
    @Override
    public String getGPUBrand() {
        return "NVIDIA";
    }

    @Override
    public String getGPUName() {
        return "GTX1080";
    }

    @Override
    public String getGPURAM() {
        return "8G";
    }

    @Override
    public double getPrice() {
        return 5000;
    }
}
