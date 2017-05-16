package com.billyyccc.factorymethoddemo;

/**
 * Created by Billy Yuan on 2017/5/3.
 * Email: billy112487983@gmail.com
 */

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a circle..." + name);
    }

    public Circle(String name) {
        super(name);
    }
}
