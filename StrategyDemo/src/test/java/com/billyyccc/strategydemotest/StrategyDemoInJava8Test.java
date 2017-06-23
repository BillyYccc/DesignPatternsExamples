package com.billyyccc.strategydemotest;

import com.billyyccc.strategydemo.Discount;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/6/23.
 * Email: billy112487983@gmail.com
 */

public class StrategyDemoInJava8Test {
    @Test
    public void discountStrategyATest() {
        Discount discount = new Discount(() -> {
            System.out.println("apply BookDiscountStrategyA...");
            System.out.println("全场图书打八折...");
        });
        discount.discountBook();
    }

    @Test
    public void discountStrategyBTest() {
        Discount discount = new Discount(() -> {
            System.out.println("apply BookDiscountStrategyB...");
            System.out.println("全场图书打五折...");
        });
        discount.discountBook();
    }

    @Test
    public void discountStrategyCTest() {
        Discount discount = new Discount(() -> {
            System.out.println("apply BookDiscountStrategyC...");
            System.out.println("计算机类图书满200打六折");
        });
        discount.discountBook();
    }

}
