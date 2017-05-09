import deepcopy.Magazine;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class DeepCopyTest {
    @Test
    public void deepCopyInSerializationTest() throws IOException, ClassNotFoundException {
        deepcopy.Magazine magazine1 = new deepcopy.Magazine("Times", 50);
        deepcopy.Magazine magazine2 = magazine1.deepClone();

        compareCopyMethod(magazine1, magazine2);
    }

    public static void compareCopyMethod(Magazine magazine1, Magazine magazine2) {
        if ((magazine1.getPage() == magazine2.getPage())
                && (magazine1.getName().equals(magazine2.getName()))
                && (magazine1.getName() == magazine2.getName())) {
            System.out.println("本次拷贝是浅拷贝的...");
        } else {
            System.out.println("本次拷贝是深拷贝的...");
        }
    }
}
