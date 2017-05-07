package entity.computer;

import base.CPU;
import base.DesktopComputer;
import base.GPU;
import base.RAM;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class DellDesktopComputer extends DesktopComputer {
    public DellDesktopComputer(CPU cpu, GPU gpu, RAM ram) {
        super(cpu, gpu, ram);
        this.setOs("Windows");
    }

    @Override
    public CPU getCpu() {
        return mCpu;
    }

    @Override
    public GPU getGpu() {
        return mGpu;
    }

    @Override
    public RAM getRam() {
        return mRam;
    }

    @Override
    public double getTotalPrice() {
        return mCpu.getPrice() + mGpu.getPrice() + mRam.getPrice();
    }
}
