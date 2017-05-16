package com.billyyccc.bridgedemo.shape;

import com.billyyccc.bridgedemo.border.Border;
import com.billyyccc.bridgedemo.color.Color;

/**
 * Created by Billy Yuan on 2017/5/16.
 * Email: billy112487983@gmail.com
 */

public class Triangle extends Shape {
    public Triangle(Color color, Border border) {
        super(color, border);
    }

    @Override
    public void drawBorder() {
        System.out.println("Triangle drawing border...");
        border.applyBorder();
    }

    @Override
    public void color() {
        System.out.println("Triangle coloring...");
        color.applyColor();
    }
}
