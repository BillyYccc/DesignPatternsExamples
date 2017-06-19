package com.billyyccc.visitordemo.visitor;

import com.billyyccc.visitordemo.element.Hamlet;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

/* 剧本读者，Visitor in Pattern */
public abstract class TragedyVisitor {
    public abstract void judgeOfHamlet(Hamlet hamlet);
}
