package com.billyyccc.singletondemotest;

import com.billyyccc.singletondemo.EnumMultiton;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/4/28.
 * Email: billy112487983@gmail.com
 */

public class EnumMultitonTest {
    @Test
    public void enumMultitonTest() {
        EnumMultiton m1 = EnumMultiton.instanceA;
        EnumMultiton m2 = EnumMultiton.instanceB;
        EnumMultiton m3 = EnumMultiton.instanceC;

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());
    }
}
