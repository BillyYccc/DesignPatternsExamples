package objectadapterdemo;

/**
 * Created by Billy Yuan on 2017/5/13.
 * Email: billy112487983@gmail.com
 */

public class DellDisplayMonitor {
    private HdmiPort mHdmiOutputPort;

    public void setHdmiOutputPort(HdmiPort hdmiOutputPort) {
        mHdmiOutputPort = hdmiOutputPort;
    }

    public void display() {
        if (mHdmiOutputPort == null) {
            return;
        }
        System.out.println("戴尔显示器收到HDMI信号，正常显示...");
    }
}
