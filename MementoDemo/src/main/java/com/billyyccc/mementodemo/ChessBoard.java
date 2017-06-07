/*
 * MIT License
 *
 * Copyright (c) 2017 BillyYuan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.billyyccc.mementodemo;

/**
 * Created by Billy Yuan on 2017/6/7.
 * Email: billy112487983@gmail.com
 */

/* 国际象棋中棋子的棋局*/
public class ChessBoard {
    //代码太多进行省略，只显示王的位置
    private int rowOfBlackKing;
    private char columnOfBlackKing;
    private int rowOfWhiteKing;
    private char columnOfWhiteKing;

    //初始化各个棋子的位置
    public ChessBoard() {
        this.setColumnOfBlackKing('e');
        this.setRowOfBlackKing(8);
        this.setColumnOfWhiteKing('e');
        this.setRowOfWhiteKing(1);
    }

    public void showLayout() {
        System.out.println("当前的棋局[" + "黑棋的王的位置 : " + getColumnOfBlackKing() + getRowOfBlackKing() + ",白棋的王的位置 : " + getColumnOfWhiteKing() + getRowOfWhiteKing() + "]");
    }

    public int getRowOfBlackKing() {
        return rowOfBlackKing;
    }

    public void setRowOfBlackKing(int rowOfBlackKing) {
        this.rowOfBlackKing = rowOfBlackKing;
    }

    public char getColumnOfBlackKing() {
        return columnOfBlackKing;
    }

    public void setColumnOfBlackKing(char columnOfBlackKing) {
        this.columnOfBlackKing = columnOfBlackKing;
    }

    public int getRowOfWhiteKing() {
        return rowOfWhiteKing;
    }

    public void setRowOfWhiteKing(int rowOfWhiteKing) {
        this.rowOfWhiteKing = rowOfWhiteKing;
    }

    public char getColumnOfWhiteKing() {
        return columnOfWhiteKing;
    }

    public void setColumnOfWhiteKing(char columnOfWhiteKing) {
        this.columnOfWhiteKing = columnOfWhiteKing;
    }
}
