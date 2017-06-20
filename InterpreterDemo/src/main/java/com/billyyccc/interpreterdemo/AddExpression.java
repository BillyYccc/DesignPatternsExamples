package com.billyyccc.interpreterdemo;

/**
 * Created by Billy Yuan on 2017/6/20.
 * Email: billy112487983@gmail.com
 */

/* 加法解释器, NonterminalExpression in Pattern */
public class AddExpression extends OperatorExpression {
    public AddExpression(ArithmeticExpression expression1, ArithmeticExpression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpret() {
        return expression1.interpret() + expression2.interpret();
    }
}
