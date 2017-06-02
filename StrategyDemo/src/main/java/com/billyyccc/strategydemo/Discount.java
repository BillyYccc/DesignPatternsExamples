package com.billyyccc.strategydemo;

/**
 * Created by Billy Yuan on 2017/6/2.
 * Email: billy112487983@gmail.com
 */

public class Discount {
    private DiscountStrategy discountStrategy;

    public Discount(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void discountBook() {
        discountStrategy.apply();
    }
}
