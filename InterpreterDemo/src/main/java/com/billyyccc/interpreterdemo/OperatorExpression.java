package com.billyyccc.interpreterdemo;

/**
 * Created by Billy Yuan on 2017/6/20.
 * Email: billy112487983@gmail.com
 */

/* 运算符号抽象解释器 */
public abstract class OperatorExpression extends ArithmeticExpression {
    protected ArithmeticExpression expression1, expression2;

    public OperatorExpression(ArithmeticExpression expression1, ArithmeticExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
}
