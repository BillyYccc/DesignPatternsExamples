/**
 * Created by Billy Yuan on 2017/5/13.
 * Email: billy112487983@gmail.com
 */

public class HdmiToVgaAdpater extends VgaPort {
    private HdmiPort mHdmiPort;

    public void connectLaptopWithHdmi(HdmiPort hdmiPort) {
        mHdmiPort = hdmiPort;
    }

    @Override
    public void outputSignal() {
        System.out.println("适配器将HDMI信号转换成VGA信号...");
        mHdmiPort.outputSignal();
    }
}
