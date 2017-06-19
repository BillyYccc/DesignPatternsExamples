package com.billyyccc.visitordemo.visitor;

import com.billyyccc.visitordemo.element.Hamlet;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

/* 剧本读者老师A, ConcreteVisitor in Pattern */
public class TeacherA extends TragedyVisitor {
    @Override
    public void judgeOfHamlet(Hamlet hamlet) {
        System.out.println("老师A眼中的哈姆雷特...");
    }
}
