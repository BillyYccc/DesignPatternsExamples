package base;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

/**
 * 抽象的Laptop类
 */

public abstract class Laptop {
    protected CPU mCpu;
    protected GPU mGpu;
    protected RAM mRam;

    protected Laptop(CPU cpu, GPU gpu, RAM ram) {
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
        return "Laptop CPU Brand : " + this.getCpu().getCPUBrand()
                + "\nLaptop CPU Name : " + this.getCpu().getCPUName()
                + "\nLaptop CPU Price : " + this.getCpu().getPrice()
                + "\nLaptop GPU Brand : " + this.getGpu().getGPUBrand()
                + "\nLaptop GPU Name : " + this.getGpu().getGPUName()
                + "\nLaptop GPU RAM : " + this.getGpu().getGPURAM()
                + "\nLaptop GPU Price : " + this.getGpu().getPrice()
                + "\nLaptop RAM Brand : " + this.getRam().getRAMBrand()
                + "\nLaptop RAM Capacity : " + this.getRam().getRAMCapacity()
                + "\nLaptop RAM Price : " + this.getRam().getPrice()
                + "\nLaptop Total Price : " + this.getTotalPrice();
    }
}
