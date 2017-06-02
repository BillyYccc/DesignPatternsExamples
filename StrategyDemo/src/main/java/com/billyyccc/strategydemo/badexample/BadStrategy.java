package com.billyyccc.strategydemo.badexample;

/**
 * Created by Billy Yuan on 2017/6/2.
 * Email: billy112487983@gmail.com
 */

public class BadStrategy {
    public static final int STRATEGY_A = 1;
    public static final int STRATEGY_B = 2;
    public static final int STRATEGY_C = 3;

    public void applyStrategy(int type) {
        if (type == STRATEGY_A) {
            System.out.println("apply BookDiscountStrategyA...");
            System.out.println("全场图书打八折...");
        } else if (type == STRATEGY_B) {
            System.out.println("apply BookDiscountStrategyB...");
            System.out.println("全场图书打五折...");
        } else if (type == STRATEGY_C) {
            System.out.println("apply BookDiscountStrategyC...");
            System.out.println("计算机类图书满200打六折");
        }
    }
}
