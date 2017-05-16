package com.billyyccc.simplefactorydemotest;

import com.billyyccc.simplefactorydemo.Shape;
import com.billyyccc.simplefactorydemo.SimpleFactory;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/5.
 * Email: billy112487983@gmail.com
 */

public class SimpleFactoryTest {
    @Test
    public void simpleFactoryTest() {
        Shape square1 = SimpleFactory.createShape("Square", "square1");
        Shape square2 = SimpleFactory.createShape("square", "square2");
        Shape circle1 = SimpleFactory.createShape("circle", "circle1");
        Shape circle2 = SimpleFactory.createShape("Circle", "circle2");
        square1.draw();
        circle1.draw();
        square2.draw();
        circle2.draw();
    }
}
