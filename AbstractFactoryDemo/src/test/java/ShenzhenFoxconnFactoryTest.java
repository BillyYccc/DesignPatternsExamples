import base.AbstractComputerFactory;
import base.DesktopComputer;
import base.Laptop;
import entity.factory.ShenzhenFoxconnFactory;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/7.
 * Email: billy112487983@gmail.com
 */

public class ShenzhenFoxconnFactoryTest {
    @Test
    public void shenzhenFoxconnFactoryTest1() {
        AbstractComputerFactory shenzhenFoxcnnFactory = new ShenzhenFoxconnFactory();
        Laptop hpLaptop = shenzhenFoxcnnFactory.createLaptop();
        System.out.println(hpLaptop.getInfo());
    }

    @Test
    public void shenzhenFoxconnFactoryTest2() {
        AbstractComputerFactory shenzhenFoxcnnFactory = new ShenzhenFoxconnFactory();
        DesktopComputer lenovoPC = shenzhenFoxcnnFactory.createDesktopComputer();
        System.out.println(lenovoPC.getInfo());
    }
}
