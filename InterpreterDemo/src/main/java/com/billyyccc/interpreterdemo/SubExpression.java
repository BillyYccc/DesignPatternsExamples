package com.billyyccc.interpreterdemo;

/**
 * Created by Billy Yuan on 2017/6/20.
 * Email: billy112487983@gmail.com
 */

/* 减法表达式, NonterminalExpression in Pattern */
public class SubExpression extends OperatorExpression {
    public SubExpression(ArithmeticExpression expression1, ArithmeticExpression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpret() {
        return expression1.interpret() - expression2.interpret();
    }
}
