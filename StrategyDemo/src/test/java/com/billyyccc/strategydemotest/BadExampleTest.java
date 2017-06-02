package com.billyyccc.strategydemotest;

import com.billyyccc.strategydemo.badexample.BadStrategy;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/6/2.
 * Email: billy112487983@gmail.com
 */

public class BadExampleTest {
    BadStrategy badStrategy = new BadStrategy();

    @Test
    public void badStrategyATest() {
        badStrategy.applyStrategy(BadStrategy.STRATEGY_A);
    }

    @Test
    public void badStrategyBTest() {
        badStrategy.applyStrategy(BadStrategy.STRATEGY_B);
    }

    @Test
    public void badStrategyCTest() {
        badStrategy.applyStrategy(BadStrategy.STRATEGY_C);
    }
}
