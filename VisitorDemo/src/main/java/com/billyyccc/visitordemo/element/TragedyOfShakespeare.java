package com.billyyccc.visitordemo.element;

import com.billyyccc.visitordemo.visitor.TragedyVisitor;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

/* 莎士比亚的悲剧, Element in Pattern */
public abstract class TragedyOfShakespeare {
    public abstract void accept(TragedyVisitor tragedyVisitor);
}
