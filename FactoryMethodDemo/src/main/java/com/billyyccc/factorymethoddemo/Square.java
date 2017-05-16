package com.billyyccc.factorymethoddemo;

/**
 * Created by Billy Yuan on 2017/5/3.
 * Email: billy112487983@gmail.com
 */

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a square..." + name);
    }

    public Square(String name) {
        super(name);
    }
}
