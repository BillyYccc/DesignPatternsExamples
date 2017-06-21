package com.billyyccc.interpreterdemo;

import java.util.Stack;

/**
 * Created by Billy Yuan on 2017/6/20.
 * Email: billy112487983@gmail.com
 */

public class Calculator {
    private Stack<ArithmeticExpression> expressionStack = new Stack<>();

    public Calculator(String expression) {
        ArithmeticExpression expression1;
        ArithmeticExpression expression2;

        String[] elements = expression.split(" ");

        for (int i = 0; i < elements.length; i++) {
            switch (elements[i].charAt(0)) {
                case '+':
                    expression1 = expressionStack.pop();
                    expression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    expressionStack.push(new AddExpression(expression1, expression2));
                    break;
                case '-':
                    expression1 = expressionStack.pop();
                    expression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    expressionStack.push(new SubExpression(expression1, expression2));
                    break;
                default:
                    expressionStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    public int calculate() {
        return expressionStack.pop().interpret();
    }
}
