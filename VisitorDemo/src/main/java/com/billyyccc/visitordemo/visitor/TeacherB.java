package com.billyyccc.visitordemo.visitor;

import com.billyyccc.visitordemo.element.Hamlet;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

/* 剧本读者老师B, ConcreteVisitor in Pattern */
public class TeacherB extends TragedyVisitor {
    @Override
    public void judgeOfHamlet(Hamlet hamlet) {
        System.out.println("老师B眼中的哈姆雷特...");
    }
}
