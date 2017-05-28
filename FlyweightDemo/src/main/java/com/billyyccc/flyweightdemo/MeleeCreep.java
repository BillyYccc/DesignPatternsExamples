package com.billyyccc.flyweightdemo;

/**
 * Created by Billy Yuan on 2017/5/28.
 * Email: billy112487983@gmail.com
 */

/**
 * DOTA2小兵抽象类，Flyweight类
 */
public abstract class MeleeCreep {
    /*内部状态，存在Flyweight对象中并且共享*/
    protected int sightRange;
    protected int attackRange;
    protected int experience;

    /*外部状态，存在client对象中，并且被传递到Flyweight*/
    abstract public void move(double currentX, double currentY, double newX, double newY);
}
