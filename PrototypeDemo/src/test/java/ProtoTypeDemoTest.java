import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class ProtoTypeDemoTest {
    @Test
    public void protoTest() throws CloneNotSupportedException {
        PrinterFactory academicPrinterFactory = new ConcretePrinterFactory();
        Document document1 = (Document) academicPrinterFactory.printFileTemplate("document");
        System.out.println(document1.getInfo());
        System.out.println(document1.toString());

        Document document2 = (Document) academicPrinterFactory.printFileTemplate("document");
        System.out.println(document2.getInfo());
        System.out.println(document2.toString());
    }

}
