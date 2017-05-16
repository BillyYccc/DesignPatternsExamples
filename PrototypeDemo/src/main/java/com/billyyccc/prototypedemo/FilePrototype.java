package com.billyyccc.prototypedemo;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public interface FilePrototype extends Cloneable {
    FilePrototype clone() throws CloneNotSupportedException;
}
