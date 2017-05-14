import objectadapterdemo.*;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/13.
 * Email: billy112487983@gmail.com
 */

public class ObjectAdapterDemoTest {
    @Test
    public void transferByHdmi() {
        //将HDMI接口接上macbook
        MacbookPro macbookPro = new MacbookPro();
        HdmiPort hdmiPort = new HdmiPort();
        macbookPro.setDigitalSignalOutputPort(hdmiPort);

        //将Dell显示器接上HDMI接口
        DellDisplayMonitor dellDisplayMonitor = new DellDisplayMonitor();
        dellDisplayMonitor.setHdmiOutputPort(hdmiPort);

        //连接好后戴尔显示器显示macbook传过来的信号
        macbookPro.transferDigitalSignal();
        dellDisplayMonitor.display();
    }

    @Test
    public void transferByVga() {
        MacbookPro macbookPro = new MacbookPro();
        HdmiPort hdmiPort = new HdmiPort();
        HdmiToVgaObjectAdpater hdmiToVgaObjectAdpater = new HdmiToVgaObjectAdpater();

        //将HDMI接口连上笔记本和Adapter
        macbookPro.setDigitalSignalOutputPort(hdmiPort);
        hdmiToVgaObjectAdpater.connectLaptopWithHdmi(hdmiPort);

        //将Adapter的VGA接口连上三星显示器
        SamsungDisplayMonitor samsungDisplayMonitor = new SamsungDisplayMonitor();
        samsungDisplayMonitor.setVgaOutputPort(hdmiToVgaObjectAdpater);

        //连接好后三星显示器显示macbook传过来的信号
        macbookPro.transferDigitalSignal();
        hdmiToVgaObjectAdpater.transformSignal();
        samsungDisplayMonitor.display();
    }
}
