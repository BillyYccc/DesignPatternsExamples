package com.billyyccc.bridgedemo.shape;

import com.billyyccc.bridgedemo.border.Border;
import com.billyyccc.bridgedemo.color.Color;

/**
 * Created by Billy Yuan on 2017/5/16.
 * Email: billy112487983@gmail.com
 */

public abstract class Shape {
    protected Color color;
    protected Border border;

    public Shape(Color color, Border border) {
        this.color = color;
        this.border = border;
    }

    abstract public void color();

    abstract public void drawBorder();
}
