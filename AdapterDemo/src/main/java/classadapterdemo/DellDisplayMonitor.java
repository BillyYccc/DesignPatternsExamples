package classadapterdemo;

/**
 * Created by Billy Yuan on 2017/5/14.
 * Email: billy112487983@gmail.com
 */

public class DellDisplayMonitor {
    private HdmiPort mHdmiPort;

    public void setHdmiOutputPort(HdmiPort hdmiPort) {
        mHdmiPort = hdmiPort;
    }

    public void display() {
        if (mHdmiPort == null) {
            return;
        }
        System.out.println("戴尔显示器收到HDMI信号，正常显示...");
    }
}
