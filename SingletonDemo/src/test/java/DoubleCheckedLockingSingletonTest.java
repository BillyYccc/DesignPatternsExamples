import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Billy Yuan on 2017/4/26.
 * Email: billy112487983@gmail.com
 */

public class DoubleCheckedLockingSingletonTest implements Runnable {
    @Override
    public void run() {
        DoubleCheckedLockingSingleton s = DoubleCheckedLockingSingleton.getInstance();
        System.out.println(s.toString());
    }

    @Test
    public void doubleCheckedLockingSingletonTest() {
        DoubleCheckedLockingSingletonTest test = new DoubleCheckedLockingSingletonTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        t1.start();
        t2.start();
        t3.start();

        DoubleCheckedLockingSingleton s1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton s2 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton s3 = DoubleCheckedLockingSingleton.getInstance();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        assertThat(s1.toString(), equalTo(s2.toString()));
        assertThat(s2.toString(), equalTo(s3.toString()));
        assertThat(s1.toString(), equalTo(s3.toString()));
    }
}
