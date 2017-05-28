package com.billyyccc.flyweightdemo;

/**
 * Created by Billy Yuan on 2017/5/28.
 * Email: billy112487983@gmail.com
 */

/**
 * DOTA2天辉小兵类，ConcreteFlyweight类
 */
public class RadiantMeleeCreep extends MeleeCreep {
    @Override
    public void move(double currentX, double currentY, double newX, double newY) {
        System.out.println("Before move X = " + currentX + ",Y = " + currentY);
        System.out.println("After move X = " + newX + ",Y = " + newY);
    }
}
