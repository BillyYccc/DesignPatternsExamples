package com.billyyccc.singletondemotest;

import com.billyyccc.singletondemo.EagerInitializationSingleton;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Billy Yuan on 2017/4/26.
 * Email: billy112487983@gmail.com
 */

public class EagerInitializationSingletonTest {
    @Test
    public void eagerInitializationSingletonTest() {
        EagerInitializationSingleton s1 = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton s2 = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton s3 = EagerInitializationSingleton.getInstance();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        assertThat(s1.toString(), equalTo(s2.toString()));
        assertThat(s2.toString(), equalTo(s3.toString()));
        assertThat(s1.toString(), equalTo(s3.toString()));
    }
}
