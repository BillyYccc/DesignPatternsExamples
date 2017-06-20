package com.billyyccc.interpreterdemotest;

import com.billyyccc.interpreterdemo.Calculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Billy Yuan on 2017/6/20.
 * Email: billy112487983@gmail.com
 */

public class CalculatorDemoTest {
    @Test
    public void calculatorTest() {
        Calculator calculator = new Calculator("15 + 20 + 30 - 10 - 11");
        assertThat(calculator.calculate()).isEqualTo(44);
    }
}
