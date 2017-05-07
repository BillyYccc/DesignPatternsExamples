package base;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

/**
 * 抽象的Computer类
 */

public abstract class DesktopComputer {
    protected CPU mCpu;
    protected GPU mGpu;
    protected RAM mRam;

    protected DesktopComputer(CPU cpu, GPU gpu, RAM ram) {
        mCpu = cpu;
        mGpu = gpu;
        mRam = ram;
    }

    protected abstract CPU getCpu();

    protected abstract GPU getGpu();

    protected abstract RAM getRam();

    //获取总价的方法
    protected abstract double getTotalPrice();

    public String getInfo() {
        return "DesktopComputer CPU Brand : " + this.getCpu().getCPUBrand()
                + "\nDesktopComputer CPU Name : " + this.getCpu().getCPUName()
                + "\nDesktopComputer CPU Price : " + this.getCpu().getPrice()
                + "\nDesktopComputer GPU Brand : " + this.getGpu().getGPUBrand()
                + "\nDesktopComputer GPU Name : " + this.getGpu().getGPUName()
                + "\nDesktopComputer GPU RAM : " + this.getGpu().getGPURAM()
                + "\nDesktopComputer GPU Price : " + this.getGpu().getPrice()
                + "\nDesktopComputer RAM Brand : " + this.getRam().getRAMBrand()
                + "\nDesktopComputer RAM Capacity : " + this.getRam().getRAMCapacity()
                + "\nDesktopComputer RAM Price : " + this.getRam().getPrice()
                + "\nDesktopComputer Total Price : " + this.getTotalPrice();
    }
}
