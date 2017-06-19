package com.billyyccc.visitordemo.element;

import com.billyyccc.visitordemo.visitor.TragedyVisitor;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

/* 《哈姆雷特》, ConcreteElement in Pattern */
public class Hamlet extends TragedyOfShakespeare {
    @Override
    public void accept(TragedyVisitor tragedyVisitor) {
        tragedyVisitor.judgeOfHamlet(this);
    }
}
