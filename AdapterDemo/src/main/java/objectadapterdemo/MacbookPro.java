package objectadapterdemo;

/**
 * Created by Billy Yuan on 2017/5/13.
 * Email: billy112487983@gmail.com
 */

public class MacbookPro {
    private HdmiPort mHdmiPort;

    public MacbookPro() {
    }

    public void setDigitalSignalOutputPort(HdmiPort hdmiPort) {
        mHdmiPort = hdmiPort;
    }

    public void transferDigitalSignal() {
        mHdmiPort.outputSignal();
    }
}