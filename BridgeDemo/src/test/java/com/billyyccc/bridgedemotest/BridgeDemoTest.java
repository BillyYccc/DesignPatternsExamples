/*
 * MIT License
 *
 * Copyright (c) 2017 BillyYuan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.billyyccc.bridgedemotest;

import com.billyyccc.bridgedemo.border.DottedLineBorder;
import com.billyyccc.bridgedemo.border.SolidLineBorder;
import com.billyyccc.bridgedemo.color.Blue;
import com.billyyccc.bridgedemo.color.Green;
import com.billyyccc.bridgedemo.color.Red;
import com.billyyccc.bridgedemo.shape.Round;
import com.billyyccc.bridgedemo.shape.Square;
import com.billyyccc.bridgedemo.shape.Triangle;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/16.
 * Email: billy112487983@gmail.com
 */

public class BridgeDemoTest {
    @Test
    public void triangleTest() {
        //蓝色实线边框三角形
        System.out.println("开始绘制...蓝色实线边框三角形");
        Triangle blueSolidLineTriangle = new Triangle(new Blue(), new SolidLineBorder());
        blueSolidLineTriangle.drawBorder();
        blueSolidLineTriangle.color();
        System.out.println("-------------------Shape Completed-------------------");

        //绿色实线边框三角形
        System.out.println("开始绘制...绿色实线边框三角形");
        Triangle greenSolidLineTriangle = new Triangle(new Green(), new SolidLineBorder());
        greenSolidLineTriangle.drawBorder();
        greenSolidLineTriangle.color();
        System.out.println("-------------------Shape Completed-------------------");

        //红色实线边框三角形
        System.out.println("开始绘制...红色实线边框三角形");
        Triangle redSolidLineTriangle = new Triangle(new Red(), new SolidLineBorder());
        redSolidLineTriangle.drawBorder();
        redSolidLineTriangle.color();
        System.out.println("-------------------Shape Completed-------------------");

        //蓝色虚线边框三角形
        System.out.println("开始绘制...蓝色虚线边框三角形");
        Triangle blueDottedLineTriangle = new Triangle(new Blue(), new DottedLineBorder());
        blueDottedLineTriangle.drawBorder();
        blueDottedLineTriangle.color();
        System.out.println("-------------------Shape Completed-------------------");

        //绿色虚线边框三角形
        System.out.println("开始绘制...绿色虚线边框三角形");
        Triangle greenDottedLineTriangle = new Triangle(new Green(), new DottedLineBorder());
        greenDottedLineTriangle.drawBorder();
        greenDottedLineTriangle.color();
        System.out.println("-------------------Shape Completed-------------------");

        //红色虚线边框三角形
        System.out.println("开始绘制...红色虚线边框三角形");
        Triangle redDottedLineTriangle = new Triangle(new Red(), new DottedLineBorder());
        redDottedLineTriangle.drawBorder();
        redDottedLineTriangle.color();
        System.out.println("-------------------Shape Completed-------------------");
    }

    @Test
    public void squareTest() {
        //蓝色实线边框正方形
        System.out.println("开始绘制...蓝色实线边框正方形");
        Square blueSolidLineSquare = new Square(new Blue(), new SolidLineBorder());
        blueSolidLineSquare.drawBorder();
        blueSolidLineSquare.color();
        System.out.println("-------------------Shape Completed-------------------");

        //绿色实线边框正方形
        System.out.println("开始绘制...绿色实线边框正方形");
        Square greenSolidLineSquare = new Square(new Green(), new SolidLineBorder());
        greenSolidLineSquare.drawBorder();
        greenSolidLineSquare.color();
        System.out.println("-------------------Shape Completed-------------------");

        //红色实线边框正方形
        System.out.println("开始绘制...红色实线边框正方形");
        Square redSolidLineSquare = new Square(new Red(), new SolidLineBorder());
        redSolidLineSquare.drawBorder();
        redSolidLineSquare.color();
        System.out.println("-------------------Shape Completed-------------------");

        //蓝色虚线边框正方形
        System.out.println("开始绘制...蓝色虚线边框正方形");
        Square blueDottedLineSquare = new Square(new Blue(), new DottedLineBorder());
        blueDottedLineSquare.drawBorder();
        blueDottedLineSquare.color();
        System.out.println("-------------------Shape Completed-------------------");

        //绿色虚线边框正方形
        System.out.println("开始绘制...绿色虚线边框正方形");
        Square greenDottedLineSquare = new Square(new Green(), new DottedLineBorder());
        greenDottedLineSquare.drawBorder();
        greenDottedLineSquare.color();
        System.out.println("-------------------Shape Completed-------------------");

        //红色虚线边框正方形
        System.out.println("开始绘制...红色虚线边框正方形");
        Square redDottedLineSquare = new Square(new Red(), new DottedLineBorder());
        redDottedLineSquare.drawBorder();
        redDottedLineSquare.color();
        System.out.println("-------------------Shape Completed-------------------");
    }

    @Test
    public void roundTest() {
        //蓝色实线边框圆形
        System.out.println("开始绘制...蓝色实线边框圆形");
        Round blueSolidLineRound = new Round(new Blue(), new SolidLineBorder());
        blueSolidLineRound.drawBorder();
        blueSolidLineRound.color();
        System.out.println("-------------------Shape Completed-------------------");

        //绿色实线边框圆形
        System.out.println("开始绘制...绿色实线边框圆形");
        Round greenSolidLineRound = new Round(new Green(), new SolidLineBorder());
        greenSolidLineRound.drawBorder();
        greenSolidLineRound.color();
        System.out.println("-------------------Shape Completed-------------------");

        //红色实线边框圆形
        System.out.println("开始绘制...红色实线边框圆形");
        Round redSolidLineRound = new Round(new Red(), new SolidLineBorder());
        redSolidLineRound.drawBorder();
        redSolidLineRound.color();
        System.out.println("-------------------Shape Completed-------------------");

        //蓝色虚线边框圆形
        System.out.println("开始绘制...蓝色虚线边框圆形");
        Round blueDottedLineRound = new Round(new Blue(), new DottedLineBorder());
        blueDottedLineRound.drawBorder();
        blueDottedLineRound.color();
        System.out.println("-------------------Shape Completed-------------------");

        //绿色虚线边框圆形
        System.out.println("开始绘制...绿色虚线边框圆形");
        Round greenDottedLineRound = new Round(new Green(), new DottedLineBorder());
        greenDottedLineRound.drawBorder();
        greenDottedLineRound.color();
        System.out.println("-------------------Shape Completed-------------------");

        //红色虚线边框圆形
        System.out.println("开始绘制...红色虚线边框圆形");
        Round redDottedLineRound = new Round(new Red(), new DottedLineBorder());
        redDottedLineRound.drawBorder();
        redDottedLineRound.color();
        System.out.println("-------------------Shape Completed-------------------");
    }
}
