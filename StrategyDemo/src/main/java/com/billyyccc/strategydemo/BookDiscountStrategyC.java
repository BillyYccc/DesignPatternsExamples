package com.billyyccc.strategydemo;

/**
 * Created by Billy Yuan on 2017/6/2.
 * Email: billy112487983@gmail.com
 */

public class BookDiscountStrategyC implements DiscountStrategy {
    @Override
    public void apply() {
        System.out.println("apply BookDiscountStrategyC...");
        System.out.println("计算机类图书满200打六折");
    }
}
