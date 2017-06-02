package com.billyyccc.strategydemo;

/**
 * Created by Billy Yuan on 2017/6/2.
 * Email: billy112487983@gmail.com
 */

public class BookDiscountStrategyB implements DiscountStrategy {
    @Override
    public void apply() {
        System.out.println("apply BookDiscountStrategyB...");
        System.out.println("全场图书打五折...");
    }
}
