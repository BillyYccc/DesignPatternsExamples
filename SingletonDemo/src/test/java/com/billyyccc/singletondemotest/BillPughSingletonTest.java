package com.billyyccc.singletondemotest;

import com.billyyccc.singletondemo.BillPughSingleton;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Billy Yuan on 2017/4/26.
 * Email: billy112487983@gmail.com
 */

public class BillPughSingletonTest implements Runnable {
    @Override
    public void run() {
        BillPughSingleton s = BillPughSingleton.getInstance();
        System.out.println(s.toString());
    }

    @Test
    public void billPughSingletonTest() {
        BillPughSingletonTest test = new BillPughSingletonTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        t1.start();
        t2.start();
        t3.start();

        BillPughSingleton s1 = BillPughSingleton.getInstance();
        BillPughSingleton s2 = BillPughSingleton.getInstance();

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        assertThat(s1.toString(), equalTo(s2.toString()));
    }
}
