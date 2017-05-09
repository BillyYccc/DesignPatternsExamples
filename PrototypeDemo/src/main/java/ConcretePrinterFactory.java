import java.util.HashMap;
import java.util.Map;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class ConcretePrinterFactory implements PrinterFactory {
    /**
     * 使用单例构造ConcretePrinterFactory
     * Use Singleton to construct ConcretePrinterFactory
     */
    private ConcretePrinterFactory() {

    }

    public static class ConcretePrinterFactoryHolder {
        private static final ConcretePrinterFactory INSTANCE = new ConcretePrinterFactory();
    }

    public static ConcretePrinterFactory getInstance() {
        return ConcretePrinterFactoryHolder.INSTANCE;
    }

    private static Map<String, FilePrototype> filePrototypeMap = new HashMap();

    static {
        filePrototypeMap.put(ModelType.DOCUMENT, new Document());
        filePrototypeMap.put(ModelType.PAPER, new Paper());
        filePrototypeMap.put(ModelType.REPORT, new Report());
    }

    @Override
    public FilePrototype printFileTemplate(String type) throws CloneNotSupportedException {
        return filePrototypeMap.get(type).clone();
    }

}
