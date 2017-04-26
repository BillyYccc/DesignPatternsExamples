import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Billy Yuan on 2017/4/26.
 * Email: billy112487983@gmail.com
 */

public class EnumSingletonTest {
    @Test
    public void enumSingletonTest(){
        EnumSingleton s1 = EnumSingleton.INSTANCE;
        EnumSingleton s2 = EnumSingleton.INSTANCE;
        s1.doSomething();
        System.out.println(s1.toString());
        s2.doSomething();
        System.out.println(s2.toString());
        assertThat(s1.toString(), equalTo(s2.toString()));
    }
}
