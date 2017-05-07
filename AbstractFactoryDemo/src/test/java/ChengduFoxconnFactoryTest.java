import base.AbstractComputerFactory;
import base.DesktopComputer;
import base.Laptop;
import entity.factory.ChengduFoxconnFactory;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class ChengduFoxconnFactoryTest {
    @Test
    public void chengduFoxconnFactoryTest1() {
        AbstractComputerFactory chengduFoxconnFactory = new ChengduFoxconnFactory();
        Laptop macbookPro = chengduFoxconnFactory.createLaptop();
        System.out.println(macbookPro.getInfo());
    }

    @Test
    public void chengduFoxconnFactoryTest2() {
        AbstractComputerFactory chengduFoxconnFactory = new ChengduFoxconnFactory();
        DesktopComputer dellPC = chengduFoxconnFactory.createDesktopComputer();
        System.out.println(dellPC.getInfo());
    }
}
