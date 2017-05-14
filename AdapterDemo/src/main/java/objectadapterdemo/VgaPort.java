package objectadapterdemo;

/**
 * Created by Billy Yuan on 2017/5/13.
 * Email: billy112487983@gmail.com
 */

public class VgaPort implements SignalPort {
    @Override
    public void outputSignal() {
        System.out.println("VGA接口输出模拟信号...");
    }
}
