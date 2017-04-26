import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Billy Yuan on 2017/4/26.
 * Email: billy112487983@gmail.com
 */

public class LazyInitializationSingletonBTest {
    @Test
    public void lazyInitializationSingletonBTest() {
        LazyInitializationSingletonB s1 = LazyInitializationSingletonB.getInstance();
        LazyInitializationSingletonB s2 = LazyInitializationSingletonB.getInstance();
        LazyInitializationSingletonB s3 = LazyInitializationSingletonB.getInstance();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        assertThat(s1.toString(), equalTo(s2.toString()));
        assertThat(s2.toString(), equalTo(s3.toString()));
        assertThat(s1.toString(), equalTo(s3.toString()));

    }
}
