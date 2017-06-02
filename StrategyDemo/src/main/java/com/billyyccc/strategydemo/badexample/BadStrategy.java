package com.billyyccc.strategydemo.badexample;

import com.billyyccc.strategydemo.BookDiscountStrategyA;
import com.billyyccc.strategydemo.BookDiscountStrategyB;
import com.billyyccc.strategydemo.BookDiscountStrategyC;
import com.billyyccc.strategydemo.DiscountStrategy;

/**
 * Created by Billy Yuan on 2017/6/2.
 * Email: billy112487983@gmail.com
 */

public class BadStrategy {
    public static final int STRATEGY_A = 1;
    public static final int STRATEGY_B = 2;
    public static final int STRATEGY_C = 3;

    public void applyStrategy(int type) {
        DiscountStrategy discountStrategy;
        if (type == STRATEGY_A) {
            discountStrategy = new BookDiscountStrategyA();
            discountStrategy.apply();
        } else if (type == STRATEGY_B) {
            discountStrategy = new BookDiscountStrategyB();
            discountStrategy.apply();
        } else if (type == STRATEGY_C) {
            discountStrategy = new BookDiscountStrategyC();
            discountStrategy.apply();
        }
    }
}
