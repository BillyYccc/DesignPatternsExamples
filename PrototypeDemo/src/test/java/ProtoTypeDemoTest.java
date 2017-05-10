import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class ProtoTypeDemoTest {
    @Test
    public void prototypeDemoDocumentTest() throws CloneNotSupportedException {
        Printer academicPrinter = ConcretePrinter.getInstance();

        Document document1 = (Document) academicPrinter.printFileTemplate("document");
        System.out.println(document1.getInfo());
        System.out.println(document1.toString());

        Document document2 = (Document) academicPrinter.printFileTemplate("document");
        System.out.println(document2.getInfo());
        System.out.println(document2.toString());

        Document document3 = (Document) academicPrinter.printFileTemplate("document");
        System.out.println(document3.getInfo());
        System.out.println(document3.toString());
    }

    @Test
    public void prototypeDemoPaperTest() throws CloneNotSupportedException {
        Printer academicPrinter = ConcretePrinter.getInstance();

        Paper paper1 = (Paper) academicPrinter.printFileTemplate("paper");
        System.out.println(paper1.getInfo());
        System.out.println(paper1.toString());

        Paper paper2 = (Paper) academicPrinter.printFileTemplate("paper");
        System.out.println(paper2.getInfo());
        System.out.println(paper2.toString());

        Paper paper3 = (Paper) academicPrinter.printFileTemplate("paper");
        System.out.println(paper3.getInfo());
        System.out.println(paper3.toString());
    }

    @Test
    public void prototypeDemoReportTest() throws CloneNotSupportedException {
        Printer academicPrinter = ConcretePrinter.getInstance();

        Report report1 = (Report) academicPrinter.printFileTemplate("report");
        System.out.println(report1.getInfo());
        System.out.println(report1.toString());

        Report report2 = (Report) academicPrinter.printFileTemplate("report");
        System.out.println(report2.getInfo());
        System.out.println(report2.toString());

        Report report3 = (Report) academicPrinter.printFileTemplate("report");
        System.out.println(report3.getInfo());
        System.out.println(report3.toString());
    }

}
