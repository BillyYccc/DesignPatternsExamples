package com.billyyccc.strategydemo;

/**
 * Created by Billy Yuan on 2017/6/2.
 * Email: billy112487983@gmail.com
 */

public class BookDiscountStrategyA implements DiscountStrategy {
    @Override
    public void apply() {
        System.out.println("apply BookDiscountStrategyA...");
        System.out.println("全场图书打八折...");
    }
}
