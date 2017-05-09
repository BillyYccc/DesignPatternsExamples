import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class ProtoTypeDemoTest {
    @Test
    public void prototypeDemoDocumentTest() throws CloneNotSupportedException {
        PrinterFactory academicPrinterFactory = ConcretePrinterFactory.getInstance();

        Document document1 = (Document) academicPrinterFactory.printFileTemplate("document");
        System.out.println(document1.getInfo());
        System.out.println(document1.toString());

        Document document2 = (Document) academicPrinterFactory.printFileTemplate("document");
        System.out.println(document2.getInfo());
        System.out.println(document2.toString());

        Document document3 = (Document) academicPrinterFactory.printFileTemplate("document");
        System.out.println(document3.getInfo());
        System.out.println(document3.toString());
    }

    @Test
    public void prototypeDemoPaperTest() throws CloneNotSupportedException {
        PrinterFactory academicPrinterFactory = ConcretePrinterFactory.getInstance();

        Paper paper1 = (Paper) academicPrinterFactory.printFileTemplate("paper");
        System.out.println(paper1.getInfo());
        System.out.println(paper1.toString());

        Paper paper2 = (Paper) academicPrinterFactory.printFileTemplate("paper");
        System.out.println(paper2.getInfo());
        System.out.println(paper2.toString());

        Paper paper3 = (Paper) academicPrinterFactory.printFileTemplate("paper");
        System.out.println(paper3.getInfo());
        System.out.println(paper3.toString());
    }

    @Test
    public void prototypeDemoReportTest() throws CloneNotSupportedException {
        PrinterFactory academicPrinterFactory = ConcretePrinterFactory.getInstance();

        Report report1 = (Report) academicPrinterFactory.printFileTemplate("report");
        System.out.println(report1.getInfo());
        System.out.println(report1.toString());

        Report report2 = (Report) academicPrinterFactory.printFileTemplate("report");
        System.out.println(report2.getInfo());
        System.out.println(report2.toString());

        Report report3 = (Report) academicPrinterFactory.printFileTemplate("report");
        System.out.println(report3.getInfo());
        System.out.println(report3.toString());
    }

}
