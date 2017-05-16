package com.billyyccc.prototypedemo;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class Document implements FilePrototype {
    @Override
    public Document clone() throws CloneNotSupportedException {
        System.out.println("Cloning com.billyyccc.prototypedemo.Document Object...");
        return (Document) super.clone();
    }

    public String getInfo() {
        return "com.billyyccc.prototypedemo.Document Template...";
    }
}
