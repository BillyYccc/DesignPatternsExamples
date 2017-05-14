package objectadapterdemo;

/**
 * Created by Billy Yuan on 2017/5/13.
 * Email: billy112487983@gmail.com
 */

public class SamsungDisplayMonitor {
    private VgaPort mVgaOutputPort;

    public void setVgaOutputPort(VgaPort vgaOutputPort) {
        mVgaOutputPort = vgaOutputPort;
    }

    public void display() {
        if (mVgaOutputPort == null) {
            return;
        }
        System.out.println("三星显示器收到VGA信号，正常显示...");
    }
}
