package classadapterdemo;

/**
 * Created by Billy Yuan on 2017/5/14.
 * Email: billy112487983@gmail.com
 */

public class HdmiToVgaClassAdapter extends VgaPort implements HdmiPort {
    public void transformSignal() {
        System.out.println("适配器将HDMI信号转换成VGA信号...");
    }

    @Override
    public void outputSignal() {
        System.out.println("HDMI接口输出数字信号...");
    }
}
