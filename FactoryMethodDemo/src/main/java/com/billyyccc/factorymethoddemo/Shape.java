package com.billyyccc.factorymethoddemo;

/**
 * Created by Billy Yuan on 2017/5/3.
 * Email: billy112487983@gmail.com
 */

public abstract class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void draw();
}
