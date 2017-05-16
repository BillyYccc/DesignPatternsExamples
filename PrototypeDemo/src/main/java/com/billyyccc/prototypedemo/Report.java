package com.billyyccc.prototypedemo;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class Report implements FilePrototype {
    @Override
    public Report clone() throws CloneNotSupportedException {
        System.out.println("Cloning com.billyyccc.prototypedemo.Report Object...");
        return (Report) super.clone();
    }

    public String getInfo() {
        return "com.billyyccc.prototypedemo.Report Template...";
    }
}
