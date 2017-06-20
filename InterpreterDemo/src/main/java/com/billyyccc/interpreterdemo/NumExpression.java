package com.billyyccc.interpreterdemo;

/**
 * Created by Billy Yuan on 2017/6/20.
 * Email: billy112487983@gmail.com
 */

/* 数字解释器, TerminalExpression in Pattern */
public class NumExpression extends ArithmeticExpression {
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
